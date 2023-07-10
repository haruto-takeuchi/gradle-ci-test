package com.example.controller;

import com.example.entity.User;
import com.example.repository.UserRepository;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** REST API のエンドポイント */
@RestController
public class UserController {
  @Autowired private UserRepository userRepository;

  @GetMapping("/users")
  public ResponseEntity<List<User>> getAllUsers() {
    return ResponseEntity.ok(userRepository.findAll());
  }

  @GetMapping("/sample")
  public ResponseEntity<List<User>> getSamples() {
    User sampleUser = new User();
    sampleUser.setId(0L);
    sampleUser.setName("hoge");
    return ResponseEntity.ok(Arrays.asList(sampleUser));
  }
}
