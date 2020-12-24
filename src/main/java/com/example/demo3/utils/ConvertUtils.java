package com.example.demo3.utils;

import com.example.demo3.beans.custom.CustomResult;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kobis on 24 Dec, 2020
 */
@Component
public class ConvertUtils {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public List<CustomResult> getCustomResults(List<Object[]> source) {

        List<CustomResult> customResults = new ArrayList<>();
        int count = 0;
        CustomResult tmp = null;
        for (Object[] objects : source) {
            tmp = new CustomResult();
            for (Object object : objects) {
                if (count % 4 == 0) {
                    tmp.setFirst_name(String.valueOf(object));
                } else if (count % 4 == 1) {
                    tmp.setLast_name(String.valueOf(object));
                } else if (count % 4 == 2) {
                    tmp.setEmail_address(String.valueOf(object));
                } else {
                    tmp.setEvent_date(LocalDate.parse(String.valueOf(object), formatter));
                    customResults.add(tmp);
                }
                count++;

            }

        }
        return customResults;
    }

}
