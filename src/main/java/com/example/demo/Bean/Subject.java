package com.example.demo.Bean;

import lombok.Data;

// 学科
@Data
public class Subject {

    // 理科
    private String like;
    // 文科
    private String wenke;

    @Override
    public String toString() {
        return "Subject{" +
                "like='" + like + '\'' +
                ", wenke='" + wenke + '\'' +
                '}';
    }

}