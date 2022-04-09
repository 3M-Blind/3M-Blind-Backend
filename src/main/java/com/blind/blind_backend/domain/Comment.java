package com.blind.blind_backend.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long postId;
    @Column
    private Long userId;
    @Column
    private String content;
    @Column
    private int like;
    @Column
    private LocalDateTime createdTime;
}
