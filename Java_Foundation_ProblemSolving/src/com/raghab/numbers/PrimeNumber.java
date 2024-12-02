/*
 *  Prime number is a number that is greater than 1 and divided by 1 or itself only. 
 *  In other words, prime numbers can't be divided by other numbers than itself or 1. 
 *  For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 *  
 *  Note: 0 and 1 are not prime numbers. 
 *  The 2 is the only even prime number because all the other even numbers can be divided by 2.
 */

package com.raghab.numbers;

import java.util.Scanner;

public class PrimeNumber {
	public static void checkPrime(long n) {
		int count=0;
		for(long div=2l;div * div <= n;div++) {
			if(n % div == 0) {
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println(n+" is Prime Number");
		}else {
			System.out.println(n+ " is not Prime Number");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		
		long num=sc.nextLong();
		checkPrime(num);
	}

}