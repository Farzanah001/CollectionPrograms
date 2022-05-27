import java.util.ArrayList;
import java.util.Scanner;

public class AddData {
    ArrayList<StudentPojo> Student=new ArrayList<>();


    public ArrayList<StudentPojo> getStudent() {
        return Student;
    }

    public void setStudent(ArrayList<StudentPojo> student) {
        Student = student;
    }

    public void addData(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number of Students: ");
        int n= scan.nextInt();
        //int rollno=101;
        for(int i=0;i<n;i++)
        {
            StudentPojo student=new StudentPojo();
            System.out.println("Enter Register Number: ");
            student.setRollno(scan.nextInt());
            scan.nextLine();
            System.out.println("Enter Student Name:");
            student.setName(scan.nextLine());

            System.out.println("Enter Student Age:");
            student.setAge(scan.nextInt());

            // scan.nextLine();
            System.out.println("Enter Student Email:");
            student.setEmail(scan.next());

            Student.add(student);
        }
    }
    public void insertData(){
        StudentPojo student=new StudentPojo();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Register Number: ");
        student.setRollno(scan.nextInt());
        scan.nextLine();
        System.out.println("Enter Student Name:");
        student.setName(scan.nextLine());

        System.out.println("Enter Student Age:");
        student.setAge(scan.nextInt());

        // scan.nextLine();
        System.out.println("Enter Student Email:");
        student.setEmail(scan.next());
        System.out.println("Enter the Position to add the Elements: ");
        int position= scan.nextInt();
        Student.add(position,student);
    }

    public void removeData() {
        StudentPojo student=new StudentPojo();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Index Position to Remove: ");
        int rem=s.nextInt();
        Student.remove(rem);
    }

    public void searchStudent() {
        StudentPojo student=new StudentPojo();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Register Number of the Student to Search: ");
        int regno=s.nextInt();
        for(StudentPojo stud:Student)
        {
            if(stud.getRollno()==(regno)) {
                System.out.println(stud.toString());
            }
        }
    }

    public void copyStudentArray() {
        StudentPojo student=new StudentPojo();
        ArrayList<StudentPojo> StudentCopy=Student;
        System.out.println("Copied Student Info ArrayList:");
        PrintData.printData(StudentCopy);
        }


    public void updateStudent() {
    	StudentPojo student=new StudentPojo();
    	System.out.println("\nEnter the Student Register Number: ");
    	Scanner s=new Scanner(System.in);
    	int reg=s.nextInt();
    	StudentPojo stud=null;
    	for(StudentPojo studinfo:Student) {
    		if(studinfo.getRollno()==reg) {
    			stud=studinfo;
    			break;
    		}
    		
    	}
    	if(stud!=null) {
    		String ans;
    		int choice;
    		do{
    			System.out.println("Which data you want to change?");
    			System.out.println("1.Name \t2.Age \t3.Email Address \t4.Done");
    			System.out.println(">>>");
    			choice=s.nextInt();
    			switch(choice) {
    			case 1:
    				System.out.println("Enter the Name: ");
    				stud.setName(s.next());
    				System.out.println("Data Updated successfully!");
    				break;
    			case 2:
    				System.out.println("Enter the Age: ");
    				stud.setAge(s.nextInt());
    				System.out.println("Data Updated successfully!");
    				break;
    			case 3:
    				System.out.println("Enter the Email Address: ");
    				stud.setEmail(s.next());
    				System.out.println("Data Updated successfully!");
    				break;
    			case 4:
    				break;
    			default:
    				System.out.println("Invalid Choice!(Choice Range:1-3)");	
    			}
//    			System.out.println("Do You Want to Continue?(yes/no)");
//    			ans=s.next();
    		}while(choice<=4);
    	}
    	
    }

	public void sortData() {
		
		
	}
}

