package com.example.demo3.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by kobis on 24 Dec, 2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CustomResult {
    private String first_name;
    private String last_name;
    private String email_address;
    private LocalDate event_date;
}
