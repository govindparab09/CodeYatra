package com.home.practice2025.set1;

public class GreatestOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 400;
		int b = 200;
		int c = 400;
		int greatest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(greatest + " is largest");	
	}
}
