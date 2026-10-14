import java.util.Scanner;
public class user_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter any number");
        int N =sc.nextInt();
        if(N%2==0){
            System.out.println("even number");
        }
        else if (N%2!=0){
            System.out.println("odd number");
        }
    }

}
