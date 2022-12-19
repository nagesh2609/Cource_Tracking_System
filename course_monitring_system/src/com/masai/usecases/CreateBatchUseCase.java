package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.model.Batch;

public class CreateBatchUseCase {
	public static final String TEXT_RESET = "\u001B[0m";
    // Declaring the color
    // Custom declaration
    public static final String TEXT_YELLOW = "\u001B[33m";
    public void createBatch() {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println(TEXT_YELLOW +"----------------------------Insert Batch------------------------------"+TEXT_RESET);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println();
        System.out.print("Enter Course ID : "); int courseId = sc.nextInt();
        System.out.print("Enter Faculty ID : "); int facultyId = sc.nextInt();


        System.out.print("Enter Number Of Students : "); int numberofStudents = sc.nextInt();
        System.out.print("Enter Batch Start Date : "); String batchStartDate = sc.next();
        System.out.print("Enter Duration : "); int duration = sc.nextInt();

        AdminDao dao = new AdminDaoImpl();

        Batch batch = new Batch();

        batch.setCourseId(courseId);
        batch.setFacultyId(facultyId);

        batch.setNumberofStudents(numberofStudents);
        batch.setBatchStartDate(batchStartDate);
        batch.setDuration(duration);

        String result = dao.createBatch(batch);
        System.out.println();
        System.out.println(result);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        sc.close();
    }

}
