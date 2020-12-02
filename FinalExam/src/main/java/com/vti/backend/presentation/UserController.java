package com.vti.backend.presentation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.bussinesslayer.IUserService;
import com.vti.backend.bussinesslayer.UserService;
import com.vti.entity.Candidate;
import com.vti.entity.ExperienceCandidate;
import com.vti.entity.FresherCandidate;

public class UserController {
    private IUserService userService;

    public UserController() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
        userService = new UserService();
    }



    public ExperienceCandidate registerEx(String Fullname, String Phone, String email, String password, int ExpInYear, String ProSkill) throws Exception {
        return userService.registerEx(Fullname, Phone, email, password, ExpInYear, ProSkill);
    }

    public FresherCandidate registerFr(String Fullname, String Phone, String email, String password, String graduationRank) throws Exception {
        return userService.registerFr(Fullname, Phone, email, password, graduationRank);
    }

    public boolean isEmailFrExits(String email) throws SQLException, ClassNotFoundException {
        return userService.isEmailFrExits(email);
    }


    public boolean isEmailExExits(String email) throws SQLException, ClassNotFoundException {
        return userService.isEmailExExits(email);
    }


    public Candidate loginEx(String email, String password) throws Exception {
        return userService.loginEx(email, password);
    }


    public Candidate loginFr(String email, String password) throws Exception {
        return userService.loginFr(email, password);
    }

}