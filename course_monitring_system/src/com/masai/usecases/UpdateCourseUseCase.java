package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exceptions.AdminException;

public class UpdateCourseUseCase {
	@SuppressWarnings("resource")
	public void updateCourse() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Course ID : ");
        int courseId = sc.nextInt();

        // waiting..... wala code

        System.out.print("Enter Update Course Name : ");
        String courseName = sc.nextLine();

        System.out.print("Enter Update Fees : ");
        long fee = sc.nextLong();

        System.out.print("Enter Update Course Description : ");
        String description = sc.nextLine();

        AdminDao dao = new AdminDaoImpl();

        try {
            String msg = dao.updateCourse(courseId,courseName,fee,description);

            System.out.println(msg);

        } catch (AdminException e) {
            throw new RuntimeException(e);
        }
        sc.close();


    }

}
