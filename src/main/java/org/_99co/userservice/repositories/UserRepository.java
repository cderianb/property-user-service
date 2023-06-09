package org._99co.userservice.repositories;

import org._99co.userservice.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    Page<User> findAllByOrderByCreatedAtDesc(PageRequest pageRequest);
}
