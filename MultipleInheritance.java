interface Parent1{
    public void print();
    default void display(){
        System.out.println("This is herre");
    }
}

interface Parent2{
    public void show();
}

public class MultipleInheritance implements Parent1, Parent2{
    public void print(){
        System.out.println("Print");
    };
    public void show(){
        System.out.println("show");
    }
    public static void main(String[] args) {
        MultipleInheritance o = new MultipleInheritance();
        o.show(); o.print();
        o.display();
    }
}
