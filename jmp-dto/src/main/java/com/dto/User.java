package com.dto;

import java.time.LocalDate;

public class User {
    String name;
    String surname;
    LocalDate birthday;

    public LocalDate getBirthday() {
        return birthday;
    }
}
