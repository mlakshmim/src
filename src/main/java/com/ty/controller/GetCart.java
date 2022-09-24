package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.CartDAO;
import com.ty.dto.Cart;

public class GetCart {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	       Cart c=new Cart();
	       CartDAO cd=new CartDAO();
	       
	       System.out.println("Enter id");
	       int id=sc.nextInt();
	       c.setId(id);
	      	    
	       cd.getCart(c);
	       System.out.println(c.getId());
	       System.out.println(c.getEmail());
	       System.out.println(c.getPwd());
	       System.out.println(c.getUsername());
	       System.out.println(c.getAddress());
	       Cart result=cd.getCart(c);
	       System.out.println(result);
	}

}
