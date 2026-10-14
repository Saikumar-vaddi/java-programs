import java.util.Scanner;

public class user_arra{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ente any number");
        int n=sc.nextInt();
        int[]num=new int[n];
        System.out.println("enter the number");
        for(int i=0;i< num.length;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("details are");
        for(int i=0;i< num.length;i++){
            System.out.println(num[i]);
        }
    }
}
