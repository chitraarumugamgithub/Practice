import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;



public class Dupstring{
    public  static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine().trim();

        uniqueLetters(n);;

        bufferedReader.close();
    }


    public static void uniqueLetters(String n) {

        char[] c=n.toCharArray();
        Set<Character> charset = new LinkedHashSet<Character>();

        for(char ch:c)
        {
            if(!charset.add(ch))
                charset.add(ch);
        }
        StringBuffer sb = new StringBuffer();
        for (char cr:charset){
            sb.append(cr);
        }

        System.out.println(sb.toString());
    }

    public static void uniqueNumbers(String n) {

        int num=Integer.parseInt(n);

        char[] c=n.toCharArray();
        Set<Character> charset = new LinkedHashSet<Character>();

        for(char ch:c)
        {
            if(!charset.add(ch))
                charset.add(ch);
        }
    int addNum =0;
    for(int i=0;i<= charset.size();i++)
    {
  //      addNum=addNum+charset.toArray(charset[i]);
    }

        System.out.println("added"+charset.toString());
    }
}


