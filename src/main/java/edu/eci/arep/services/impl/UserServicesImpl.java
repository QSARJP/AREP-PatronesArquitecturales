package edu.eci.arep.services.impl;

import edu.eci.arep.model.User;
import edu.eci.arep.persistence.AppPersistenceException;
import edu.eci.arep.persistence.UserRepository;
import edu.eci.arep.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() throws AppPersistenceException {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User user) throws AppPersistenceException {
        userRepository.save(user);
    }

    @Override
    public User findUserByName(String user) throws AppPersistenceException {
        Optional<User> optinalUser = userRepository.findByName(user);
        if (!optinalUser.isPresent())
            throw new AppPersistenceException(AppPersistenceException.CAR_NOT_FOUND);
        return optinalUser.get();
    }
}
