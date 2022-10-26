import java.io.*;
public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            FileInputStream fs = new FileInputStream("test.text");
            // int i = 100/0;
        }
        catch(FileNotFoundException | ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
