class pay_options{
    String username;
    int phone_no;
    double amount;
    String transcation_Id;
   void detail(String username, int phone_no, double amount){
        this.username=username;
        this.phone_no=phone_no;
        this.amount=amount;

    }

}
class gpay extends pay_options{
    void p1details(String username,int phone_no,double amount){
        super.detail(username,phone_no,amount);
            System.out.println("gpay" + username+" "+phone_no+ " "+amount);
        }
    }




public class payment {
   public static void main(String[] args) {
        gpay p1 =new gpay();
        p1.p1details("sai",467877678,7000);
    }
}
