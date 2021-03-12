package com.patuli.angularDemo.service.impl;

import com.patuli.angularDemo.dto.request.FriendRequestDto;
import com.patuli.angularDemo.mapper.FriendMapper;
import com.patuli.angularDemo.repository.Entity.Friend;
import com.patuli.angularDemo.repository.Repo.FriendRepository;
import com.patuli.angularDemo.service.FriendService;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class FriendServiceImpl implements FriendService {

    @Autowired
    FriendRepository friendRepository;

    @Autowired
    FriendMapper friendMapper;



    @Override
    public FriendRequestDto getFriend(int id) {
        Friend friend=friendRepository.findById(id).get();
        FriendRequestDto friendRequestDto=friendMapper.toFriendRequestDto(friend);
        return friendRequestDto;

    }

    @Override
    public List<Friend> getAll() {

        return friendRepository.findAll();
        /*return Response
                 .
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .header("Access-Control-Max-Age", "1209600")
                .entity(friendRepository.findAll())
                .build();

         */

    }


    @Override
    public FriendRequestDto addFriend(FriendRequestDto friendRequestDto) {
       Friend friend=friendMapper.toFriend(friendRequestDto);
        System.out.println(friend.getFirstname());
         friend= friendRepository.save(friend);
        friendRequestDto.setId(friend.getId());
        return friendRequestDto;
    }

    @Override
    public void deleteFriendRequest(int id) {

        Friend friend=friendRepository.findById(id).get();
        friendRepository.delete(friend);


    }

    @Override
    public FriendRequestDto updateFriend(int id, FriendRequestDto friendRequestDto) {

        Friend friend=friendRepository.findById(id).get();

        friend=friendMapper.toFriend(friendRequestDto);
        friendRepository.save(friend);


        return friendRequestDto=friendMapper.toFriendRequestDto(friendRepository.save(friend));
    }

    public  Friend addFRiend(Friend friend){
        return friendRepository.save(friend);
    }
}
