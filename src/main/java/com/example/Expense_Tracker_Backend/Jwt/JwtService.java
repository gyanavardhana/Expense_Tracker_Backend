package com.example.Expense_Tracker_Backend.Jwt;

import org.springframework.security.core.userdetails.UserDetails;

public interface JwtService {
    String generateToken(String email);

    String extractUser(String token);

    boolean validateToken(String token, UserDetails userDetails);
}
