package com.example.demo3.clr;

import com.example.demo3.utils.ArtUtils;
import com.example.demo3.utils.ConvertUtils;
import com.example.demo3.beans.CheckinData;
import com.example.demo3.beans.Person;
import com.example.demo3.beans.PersonEmail;
import com.example.demo3.repos.CheckinDataRepository;
import com.example.demo3.repos.PersonEmailRepository;
import com.example.demo3.repos.PersonRepository;
import com.example.demo3.utils.TablePrinter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Created by kobis on 24 Dec, 2020
 */
@Component
@RequiredArgsConstructor
@Order(1)
public class Bootstrap implements CommandLineRunner {

    private final PersonRepository personRepository;
    private final PersonEmailRepository personEmailRepository;
    private final CheckinDataRepository checkinDataRepository;
    private final ConvertUtils convertUtils;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(ArtUtils.BOOTSTRAP);

        Person p1 = Person.builder().firstName("aaa").lastName("aaaa").age(33).build();
        Person p2 = Person.builder().firstName("bbb").lastName("bbbb").age(44).build();
        Person p3 = Person.builder().firstName("ccc").lastName("cccc").age(55).build();
        Person p4 = Person.builder().firstName("ddd").lastName("dddd").age(66).build();
        personRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
        TablePrinter.print(personRepository.findAll());

        PersonEmail pe1 = PersonEmail.builder().id(1).email("aaa@gmail.com").build();
        PersonEmail pe2 = PersonEmail.builder().id(2).email("bbb@gmail.com").build();
        PersonEmail pe3 = PersonEmail.builder().id(3).email("ccc@gmail.com").build();
        PersonEmail pe4 = PersonEmail.builder().id(4).email("ddd@gmail.com").build();
        personEmailRepository.saveAll(Arrays.asList(pe1, pe2, pe3,pe4));
        TablePrinter.print(personEmailRepository.findAll());

        CheckinData cd1 = CheckinData.builder().personID(1).date(LocalDate.now()).build();
        CheckinData cd2 = CheckinData.builder().personID(2).date(LocalDate.now()).build();
        CheckinData cd3 = CheckinData.builder().personID(3).date(LocalDate.now()).build();
        CheckinData cd4 = CheckinData.builder().personID(4).date(LocalDate.now()).build();
        checkinDataRepository.saveAll(Arrays.asList(cd1, cd2, cd3, cd4));
        TablePrinter.print(checkinDataRepository.findAll());







    }
}
