
public class Student {
private int  roll;
private String name;
//private int eng;
//private int hindi;
//private int math;
int marks[]= new int[3];
public int totalMarks() {
	int sum=0;
	 for(int tm : marks ) {
		 sum+=tm;
	 }
	return sum ;
}
public double percenTage() {
	return totalMarks()/3;
}
public char grade() { 
	if(this.percenTage()>=90.0) {return('A');}
	if(this.percenTage()<90.0 && this.percenTage()>=70.0) {return('B');}
	if(this.percenTage()<70.0 && this.percenTage()>=60.0) {return('C');}
	if(this.percenTage()<60.0) {return ('D');}
	return 'A';
	}
Student(int roll,String name,int marks[]){
	this.roll=roll;
	this.name=StringUtils.tittleCase(name);
//	this.eng=eng;
//	this.hindi=hindi;
//	this.math=math;
	this.marks=marks;
}


public int getRoll() {
	return roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int[] getMarks() {
	return marks;
}
public void setMarks(int[] marks) {
	this.marks = marks;
}
public String print() {
//	System.out.println("Roll No. is "+roll); // sop and scanner never be part of logic class
//	System.out.println("Name is "+name); // these are used for console only.
//	System.out.println("English marks  is "+eng);
//	System.out.println("Hindi marks is "+hindi);
//	System.out.println("Math marks is "+math);
//	System.out.println("Total Marks are "+this.totalMarks());
//	System.out.println("Percentage is "+this.percenTage());
//	System.out.println("Grade is "+this.grade());
	String markStr ="";
	for(int mark:marks) {
		markStr+=mark+"\n";
	}
	return "Roll No. is "+roll+"\nName is  "+name
			+"\nMarks are "+markStr+"Total Marks "+totalMarks()+"\nPercentage"+percenTage()
			+"\nGrade is "+grade();
}
//public void addMarks(int a) {
//	this.eng+=a;//
//	this.hindi+=a;
//	this.math+=a;
//	this.print();
//}
}