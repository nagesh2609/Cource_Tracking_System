package com.masai.usecases;

import java.util.Scanner;

import com.masai.authentication.AuthenticImpl;
import com.masai.authentication.Authentication;
import com.masai.exceptions.AdminException;

import static com.masai.authentication.AuthenticImpl.*;

public class LoginUsecase {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(BLACK_BACKGROUND+WHITE_BOLD_BRIGHT+"%%%%%%%%%%%%%%%%%%%%%%%%________Login_________%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"+TEXT_RESET);
        System.out.println();
        System.out.print("Enter Username : "); String username = sc.next();
        System.out.print("Enter Password : "); String password = sc.next();
        System.out.println();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        AuthenticImpl auth = new AuthenticImpl();

        try {
            String x = auth.login(username,password);
            if(x == null){}
            else{
                System.out.println(x);
            }

        } catch (AdminException e) {
            throw new RuntimeException(e);
        }
        sc.close();
    }

    @SuppressWarnings( "resource")
	public void loginBack() {
        Scanner sc = new Scanner(System.in);
        System.out.println(BLACK_BACKGROUND+WHITE_BOLD_BRIGHT+"%%%%%%%%%%%%%%%%%%%%%%%%________Login_________%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"+TEXT_RESET);
        System.out.println();
        System.out.print("Enter Username : "); String username = sc.next();
        System.out.print("Enter Password : "); String password = sc.next();
        System.out.println();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        Authentication auth = new AuthenticImpl();

        try {
            String x = auth.login(username,password);
            if(x == null){}
            else{
                System.out.println(x);
            }

        } catch (AdminException e) {
            throw new RuntimeException(e);
        }
        sc.close();
    }
}