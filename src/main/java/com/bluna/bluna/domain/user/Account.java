package com.bluna.bluna.domain.user;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class Account {
    @Id
    @GeneratedValue
    //시퀀스 자동생성 pk이므로 @Id, 자동생성이므로 @GeneratedValue
    private long seq;

    @Column(unique = true)
    private String userId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String userName;
}
