import java.util.Scanner;

public class pr2 {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number");
        int n =sc.nextInt();

        int original= n;
        int sum =0;
        while(n>0)
        {
            int num =n%10;
            sum = sum+num*num*num;
            n =n/10;


        }
        if(original==sum){
            System.out.println("armstrong");
        }
    }
}
