package com.vti.backend.datalayer;

import com.vti.entity.Candidate;
import com.vti.entity.ExperienceCandidate;
import com.vti.entity.FresherCandidate;

import java.sql.SQLException;

public interface IUserRepository {

    ExperienceCandidate registerEx(String Fullname, String Phone, String email, String password, int ExpInYear, String ProSkill) throws Exception;

    FresherCandidate registerFr(String Fullname, String Phone, String email, String graduationRank, String password) throws Exception;

    boolean isEmailFrExits(String email) throws SQLException, ClassNotFoundException;

    boolean isEmailExExits(String email) throws SQLException, ClassNotFoundException;

    ExperienceCandidate loginEx(String email, String password) throws Exception;
    FresherCandidate loginFr(String email, String password) throws Exception;

}