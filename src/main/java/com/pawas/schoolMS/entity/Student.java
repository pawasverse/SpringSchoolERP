package com.pawas.schoolMS.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)

    private String lastName;
    @Column(nullable = false,length = 1)

    private String gender;
    @Column(nullable = false)

    private String contactDetail;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "parentId")

    private Parent parent;


}
