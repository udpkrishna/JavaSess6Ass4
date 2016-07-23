package Session6_4;

public class StudentEntDis extends Student{

	
	public StudentEntDis(int mrollNo, int mregNo,String mname ) {
		super.name=mname;
		super.regNo=mregNo;
		super.rollNo=mrollNo;
		
		
				
	}
	public void detailsDisplay(){		
		System.out.println("Student name is "+super.name);
		System.out.println("Student registration number is "+super.regNo);
		System.out.println("Sutdent roll no is "+super.rollNo);
	}

}
