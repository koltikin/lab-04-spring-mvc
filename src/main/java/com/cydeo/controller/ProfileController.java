package com.cydeo.controller;

import com.cydeo.model.Profile;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class ProfileController {

    @RequestMapping("/profile")
    public String makeProfileInfo(Model model){
        Profile profile = new Profile();
        profile.setName("mike");
        profile.setSurname("smith");
        profile.setPhoneNumber("+1256342345");
        profile.setEmail("msmith@gmail.com");
        profile.setCreatedDate(LocalDateTime.of(2022,9,21, 1,59,54,246672));

        model.addAttribute(profile);


        return "profile/profile-info";
    }
}
