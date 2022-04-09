package com.blind.blind_backend.domain;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private Long postId;
}
