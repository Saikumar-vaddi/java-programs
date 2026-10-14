import java.io.FileNotFoundException;
import java.io.FileReader;

public class exception {
    static void main(String[] args) {
        try {
            FileReader obj = new FileReader("demo.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("file not found" +e);

        }
        catch(Exception e){

            System.out.println("hello" +e);
        }
    }
}
