package com.patuli.angularDemo.mapper;

import com.patuli.angularDemo.dto.request.FriendRequestDto;
import com.patuli.angularDemo.repository.Entity.Friend;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-03T21:51:48+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.8 (Oracle Corporation)"
)
@Component
public class FriendMapperImpl implements FriendMapper {

    @Override
    public Friend toFriend(FriendRequestDto friendRequestDto) {
        if ( friendRequestDto == null ) {
            return null;
        }

        Friend friend = new Friend();

        friend.setId( (int) friendRequestDto.getId() );
        friend.setFirstname( friendRequestDto.getFirstname() );
        friend.setLastname( friendRequestDto.getLastname() );
        friend.setDepartment( friendRequestDto.getDepartment() );
        friend.setEmail( friendRequestDto.getEmail() );
        friend.setCountry( friendRequestDto.getCountry() );

        return friend;
    }

    @Override
    public FriendRequestDto toFriendRequestDto(Friend friend) {
        if ( friend == null ) {
            return null;
        }

        FriendRequestDto friendRequestDto = new FriendRequestDto();

        friendRequestDto.setId( friend.getId() );
        friendRequestDto.setFirstname( friend.getFirstname() );
        friendRequestDto.setLastname( friend.getLastname() );
        friendRequestDto.setDepartment( friend.getDepartment() );
        friendRequestDto.setEmail( friend.getEmail() );
        friendRequestDto.setCountry( friend.getCountry() );

        return friendRequestDto;
    }
}
