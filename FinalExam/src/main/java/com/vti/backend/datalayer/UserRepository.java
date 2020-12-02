package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.vti.entity.*;
import com.vti.utils.JdbcUltils;


public class UserRepository implements IUserRepository {

    private JdbcUltils jdbcUltils;
    private Connection connection;

    public UserRepository() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
        jdbcUltils = new JdbcUltils();
    }


    @Override
    public ExperienceCandidate registerEx(String Fullname, String Phone, String email, String password, int ExpInYear, String ProSkill) throws Exception {
        try {

            // step 2: get connect
            connection = jdbcUltils.connect();

            // Step 3: Create a statement object
            String sql = "INSERT INTO ExperienceCandidate(Fullname,Phone, Email,`Password`,ExpInYear,ProSkill) \n" +
                        "VALUE (?,?,?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);


            // set parameter
            preparedStatement.setString(1, Fullname);
            preparedStatement.setString(2, Phone);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, password);
            preparedStatement.setInt(5, ExpInYear);
            preparedStatement.setString(6, ProSkill);

            // Step 4: Execute Query
            ResultSet resultSet= preparedStatement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String role = resultSet.getString("Role");
                ExperienceCandidate experienceCandidate = new ExperienceCandidate(id, Fullname, Phone, email, password, role, ExpInYear, ProSkill);
                return experienceCandidate;
            } else {
                throw new Exception("\nĐăng kí không thành công!");
            }

        } finally {
            connection.close();
        }
    }

    @Override
    public FresherCandidate registerFr(String Fullname, String Phone, String email, String graduationRank, String password) throws Exception {
        try {

            // step 2: get connect
            connection = jdbcUltils.connect();

            // Step 3: Create a statement object
            String sql = "INSERT INTO ExperienceCandidate(Fullname,Phone, Email,`Password`,GraduationRank) \n" +
                    "VALUE (?,?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);


            // set parameter
            preparedStatement.setString(1, Fullname);
            preparedStatement.setString(2, Phone);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, password);
            preparedStatement.setString(5,graduationRank);


            // Step 4: Execute Query
            ResultSet resultSet= preparedStatement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String role = resultSet.getString("Role");
                FresherCandidate fresherCandidate = new FresherCandidate( id, Fullname, Phone, email, password, role, graduationRank);
                return fresherCandidate;
            } else {
                throw new Exception("\nĐăng kí không thành công!");
            }
        } finally {
            connection.close();
        }
    }


    @Override
    public boolean isEmailExExits(String email) throws SQLException, ClassNotFoundException {
        try {

            // step 2: get connect
            connection = jdbcUltils.connect();

            // Step 3: Create a statement object

            String sql = "SELECT * FROM ExperienceCandidate " + " WHERE Email = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // set parameter
            preparedStatement.setString(1, email);

            // Step 4: Execute Query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Step 5: Handling result set

            if (resultSet.next()) {

                return true;
            }
            return false;
        } finally {
            connection.close();
        }

    }
    @Override
    public boolean isEmailFrExits(String email) throws SQLException, ClassNotFoundException {
        try {

            // step 2: get connect
            connection = jdbcUltils.connect();

            // Step 3: Create a statement object

            String sql = "SELECT * FROM FresherCandidate " + " WHERE Email = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // set parameter
            preparedStatement.setString(1, email);

            // Step 4: Execute Query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Step 5: Handling result set

            if (resultSet.next()) {

                return true;
            }
            return false;
        } finally {
            connection.close();
        }

    }

    @Override
    public ExperienceCandidate loginEx(String email, String password) throws Exception {

        try {

            // step 2: get connect
            connection = jdbcUltils.connect();

            // Step 3: Create a statement object

            String sql = "SELECT * FROM ExperienceCandidate " + "WHERE Email = ? AND `Password` = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // set parameter
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            // Step 4: Execute Query

            ResultSet resultSet = preparedStatement.executeQuery();

            // Step 5: Handling result
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String fullName = resultSet.getString("FullName");
                String phone = resultSet.getString("Phone");
                String role = resultSet.getString("Role");
                int expInYear = resultSet.getInt("ExpInYear");
                String proSkill = resultSet.getString("ProSkill");
                ExperienceCandidate experienceCandidate = new ExperienceCandidate(id, fullName, phone, email, password, role, expInYear, proSkill);
                return experienceCandidate;
            } else {
                throw new Exception("\nTai khoan khong ton tai!");
            }

        } finally {
            connection.close();
        }

    }

    @Override
    public FresherCandidate loginFr(String email, String password) throws Exception {

        try {

            // step 2: get connect
            connection = jdbcUltils.connect();

            // Step 3: Create a statement object

            String sql = "SELECT * FROM FresherCandidate " + "WHERE Email = ? AND `Password` = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // set parameter
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            // Step 4: Execute Query

            ResultSet resultSet = preparedStatement.executeQuery();

            // Step 5: Handling result
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String fullName = resultSet.getString("FullName");
                String phone = resultSet.getString("Phone");
                String role = resultSet.getString("Role");
                String graduationRank =resultSet.getString("GraduationRank");
                FresherCandidate fresherCandidate = new FresherCandidate( id, fullName, phone, email, password, role, graduationRank);
                return fresherCandidate;
            } else {
                throw new Exception("\nTai khoan khong ton tai!");
            }

        } finally {
            connection.close();
        }

    }

}