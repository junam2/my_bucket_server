package com.junam.my_bucket_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.junam.my_bucket_server.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
