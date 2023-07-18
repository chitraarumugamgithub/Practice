import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternMatch {
    public static void main( String args[] ) {
        String regex = "[0123456789]";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string");
        String input = sc.nextLine();
String newText="";
        //Compiling the regular expression
        Pattern.compile(regex);
        regex = Pattern.quote(regex);
        System.out.println("pattern string: "+regex);
        //Compiling the regular expression
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        for(int i=0;i<input.length();i++) {

         //   if (matcher.find()) {
                newText=newText+input.charAt(i);

         //   }
        }
        System.out.println("newText"+newText);
    }
}