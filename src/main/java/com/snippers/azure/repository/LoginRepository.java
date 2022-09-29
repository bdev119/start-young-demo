package com.snippers.azure.repository;

import com.snippers.azure.model.Login_Credentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login_Credentials, String> {
}
