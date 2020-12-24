package com.example.demo3.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by kobis on 24 Dec, 2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class CheckinData {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "person_id")
    private int personID;

    @Column(name = "eventDate")
    private LocalDate date;


}
