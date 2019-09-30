package edu.eci.arep.services;

import edu.eci.arep.model.User;
import edu.eci.arep.persistence.AppPersistenceException;

import java.util.List;

public interface UserServices {

    List<User> getAllUsers() throws AppPersistenceException;

    void saveUser(User user) throws AppPersistenceException;

    User findUserByName(String user) throws AppPersistenceException;
}
