package com.igor.workshopspringbootjpaapi.repositories;

import com.igor.workshopspringbootjpaapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
