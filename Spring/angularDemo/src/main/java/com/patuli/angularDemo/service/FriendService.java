package com.patuli.angularDemo.service;

import com.patuli.angularDemo.dto.request.FriendRequestDto;
import com.patuli.angularDemo.repository.Entity.Friend;

import java.util.List;

public interface FriendService {

    FriendRequestDto getFriend(int id);

    public List<Friend> getAll();

    FriendRequestDto addFriend(FriendRequestDto friendRequestDto);

    void deleteFriendRequest(int id);

    FriendRequestDto updateFriend(int id,FriendRequestDto friendRequestDto);

}
