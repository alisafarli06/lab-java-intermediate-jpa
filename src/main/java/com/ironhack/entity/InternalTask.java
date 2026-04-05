package com.ironhack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table
@PrimaryKeyJoinColumn(name = "id")
public class InternalTask  extends  Task {

    public InternalTask() {
    }

    public InternalTask(String title, LocalDate dueDate, Boolean status) {
        super(title, dueDate, status);
    }


}
