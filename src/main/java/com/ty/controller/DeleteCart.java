package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.CartDAO;
import com.ty.dto.Cart;

public class DeleteCart {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	       Cart c=new Cart();
	       CartDAO cd=new CartDAO();
	       System.out.println("Enter Integer");
	       int n=sc.nextInt();
	       System.out.println("Enter id");
	       int id=sc.nextInt();
	       c.setId(id);
	       Cart result=cd.saveCart(c);
	       System.out.println(result);
	}

}
