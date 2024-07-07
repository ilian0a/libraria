package bg.softuni.libraria.service;

import bg.softuni.libraria.model.User;
import org.springframework.stereotype.Component;

@Component
public class CurrentUser {

    private User user;

    public boolean isLoggedIn() {
        return this.user != null;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
