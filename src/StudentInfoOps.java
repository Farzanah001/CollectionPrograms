import java.util.ArrayList;
import java.util.Scanner;

public class StudentInfoOps {


    public static void main(String[] args) {
        AddData addstud=new AddData();

        int choice;
        Scanner scan=new Scanner(System.in);

       do{
           System.out.println("STUDENT DETAILS - MENU");
           System.out.println("\t1. Add Student Data");
           System.out.println("\t2. Print the ArrayList");
           System.out.println("\t3. Insert an Element");
           System.out.println("\t4. Remove an Element");
           System.out.println("\t5. Search a Student");
           System.out.println("\t6. Copy the ArrayList to Another.");
           System.out.println("\t7. Update an Element");
           System.out.println("\t8. Sort the Data by Name");
           System.out.println("\t9. Exit");
//          
//           System.out.println("\t5. Update an Element.");
//           System.out.println("\t6. Search for a Student.");
//           System.out.println("\t7. Remove an Element.");
//           System.out.println("\t8. Sort the ArrayList based on Names.");
//           System.out.println("\t9. Copy the ArrayList to Another.");
//           System.out.println("\t10. Shuffle Student Info.");
           System.out.println("Enter your choice:");
           choice= scan.nextInt();
           switch (choice){
               case 1:
                   addstud.addData();
                   break;
               case 2:
                   PrintData.printData(addstud.getStudent());
                   break;
               case 3:
                   addstud.insertData();
                   break;
               case 4:
                   addstud.removeData();
                   break;
               case 5:
                    addstud.searchStudent();
                    break;
               case 6:
                   addstud.copyStudentArray();
                   break;
               case 7:
                   addstud.updateStudent();
                   break;
               case 8:
            	   addstud.sortData();
            	   break;
               case 9:
                   System.exit(0);
                   break;
               default:
                   System.out.println("Invalid Choice!");

           }

       }while (choice<=4);


      //  }while(blankstr.equals("YES"));
        //iterate through the arraylist and print the collection
//        for(StudentPojo st:Student) {
//            System.out.println("Name:"+st.getName());
//            System.out.println("Age:"+st.getAge());
//            System.out.println("Roll Number:"+st.getRollno());
//            System.out.println("Email Address:"+st.getEmail());
//            System.out.println();
//        }
//        //insert an element to the 1st position of the list
//        System.out.println("Enter the Info to be added in Position 1");
//
//        Student.add(1,)

        }




}
