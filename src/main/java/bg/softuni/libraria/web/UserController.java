package bg.softuni.libraria.web;

import bg.softuni.libraria.service.UserLoginDTO;
import bg.softuni.libraria.service.UserRegisterDTO;
import bg.softuni.libraria.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/register")
    public String viewRegister(Model model) {

        model.addAttribute("registerData", new UserRegisterDTO());


        return "register";
    }



    @PostMapping("/register")
    public String doRegister(@Valid UserRegisterDTO userData,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes){

        if (bindingResult.hasErrors()) {

            redirectAttributes.addFlashAttribute("registerData", userData);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.UserRegisterDTO", bindingResult);


            return "redirect:/users/register";
        }


        userService.register(userData);
        return "redirect:/users/login";
    }

    @GetMapping("/login")
    public String viewLogin(Model model) {

        model.addAttribute("loginData", new UserLoginDTO());

        return "login";
    }

    @PostMapping("/login")
    public String doLogin(UserLoginDTO loginData) {



        userService.login(loginData);
        return "redirect:/";
    }




}
