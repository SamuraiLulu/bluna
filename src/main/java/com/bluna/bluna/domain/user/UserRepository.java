package com.bluna.bluna.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Account, Long> {
    /*
        JpaRepository<Account, Long> => Account은 저장할 객체가 Account이고 (이전에 만들어 놓은 Account.java), pk가 Long type이므로 Long으로 해준다.
        JpaRepository를 extends 하면 JpaRepository에 있는 findById, findAll 등을 사용할 수 있다.
        나머지 커스텀 해야하는 것은 여기 interface안에 넣어주면 된다.
        현재 Account 테이블의 속성은 (seq, user_id, password, user_name)이고, seq이 pk이다.
        회원가입 후 로그인할 때 user_id, password를 받아 회원을 체크해야 하므로 findByUserId를 만들어 주었다.
        findBy ~ 형식으로 만들어주면 파라미터로 넣어주는 값으로 Account객체를 찾을 수 있다.
     */
    Optional<Account> findByUserId(String userId);
}
