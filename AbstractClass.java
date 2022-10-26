abstract class Top{
    abstract void print();
}

public class AbstractClass extends Top {
    void print(){System.out.println("print");}
    public static void main(String[] args) {
        AbstractClass o = new AbstractClass();
        o.print();
    }
}

