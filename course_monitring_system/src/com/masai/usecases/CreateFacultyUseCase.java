package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.model.Facalty;

public class CreateFacultyUseCase {
	public static final String TEXT_RESET = "\u001B[0m";
    // Declaring the color
    // Custom declaration
    public static final String TEXT_YELLOW = "\u001B[33m";
    public void createFaculty() {

        Scanner sc = new Scanner(System.in);


        // this is for colour console
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println(TEXT_YELLOW +"----------------------------Insert Faculty------------------------------"+TEXT_RESET);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println();
        System.out.print("Enter Faculty Name : "); 
        String facultyName = sc.next();
        System.out.print("Enter Faculty Address : ");String facultyAddress = sc.nextLine();

        System.out.print("Enter Mobile Number : "); long mobile = sc.nextLong();
        System.out.print("Enter Email Address : "); String email = sc.next();

        System.out.print("Enter Username : "); String username = sc.next();
        System.out.print("Enter Password : "); String password = sc.next();


        AdminDao dao = new AdminDaoImpl();

        Facalty faculty = new Facalty();

//        faculty.setFacultyId(facultyId);
        faculty.setFacultyName(facultyName);
        faculty.setFacultyAddress(facultyAddress);
        faculty.setMobile(mobile);
        faculty.setEmail(email);
        faculty.setUsername(username);
        faculty.setPassword(password);

        String result = dao.createFaculty(faculty);
        System.out.println();
        System.out.println(result);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        sc.close();
    }

}
