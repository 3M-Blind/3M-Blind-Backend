package com.blind.blind_backend.domain;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class BookMark {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long userId;
    @Column
    private Long postId;
}
