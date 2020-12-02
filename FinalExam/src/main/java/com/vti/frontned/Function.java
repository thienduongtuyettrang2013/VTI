package com.vti.frontned;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.utils.ScannerUtils;
import com.vti.backend.presentation.UserController;

public class Function {

    private UserController userController;

    public Function() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
        userController = new UserController();
    }
    public void loginEx() throws ClassNotFoundException, SQLException {
        System.out.println("Login tài khoản ");
        while (true) {
            System.out.print("Mời bạn nhập vào Email của account: ");
            String email = ScannerUtils.inputEmail("Email chưa đúng định dạng. Moi nhap lai!");

            System.out.print("Mời bạn nhập password: ");
            String password = ScannerUtils.inputPassword(
                    "Password phai dai tu 6--> 12 ki tu va co it nhat 1 chu viet hoa!\nMoi ban nhap lai!");
            try {
                System.out.println(userController.loginEx(email, password));
                System.out.println("Login successfull!");
                return;

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
    public void loginFr() throws ClassNotFoundException, SQLException {
        System.out.println("Login tài khoản ");
        while (true) {
            System.out.print("Mời bạn nhập vào Email của account: ");
            String email = ScannerUtils.inputEmail("Email chưa đúng định dạng. Moi nhap lai!");

            System.out.print("Mời bạn nhập password: ");
            String password = ScannerUtils.inputPassword(
                    "Password phai dai tu 6--> 12 ki tu va co it nhat 1 chu viet hoa!\nMoi ban nhap lai!");
            try {
                System.out.println(userController.loginFr(email, password));
                System.out.println("Login successfull!");
                return;

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public void registerEx() throws Exception {
        System.out.println("Đăng kí tài khoản");
        while (true) {
//            System.out.println("Mời bạn nhập vào loại tài khoản (EXPERIENCECANDIDATE,FRESHERCANDIDATE) :");
//            String role = ScannerUtils.inputRole("loại tài khản chưa đúng mời nhập lại");

            System.out.print("Mời bạn nhập vào Email của account: ");
            String email = ScannerUtils.inputEmail("Email chưa đúng định dạng. Moi nhap lai!");

            userController.isEmailExExits(email);
            System.out.println("Mòi bạn nhập fullname: ");
            String fullname = ScannerUtils.inputName("Tên chưa đúng định dạng. Mời nhập lại");

            System.out.println("Mời bạn nhập số điện thoại");
            String phone = ScannerUtils.inputPhoneNumber("Số điện thoại chưa đúng mời nhập lại(9-12)");

            System.out.println("Mời bạn nhập vào password(6-12 và 1 kí tự viết hoa):");
            String password = ScannerUtils.inputPassword("Password không đúng định dạng mời nhập lại");

            System.out.println("Mời bạn nhập vào số năm kinh nghiệm");
            int expInYear = ScannerUtils.inputInt("Nhập sai số năm. Mời nhập lại");

            System.out.println("Mời bạn nhập Pro Skill");
            String proSkill = ScannerUtils.inputString("Pro Skill nhập sai. Mời nhập lại");

            try {
                System.out.println(userController.registerEx(fullname, phone, email, password, expInYear, proSkill));
                System.out.println("Register successfull!");
                return;

            }catch (Exception e) {
                System.err.println(e.getMessage());
            }

        }
    }
    public void registerFr() throws Exception {
        System.out.println("Đăng kí tài khoản");
        while (true) {
//            System.out.println("Mời bạn nhập vào loại tài khoản (EXPERIENCECANDIDATE,FRESHERCANDIDATE) :");
//            String role = ScannerUtils.inputRole("loại tài khản chưa đúng mời nhập lại");

            System.out.print("Mời bạn nhập vào Email của account: ");
            String email = ScannerUtils.inputEmail("Email chưa đúng định dạng. Moi nhap lai!");

            userController.isEmailFrExits(email);

            System.out.println("Mòi bạn nhập fullname: ");
            String fullname = ScannerUtils.inputName("Tên chưa đúng định dạng. Mời nhập lại");

            System.out.println("Mời bạn nhập số điện thoại");
            String phone = ScannerUtils.inputPhoneNumber("Số điện thoại chưa đúng mời nhập lại(9-12)");

            System.out.println("Mời bạn nhập vào password(6-12 và 1 kí tự viết hoa):");
            String password = ScannerUtils.inputPassword("Password không đúng định dạng mời nhập lại");

            System.out.println("Mời bạn nhập Graduation Rank");
            String graduationRank = ScannerUtils.inputGraduationRank("Graduation Rank nhập sai. Mời nhập lại");

            try {
                System.out.println(userController.registerFr(fullname, phone, email, password, graduationRank));
                System.out.println("Register successfull!");
                return;

            }catch (Exception e) {
                System.err.println(e.getMessage());
            }

        }
    }


}