import java.util.Scanner;

public class min_array {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n =sc.nextInt();
        int[]array=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
        int min=array[0];
        for(int i=0;i< array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("smallest number is " +min);
    }
}
