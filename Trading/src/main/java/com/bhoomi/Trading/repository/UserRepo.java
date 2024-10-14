package com.bhoomi.Trading.repository;

import com.bhoomi.Trading.model.UserT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserT,Long> {
}
