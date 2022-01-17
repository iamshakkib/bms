package com.shakkib.mbs.services;

import com.shakkib.mbs.exceptions.UserDetailsNotFoundException;
import com.shakkib.mbs.exceptions.UserNameAlreadyExistsException;
import com.shakkib.mbs.exceptions.UserTypeDetailsNotFoundException;
import com.shakkib.mbs.entities.User;

public interface UserService {

    public User acceptUserDetails(User user)
            throws UserNameAlreadyExistsException, UserTypeDetailsNotFoundException;

    public User getUserDetails(int id) throws UserDetailsNotFoundException;

    public User getUserDetailsByUsername(String username) throws UserDetailsNotFoundException;

    public User updateUserDetails(int id, User user)
            throws UserNameAlreadyExistsException, UserDetailsNotFoundException, UserTypeDetailsNotFoundException;

}
