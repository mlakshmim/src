package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.CartDAO;
import com.ty.dto.Cart;

public class UpdateCart {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	       CartDAO cd=new CartDAO();
	      
	       System.out.println("Enter id");
	       int id=sc.nextInt();
	      
	       System.out.println("Enter Email");
	       String email=sc.next();
	  
	       System.out.println("Enter password");
	       String password=sc.next();
	   
	       System.out.println("Enter username");
	       String username=sc.next();
	       
	       System.out.println("Enter address");
	       String address=sc.next();
	     
	       Cart c=new Cart(id,email,password,username,address);
	       Cart result=cd.updateCart(c);
	       System.out.println(result);
		}

}
