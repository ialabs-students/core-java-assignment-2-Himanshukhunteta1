package com.javaAssignment1;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class ArrayListSort {
	
	ArrayList<BigInteger> arrayListSortDesc(ArrayList<BigInteger> array){

		Collections.sort(array,Collections.reverseOrder());

		return array;

		}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ArrayList<BigInteger> array = new ArrayList<BigInteger>();

		System.out.println("Enter number of elements you wish to input");

		int n = sc.nextInt();

		for(int i=0;i<n;i++) {

		System.out.println("Enter element");

		array.add(sc.nextBigInteger());

		}

		System.out.println("ArrayList before sorting: ");

		System.out.println(array);

		System.out.println("ArrayList after sorting:");

		ArrayListSort object = new ArrayListSort();

		object.arrayListSortDesc(array);

		System.out.println(array);

		sc.close();

		}

		
		
	}

