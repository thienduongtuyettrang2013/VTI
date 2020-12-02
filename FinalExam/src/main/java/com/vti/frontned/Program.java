package com.vti.frontned;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.entity.Role;
import com.vti.utils.ScannerUtils;

public class Program {
    public static void main(String[] args) throws Exception {

        Function function = new Function();
        System.out.println("Đăng kí tài khoản ");

        while (true) {
            System.out.println("Mời bạn nhập vào loại tài khoản(EXPERIENCECANDIDATE,FRESHERCANDIDATE)");
            String role = ScannerUtils.inputRole("loại tài khoản này không tồn tại mời nhập lại");
            if(role.equals("EXPERIENCECANDIDATE")){
                function.registerEx();

                System.out.println("Đăng nhập");
                function.loginEx();
            }
            else{
                function.registerFr();

                System.out.println("Đăng nhập");

                function.loginFr();
            }

        }
    }
}