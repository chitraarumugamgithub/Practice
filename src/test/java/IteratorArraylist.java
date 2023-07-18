import java.util.*;

public class IteratorArraylist {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
       // Set<String> strList=new HashSet<>();
strList.add("34");
        strList.add("35");

        strList.add("36");
        strList.add("36");//If it is a set there will be a warning for duplicate element also prints only unique value. doesnt get added as set accepts only unique values

//using for-each loop
        for (String obj : strList) {
            System.out.println(obj);
        }

        //using iterator
        Iterator<String> it = strList.iterator();
        while (it.hasNext()) {
            String obj = it.next();
            System.out.println(obj);
        }
    }
}
