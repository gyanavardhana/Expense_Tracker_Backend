package com.example.Expense_Tracker_Backend.User.Implementation;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.Expense_Tracker_Backend.Expense.Expense;
import com.example.Expense_Tracker_Backend.Expense.ExpenseRepository;
import com.example.Expense_Tracker_Backend.Jwt.JwtService;
import com.example.Expense_Tracker_Backend.User.User;
import com.example.Expense_Tracker_Backend.User.UserRepository;
import com.example.Expense_Tracker_Backend.User.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ExpenseRepository expenseRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    @Override
    public User getUser(UUID id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
    }

    @Override
    public void addUser(User user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException("User with email " + user.getEmail() + " already exists.");
        }
        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public void editUser(User user) {
        User existingUser = userRepository.findById(user.getId())
                .orElseThrow(() -> new RuntimeException("User with ID " + user.getId() + " not found."));

        existingUser.setName(user.getName());
        existingUser.setPassword(user.getPassword());
        existingUser.setSalary(user.getSalary());

        userRepository.save(existingUser);
    }

    @Override
    public void removeUser(UUID id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User with ID " + id + " not found.");
        }

        List<Expense> expenses = expenseRepository.findByUserId(id);
        for (Expense expense : expenses) {
            expenseRepository.delete(expense);
        }
        userRepository.deleteById(id);
    }

    @Override
    public String verify(User user){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword()));
        if(authentication.isAuthenticated())
            return jwtService.generateToken(user.getEmail());
        return "Failure";
    }

    @Override
    public User getUserbyEmail(String email){
        return userRepository.findByEmail(email)
        .orElseThrow(() -> new RuntimeException("User not found with email: " + email));
    }
}
