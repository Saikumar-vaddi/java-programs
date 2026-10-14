import java.util.Scanner;

public class multi_arr {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]array1=new int[r][c];
        int[][]array2=new int[r][c];
        int[][]array3=new int[r][c];
        System.out.println("Enter the elements of 1st matrix");
        for(int i=0 ;i< r;i++)
        {
            for(int j=0;j<c;j++){
                array1[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd matrix");
        for(int i=0 ;i<r;i++)
        {
            for(int j=0;j<c;j++){
                array2[i][j]= sc.nextInt();
            }
        }
        System.out.println("Substraction of 2 matrix");
        for(int i=0 ;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                array3[i][j]= array2[i][j]*array1[i][j];
            }
        }
        for(int i=0 ;i<r;i++)
        {
            for(int j=0; j<c ;j++)
            {
                System.out.print(array3[i][j]+" ");
            }
            System.out.println();
        }



    }
}
