public class array2sum {
    public static void main(String[] args){
        int []num ={3,4,6,8,9};
        int sum=0;
        for(int i=0;i< num.length;i++){
          sum=sum+num[i];
        }
        System.out.println("sum is "+ sum);
        int avg=sum/num.length;
        System.out.println("avg is "+ avg);
    }
}
