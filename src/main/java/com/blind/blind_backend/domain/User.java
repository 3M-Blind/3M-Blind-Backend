package com.blind.blind_backend.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String username;
    @Column
    private String nickname;
    @Column
    private String email;
    @Column
    private String password;

    @Builder
    public User(String username, String nickname, String email, String password){
        this.username = username;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }
}
