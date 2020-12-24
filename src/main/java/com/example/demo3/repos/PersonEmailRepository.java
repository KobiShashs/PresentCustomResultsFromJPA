package com.example.demo3.repos;

import com.example.demo3.beans.Person;
import com.example.demo3.beans.PersonEmail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kobis on 24 Dec, 2020
 */
public interface PersonEmailRepository extends JpaRepository<PersonEmail,Long> {



}
