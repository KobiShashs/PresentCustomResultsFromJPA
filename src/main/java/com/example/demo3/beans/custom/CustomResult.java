package com.example.demo3.beans.custom;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

/**
 * Created by kobis on 24 Dec, 2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomResult implements Serializable {

    public static final String FIRST_NAME = "first_name";
    public static final String LAST_NAME = "last_name";
    public static final String EMAIL_ADDRESS = "email_address";
    public static final String EVENT_DATE = "event_date";

    private String first_name;
    private String last_name;
    private String email_address;
    private LocalDate event_date;

    public CustomResult(Map<String, Object> values) {
        this.first_name = values.get(FIRST_NAME) != null ? (String) values.get(FIRST_NAME): null;
        this.last_name = values.get(LAST_NAME) != null ? (String) values.get(LAST_NAME) : null;
        this.email_address = values.get(EMAIL_ADDRESS) != null ? (String) values.get(EMAIL_ADDRESS) : null;
        this.event_date = values.get(EVENT_DATE)!=null ? LocalDate.parse(String.valueOf(values.get(EVENT_DATE))):null;
    }
}
