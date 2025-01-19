package com.example.Expense_Tracker_Backend.User;

import java.util.UUID;

public interface UserService {
    User getUser(UUID id);
    void addUser(User user);
    void editUser(User user);
    void removeUser(UUID id);
    String verify(User user);
}
