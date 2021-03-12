package com.patuli.angularDemo.dto.response;

import com.patuli.angularDemo.repository.Entity.Friend;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FriendResponseDto {
    Friend friend;

    List<Friend> friendList;
}
