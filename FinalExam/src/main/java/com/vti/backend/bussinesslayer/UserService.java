package com.vti.backend.bussinesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.Candidate;
import com.vti.entity.ExperienceCandidate;
import com.vti.entity.FresherCandidate;

public class UserService implements IUserService {

    private IUserRepository userRepository;

    public UserService() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
        userRepository = new UserRepository();
    }

    @Override
    public ExperienceCandidate registerEx(String Fullname, String Phone, String email, String password, int ExpInYear, String ProSkill) throws Exception {
        return userRepository.registerEx(Fullname, Phone, email, password, ExpInYear, ProSkill);
    }


    @Override
    public FresherCandidate registerFr(String Fullname, String Phone, String email, String password, String graduationRank) throws Exception {
        return userRepository.registerFr(Fullname, Phone, email, graduationRank, password);
    }

    @Override
    public boolean isEmailFrExits(String email) throws SQLException, ClassNotFoundException {
        return userRepository.isEmailFrExits(email);
    }

    @Override
    public boolean isEmailExExits(String email) throws SQLException, ClassNotFoundException {
        return userRepository.isEmailExExits(email);
    }

    @Override
    public ExperienceCandidate loginEx(String email, String password) throws Exception {
        return userRepository.loginEx(email, password);
    }

    @Override
    public FresherCandidate loginFr(String email, String password) throws Exception {
        return userRepository.loginFr(email, password);
    }
}
