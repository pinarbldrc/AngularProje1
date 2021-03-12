package com.patuli.angularDemo.mapper;

import com.patuli.angularDemo.dto.request.FriendRequestDto;
import com.patuli.angularDemo.repository.Entity.Friend;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FriendMapper {

    Friend toFriend(FriendRequestDto friendRequestDto);
    FriendRequestDto toFriendRequestDto(Friend friend);


}
