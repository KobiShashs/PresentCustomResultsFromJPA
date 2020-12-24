package com.example.demo3.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by kobis on 23 Dec, 2020
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PersonEmail {
    @Id
    @Column(name = "person_id")
    private int id;

    @Column(name = "email_address")
    private String email;

}