package Session6_4;

import java.util.Scanner;

public class TestStudent {
	static int rollNo, regNo;
	static String name;
	

	public static void main(String[] args) {

		System.out.println("Enter Student Name");
		Scanner read=new Scanner(System.in);
		name=read.nextLine();
						
		System.out.println("Enter Roll no:");
		Scanner read1=new Scanner(System.in);
		rollNo=read1.nextInt();

		System.out.println("Enter Registration no:");
		Scanner read2=new Scanner(System.in);
		regNo=read2.nextInt();
		
		StudentEntDis s1=new StudentEntDis(rollNo, regNo, name);
		s1.detailsDisplay();
		
	}

}
