package com.masai.authentication;

import com.masai.exceptions.AdminException;

public interface Authentication {
    String login(String username, String password) throws AdminException;

}
