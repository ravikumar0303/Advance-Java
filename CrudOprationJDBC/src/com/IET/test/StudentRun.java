package com.IET.test;

import java.util.List;
import java.util.Scanner;

import com.IET.bean.Student;
import com.IET.service.StudentService;
import com.IET.service.StudentServiceImp;

public class StudentRun {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		StudentService ss=new StudentServiceImp();

		int choice = 0; 

		do {
			System.out.println("\n<1>..Add New Student\n<2>..Display All\n<3>..Dispaly By Id\n<4>..Display By Name");
			System.out.println("<5>..Display Sorted Order\n<6>..Sort By Name\n<7>..Modify Student\n<8>..Delete Student\n<9>..Exit");
			System.out.println("\nChoice : ");
			choice = sc.nextInt();
			switch (choice) {
			
			case 1:
				    ss.getNewStudent();
				break;
			case 2:
				
				List<Student> lst=ss.displayAll();
				lst.forEach(System.out::println);
				break;
				
			case 3:
				    System.out.println("Enter your id");
				    int id=sc.nextInt();
				    Student s=ss.displayById(id);
				    if(s!=null) {
				    	System.out.println(s);
				    }
				    else {
				    	System.out.println("Student not Found !");
				    }
				break;
			case 5:
				 lst=ss.displaySorted();
				 lst.forEach(System.out::println);
				break;
			case 8:
				  System.out.println("Enter delete ID..");
				   id=sc.nextInt();
				   boolean status=ss.deleteById(id);
				   if(status) {
					   System.out.println("ID deleted...");
				   }
				   else {
					   System.out.println("ID not Found !");
				   }
				break;
			case 9:
				ss.closeConnection();
				System.out.println("Thank's For Visiting.....\n<..Have A Grate Day..>");
				break;
			default :
			}
		} while (choice != 9);

	}

}
