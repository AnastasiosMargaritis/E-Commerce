package com.ecommerce.service;

import com.ecommerce.domain.security.User;
import com.ecommerce.domain.security.UserRole;

import java.util.Set;

public interface UserService {

    User createUser(User user, Set<UserRole> userRoles);
}
