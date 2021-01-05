package com.example.parth;

import java.time.LocalDate;

public class CalenderWork {
    LocalDate d = LocalDate.now();

    public void ChangeDate(int n){

        System.out.println(d.plusDays(n));
    }
}
