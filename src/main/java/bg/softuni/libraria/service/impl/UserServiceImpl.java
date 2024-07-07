package bg.softuni.libraria.service.impl;

import bg.softuni.libraria.service.UserRegisterDTO;
import bg.softuni.libraria.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void registerUser(UserRegisterDTO userRegistrationDTO) {
        // TODO
        System.out.println("User registered: " + userRegistrationDTO);
    }
}
