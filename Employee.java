package org.polymorphism;

import java.util.Scanner;

public class Employee {
private void empId(String name) {
	 System.out.println("the employee name is " +name);
}
private void empId(int id) {
	System.out.println("the employee id is " +id);
}
private void empId(long phno) {
System.out.println("the employee phone number is " +phno);
}
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	Employee d=new Employee();
String name=s.next();
	d.empId(name);
int id=s.nextInt();
	d.empId(id);
long phno=s.nextLong();
	d.empId(phno);
	d.empId(id);

	
}


}
