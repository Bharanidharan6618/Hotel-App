package com.hotel.app.repositories;

import com.hotel.app.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}

// I'll put others here too or separate files. Usually separate is better.
