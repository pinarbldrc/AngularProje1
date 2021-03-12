package com.patuli.angularDemo.dto.request;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class FriendRequestDto {

    long id;

    String firstname;
    String lastname;
    String department;
    String email;
    String country;
}
