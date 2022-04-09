package com.blind.blind_backend.domain;


import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
public class Post {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "postId")
    private Long id;
    @Column
    private Long userId;
    @Column
    private int like;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private String categoryName;
    @Column
    private LocalDateTime createdAt;
}
