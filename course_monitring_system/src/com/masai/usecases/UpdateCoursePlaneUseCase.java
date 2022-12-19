package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;

public class UpdateCoursePlaneUseCase {
	public void updateCoursePlan() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Plan Id : "); 
        int planId = sc.nextInt();
        System.out.println();
        System.out.println("Enter Updated Value");
        System.out.println();

        System.out.print("Enter Batch Id : ");
        int batchId = sc.nextInt();
        System.out.print("Enter Day Number : "); 
        int dayNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Topic : ");
        String topic = sc.nextLine();
        System.out.print("Enter Status(completed/pending) : " );
        String status = sc.next();


        AdminDao dao = new AdminDaoImpl();
        String result =dao.updateCoursePlan(planId,batchId,dayNumber,topic, status);
        System.out.println(result);
        sc.close();

    }

}
