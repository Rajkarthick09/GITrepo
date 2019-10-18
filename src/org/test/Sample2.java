package org.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sample2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Set<Integer>b=new TreeSet<>();
		System.out.println("enter tha values to find");
		
		for(int i=0;i<10;i++)
		{
			int a = s.nextInt();
			b.add(a);
			
		}
		System.out.println(b);
		
		
		
	}
}
