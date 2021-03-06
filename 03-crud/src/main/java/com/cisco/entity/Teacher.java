package com.cisco.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "teacher")
public class Teacher implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(nullable = false)
    String name;
    @Column(name = "contact_number", nullable = false)
    String contactNumber;

    public Teacher(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }
}
