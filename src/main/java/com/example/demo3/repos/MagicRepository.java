package com.example.demo3.repos;

import com.example.demo3.beans.Magic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

/**
 * Created by kobis on 24 Dec, 2020
 */
public interface MagicRepository extends JpaRepository<Magic,Integer> {

    @Query(value = "select p.first_name, p.last_name, pe.email_address,cd.event_date\n" +
            "FROM person as p\n" +
            "inner join person_email as pe\n" +
            "ON p.id=pe.person_id\n" +
            "inner join checkin_data as cd\n" +
            "ON p.id=cd.person_id",nativeQuery = true)
    //List<CustomResult> go();

    List<Map<String,Object>> go();
}
