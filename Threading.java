public class Threading extends Thread{
    public void run(){
        System.out.println("Thread is Reunning....");
    }
    public static void main(String[] args){
        System.out.println(args);
        Threading o = new Threading();
        o.start();
    }
}

// public is acces specifier
// static is used for memory management as we did not need to create a object to use it
// void is a return type
// main() is a signature method
// String[] args is used for command line arguments, here variable name can be changed but String[] cannot be changed
// By default JVM searches for public static void main(String[] args) function
