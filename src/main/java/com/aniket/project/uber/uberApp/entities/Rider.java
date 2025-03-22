package com.aniket.project.uber.uberApp.entities;

import jakarta.persistence.*;

@Entity

public class Rider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User user;

    private Double rating;



}
