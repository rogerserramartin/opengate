package com.rogerserra.producer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Machine {
    private String name;
    private String result;
    private LocalDateTime timestamp;
    private BigDecimal energyConsumption;
}
