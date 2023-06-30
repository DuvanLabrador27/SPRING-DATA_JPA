package com.duvanlabrador.DataJPA.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "information_contact")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ContactInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "number_phone", nullable = false)
    private String numberPhone;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "state", nullable = false)
    private String state;
    @Column(name = "zip", nullable = false)
    private String zip;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private StudentEntity student;



}
