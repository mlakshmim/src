package com.ty.controller;

import java.util.List;

import com.ty.dto.Cart;
import com.ty.dao.CartDAO;

public class GetAllCart {

	public static void main(String[] args) {
		List<Cart> r=cd.getAllCart();
		for(Cart k:r) {
			System.out.println(k);
		}

	}

}
