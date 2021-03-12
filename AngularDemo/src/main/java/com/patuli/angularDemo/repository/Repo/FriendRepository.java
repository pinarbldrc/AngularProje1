package com.patuli.angularDemo.repository.Repo;

import com.patuli.angularDemo.repository.Entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FriendRepository extends JpaRepository<Friend,Integer> {
}
