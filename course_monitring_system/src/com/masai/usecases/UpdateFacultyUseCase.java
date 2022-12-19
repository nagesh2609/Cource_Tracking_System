package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exceptions.AdminException;

public class UpdateFacultyUseCase {
	@SuppressWarnings("resource")
	public void updateFaculty() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Faculty Id : "); int facultyId = sc.nextInt();

        System.out.println();
        System.out.println("Now Enter Updates Values : ");
        System.out.println();
        sc.nextLine();
        System.out.print("Enter Faculty Name : "); String facultyName = sc.nextLine();

        System.out.print("Enter Faculty Address : "); String facultyAddress = sc.nextLine();
        System.out.print("Enter Mobile Number : "); long mobile = sc.nextLong();
        System.out.print("Enter Email Address : "); String email = sc.next();
        System.out.print("Enter Username : "); String username = sc.next();
        System.out.print("Enter Password : "); String password = sc.next();

        AdminDao dao = new AdminDaoImpl();
        String result = null;
        try {
            result = dao.updateFaculty(facultyId,facultyName,facultyAddress,mobile,email,username,password);
        } catch (AdminException e) {
            throw new RuntimeException(e);
        }

        System.out.println(result);
        sc.close();

    }

}
