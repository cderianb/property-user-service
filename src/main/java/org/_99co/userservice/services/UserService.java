package org._99co.userservice.services;

import lombok.AllArgsConstructor;
import org._99co.userservice.entities.User;
import org._99co.userservice.repositories.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService {
    private UserRepository userRepository;

    public List<User> getAllUsers(Integer page, Integer size){
        Page<User> users = userRepository.findAllByOrderByCreatedAtDesc(PageRequest.of(page-1, size));
        return users.stream().toList();
    }

    public User getUser(Integer id){
        return userRepository.findById(id).orElseGet(() -> User.builder().build());
    }

    public User createUser(String name){
        User user = User.builder()
                .name(name)
                .build();
        return userRepository.save(user);
    }
}
