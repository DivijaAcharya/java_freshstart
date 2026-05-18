package com.ems.demo_ems;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employees")
@Data // Lombok: generates getters, setters, toString, etc.
public class EMSEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(unique = true)
    private String email;
}
