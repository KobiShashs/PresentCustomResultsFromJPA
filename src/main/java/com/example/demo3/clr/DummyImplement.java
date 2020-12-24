package com.example.demo3.clr;

import com.example.demo3.repos.CheckinDataRepository;
import com.example.demo3.utils.ArtUtils;
import com.example.demo3.utils.ConvertUtils;
import com.example.demo3.utils.TablePrinter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by kobis on 24 Dec, 2020
 */
@Component
@RequiredArgsConstructor
@Order(2)
public class DummyImplement implements CommandLineRunner {

    private final CheckinDataRepository checkinDataRepository;
    private final ConvertUtils convertUtils;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(ArtUtils.DUMMY);
        TablePrinter.print(convertUtils.getCustomResults(checkinDataRepository.go()));
    }
}
