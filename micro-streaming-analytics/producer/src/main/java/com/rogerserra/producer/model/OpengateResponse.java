package com.rogerserra.producer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OpengateResponse {
    private String id;
    private LocalDateTime timestamp;
    private String name;
    private String resultCode;
    private String resultDescription;
    private ArrayList<Machine> machines;
}
