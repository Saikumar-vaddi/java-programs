import java.util.Scanner;

public class count_arra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i:array){
            if(i%2==0){
                even++;

            }
            else{
                odd++;
            }

        }
        System.out.println("even number is "+even);
        System.out.println("odd number is "+odd);
    }
}