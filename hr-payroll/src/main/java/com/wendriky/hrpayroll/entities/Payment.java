package com.wendriky.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private static final long serialVersionUID = 1l;

    private String name;
    private Double dailyincome;
    private Integer days;

    public Double getTotal() {
        return days * dailyincome;
    }

}
