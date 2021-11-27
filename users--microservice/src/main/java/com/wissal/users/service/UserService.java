package com.wissal.users.service;

import com.wissal.users.entities.Role;
import com.wissal.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);


}
