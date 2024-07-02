package bg.softuni.libraria.service.impl;

import bg.softuni.libraria.model.UserRegistrationDTO;
import bg.softuni.libraria.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void registerUer(UserRegistrationDTO userRegistrationDTO) {
        // TODO
        System.out.println("User registered: " + userRegistrationDTO);
    }
}
