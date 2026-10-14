import java.util.Scanner;
public class student {
    public static void main(String[]args){
     Scanner sc =new Scanner(System.in);
     System.out.println("Student details are");
     String name =sc.nextLine();
     int roll_no =sc.nextInt();
     sc.nextLine();
     String branch =sc.nextLine();
     int age = sc.nextInt();
        System.out.println("Student name is " + name);
        System.out.println("Student rollno is " +roll_no);
        System.out.println("Student branch is " +branch);
        System.out.println("Student age is " +age);

    }
}
