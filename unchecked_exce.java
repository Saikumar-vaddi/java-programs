public class unchecked_exce {
    static void main(String[] args) {
        int a = 6;
        int b = 2;

        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("AM" + e);
        }
        finally{
            System.out.println("heee");
        }
    }
}
