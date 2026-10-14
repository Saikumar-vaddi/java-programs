import java.util.Scanner;

public class repeatedarr {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for(int i=0;i< array.length;i++){
            for(int j = i+1 ; j < array.length; j++){
                if(array[i]==array[j]){
                    System.out.println("duplicate array is "+array[i]);
                    break;
                }
            }

        }
    }
}
