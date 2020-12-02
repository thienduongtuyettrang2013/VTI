package com.vti.backend.bussinesslayer;

import com.vti.entity.Candidate;
import com.vti.entity.ExperienceCandidate;
import com.vti.entity.FresherCandidate;

import java.sql.SQLException;

public interface IUserService {
    ExperienceCandidate registerEx(String Fullname, String Phone, String email, String password, int ExpInYear, String ProSkill) throws Exception;

    FresherCandidate registerFr(String Fullname, String Phone, String email, String password, String graduationRank) throws Exception;

    boolean isEmailFrExits(String email) throws SQLException, ClassNotFoundException;

    boolean isEmailExExits(String email) throws SQLException, ClassNotFoundException;

    Candidate loginEx(String email, String password) throws Exception;
    Candidate loginFr(String email, String password) throws Exception;

}