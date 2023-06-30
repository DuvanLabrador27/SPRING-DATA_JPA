package com.duvanlabrador.DataJPA.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firsName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "date", nullable = false)
    private LocalDate birthDay;
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private ContactInfoEntity contactInfoEntity;
    @ManyToMany
    @JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
    private Set<CourseEntity> courses = new HashSet<>();


}
