import java.util.Scanner;

public class pyramid {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" "); //space
            }
            for(int k=1;k<=2*i-1; k++)
            {
                System.out.print("*"); //stars
            }
            System.out.println(); //next row
        }

    }
}
