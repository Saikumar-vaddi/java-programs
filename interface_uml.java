interface Zepto {

    void z1(String productname, double price);


       default void order(String pname, double pri) {
        System.out.println("hello your order is " + pname + " \n" + pri);
    }
}
 interface zomato{
    void zomat(String prname, double price);

    static void order11(String ppname, double pric)
    {
        System.out.println(ppname+"\n"+pric);
    }
 }

class ecomerce implements Zepto,zomato
{
    @Override
    public void z1(String productname, double price) {
        System.out.println(productname+" \n"+price);
    }

    @Override
    public void zomat(String prname, double price) {
        System.out.println(prname+" "+price);
    }
}



public class interface_uml {
  public  static void main(String[] args) {

      ecomerce e1 =new ecomerce();
      e1.z1("tv",7897868);
      e1.order("bike",989878778);
      e1.zomat("mic",50000);
      zomato.order11("guitar",40000);


    }
}
