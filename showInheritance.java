class Parent{
    Parent(){
        System.out.println("Object Initialised.");
    }

    void show(){
        System.out.println("Function from parent");
    }

    static void display(){
        System.out.println("This is a static function");
    }
}

public class showInheritance extends Parent{
    public static void main(String[] args) {
        Parent o = new Parent();
        o.show();
        Parent.display();
    }
}
