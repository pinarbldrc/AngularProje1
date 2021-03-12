package com.patuli.angularDemo.controller;

import com.patuli.angularDemo.dto.request.FriendRequestDto;
import com.patuli.angularDemo.repository.Entity.Friend;
import com.patuli.angularDemo.service.impl.FriendServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/friend")
@CrossOrigin(origins = "http://localhost:4200")
public class FriendController {

    @Autowired
    FriendServiceImpl friendService;

    @GetMapping("/getFriend/{id}")
    @CrossOrigin
    public ResponseEntity<FriendRequestDto> getFriend(@PathVariable int id){
        return ResponseEntity.ok(friendService.getFriend(id));
    }
    @GetMapping("/getAllFriends")
    @CrossOrigin
    public ResponseEntity<List<Friend>> getAllFriends(){
        return ResponseEntity.ok(friendService.getAll());
    }

    @PostMapping("/addFriend")
    @CrossOrigin
    public ResponseEntity<FriendRequestDto> addFriend(@RequestBody FriendRequestDto friendRequestDto){
        System.out.println("geleefdghjkjlkDFGHJKLŞİRTYUIOP");
        return ResponseEntity.ok(friendService.addFriend(friendRequestDto));
    }

    @PutMapping("/updateFriend/{id}")
    public ResponseEntity<FriendRequestDto> updateFriend(@PathVariable int id,@RequestBody FriendRequestDto friendRequestDto){
        return ResponseEntity.ok(friendService.updateFriend(id,friendRequestDto));
    }

    @DeleteMapping(value = "/deleteFriend/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Void> deleteFriend(@PathVariable int id){
        System.out.println("njkvflögşi");
        friendService.deleteFriendRequest(id);
        return ResponseEntity.ok().build();
    }


    @PostMapping(value ="/add2Friend")
    @CrossOrigin
    public ResponseEntity<Friend> add2Friend(@RequestBody Friend friend){
        System.out.println("njkvflögşi");
        System.out.println(friend.getId());

        return  ResponseEntity.ok(friendService.addFRiend(friend));


    }

}
