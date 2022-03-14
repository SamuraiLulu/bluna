package com.bluna.bluna.controller;

import com.bluna.bluna.payload.request.UserRequest;
import com.bluna.bluna.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /*
        class level에 붙여준 @RequestMapping("user") 는 중복되는 url 이다.
        아래의 signup method는 @PostMapping("/signup")으로 mpapping 시켰다.
        이렇게 하면 class의 RequestMapping에 적어놓은 url과 method에 적어놓은 url을 합쳐서 호출
        => EX: localhost:8080/user/signup 으로 post를 보내면 signup 메서드가 실행되는 것이다.
     */

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody UserRequest request) {
        System.out.print("id::::"+ request.getUserId());
        log.info("userId = {}, password = {}, userName = {}", request.getUserId(), request.getPassword(), request.getUserName());

        if (userService.signup(request).equals("Success")) {
            return new ResponseEntity(HttpStatus.CREATED);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }



    @PostMapping("/test")
    public String test(@RequestBody UserRequest request) {
        System.out.print("id::222::"+ request.getUserId());
        UserRequest userRequest  = new UserRequest();
        userRequest.setUserId(request.getUserId());

        return "default";
    }

}
