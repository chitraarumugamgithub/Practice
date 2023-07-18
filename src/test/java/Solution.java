import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void main(String args[])
    {
        for(int i=1;i<=100;i++)
        {
            if(i%15==0){
                System.out.println("FizzBuzz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else if(i%3==0)
            {
                System.out.println("Fizz");
            }
            else
                System.out.println(i);

        }
    }
}

