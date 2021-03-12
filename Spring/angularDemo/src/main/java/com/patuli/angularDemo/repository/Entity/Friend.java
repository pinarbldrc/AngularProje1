package com.patuli.angularDemo.repository.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Table(name="tbl_friend")
public class Friend implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String firstname;
    String lastname;
    String department;
    String email;
    String country;


}
