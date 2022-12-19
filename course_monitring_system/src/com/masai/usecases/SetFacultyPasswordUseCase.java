package com.masai.usecases;

import java.util.Scanner;

//import com.masai.dao.FacultyDao;
//import com.masai.dao.FacultyDaoImpl;

public class SetFacultyPasswordUseCase {
	public String setFacultyPassword() {
        String pwd = null;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Updated Password");
        System.out.println();
        System.out.print("Enter New Password : ");
        String newPassword = sc.next();
        System.out.println("Confirm Password : ");
        String confirmPassword = sc.next();
        
        sc.close();

//        FacultyDao dao = new FacultyDaoImpl();
//        Faculty f = new Faculty();

        if (newPassword.equals(confirmPassword)) {
            pwd = newPassword;
        }
        return pwd;
        
        
    }


}
