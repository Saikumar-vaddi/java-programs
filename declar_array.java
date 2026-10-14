import java.util.Scanner;

public class declar_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ente any number");
        int n=sc.nextInt();
        int[]num=new int[n];
        num[0]=12;
        num[3]=24;
        num[4]=64;
        for(int i=0;i< num.length;i++){
            System.out.println(""+num[i]);
        }

    }
}
