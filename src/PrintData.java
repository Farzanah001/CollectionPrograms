import java.util.ArrayList;

public class PrintData {
    public static void printData(ArrayList<StudentPojo> Student) {
        for(StudentPojo st:Student) {
            System.out.println("Roll Number:"+st.getRollno());
            System.out.println("Name:"+st.getName());
            System.out.println("Age:"+st.getAge());
            System.out.println("Email Address:"+st.getEmail());
            System.out.println();
        }
    }
}
