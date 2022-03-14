package com.bluna.bluna.payload.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public final class UserRequest {
    /*
        이전에 만든 Account.java 에는 db가 자동으로 생성해주는 seq 값까지 들어있다. 우리가 회원가입시에 필요한 attribute만 뽑아서 UserRequest 객체로 만든다
     */
    private String userId;
    private String password;
    private String userName;
}
