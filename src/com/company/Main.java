package com.company;

public class Main {

    public static void main(String[] args) {
	int x= (int) (Math.random()*100);
	if (x%10==0) {
	    System.out.println("Число заканчивается на ноль.");
    }
    else {
	    System.out.println("Число не заканчивается на ноль.");
    }
    }
}
