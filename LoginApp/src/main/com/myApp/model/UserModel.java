package main.com.myApp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
@Setter
@Getter
public class UserModel {
    private String username;
    private String password;
    private String country;
    private String programmingLanguage;
    private String operatingSystems;
}

