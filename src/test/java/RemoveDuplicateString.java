import net.bytebuddy.dynamic.scaffold.MethodGraph;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateString {
    public static void main(String[] args)
    {
        String[] StrFood={"pizza","fries","burger","brownie","pizza"};
    System.out.println("String"+ Arrays.toString(StrFood));
    LinkedHashSet<String> lhSet= new LinkedHashSet<String>(Arrays.asList(StrFood));
    String[] NewFood = lhSet.toArray(new String[lhSet.size()]);
        System.out.println("new string"+ Arrays.toString(NewFood));


    }
}
