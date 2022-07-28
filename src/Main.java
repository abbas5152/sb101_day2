import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cit=new ArrayList<>();

        cit.add("Jamnagar");
        cit.add("Rajkot");
        cit.add("Porbandar");
        cit.add("Ahmedabad");
        cit.add("Vadodara");

        PrintList p= city -> {
           for(String c:city){
               System.out.println(c);
           }

        };
        p.display(cit);
    }
}

interface PrintList {
      abstract void display(List<String> city);
        }
