package org.day4.gettext;

import java.util.Scanner;

public class Day4Assignment {
public static void main(String[] args) {
	for(int num=1; num<=100; num++) {
		
		int i,j=0;
		
		int a=num;
		
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		
				if(num==j) {
			System.out.println(j);
			System.out.println(j);
			System.out.println(j);
					
		}
	}
	
	
}
}
