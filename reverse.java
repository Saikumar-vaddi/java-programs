import java.util.Scanner;

public class reverse {
    static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array elements");
        int n=sc.nextInt();
        int [] array = new int[n];
        for(int i=0; i < n; i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("reverse of array");

        for(int i=n-1;i>=0;i--)
        {
            System.out.println(array[i] + " ");
        }
    }
}
