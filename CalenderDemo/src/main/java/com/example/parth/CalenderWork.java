package com.example.parth;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalenderWork {
    LocalDate d = LocalDate.now();

    public void ChangeDate(int n){

        System.out.println(d.plusDays(n));
        System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy").format(d.plusDays(n)));
        System.out.println(DateTimeFormatter.ofPattern("dd-MMM-yyyy").format(d.plusDays(n)));
        System.out.println(DateTimeFormatter.ofPattern("dd-MMMM-yy").format(d.plusDays(n)));
        System.out.println(DateTimeFormatter.ofPattern("dd-MMMM-yyyy").format(d.plusDays(n)));
    }
}
