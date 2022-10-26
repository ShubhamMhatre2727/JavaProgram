import java.text.*;
import java.util.*;

public class FormatDate {
    public static void main(String args[]){
        SimpleDateFormat ft = new SimpleDateFormat("E dd MMMM yyyy");

        String dt = ft.format(new Date());
        System.out.println(dt);
    }
}
