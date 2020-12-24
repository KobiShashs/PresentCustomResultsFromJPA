package com.example.demo3.clr;

import com.example.demo3.service.MagicService;
import com.example.demo3.utils.ArtUtils;
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
@Order(3)
public class ProjectionImplement implements CommandLineRunner {
    private final MagicService magicService;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(ArtUtils.PROJECTION);
        TablePrinter.print(magicService.getAllCustomResults());
    }
}
