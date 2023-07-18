
// Java program for the above approach

import java.util.Scanner;

class Fibonacci {

    // Function to print N Fibonacci Number
     static void FibSeries(int start, int N)
    {
        int num1 = start, num2 = num1+1;
int counter=0;
       while(counter<N){
           System.out.print(num1+" ");

           int  num3=num1+num2;
           num1=num2;
           num2=num3;
           counter=counter+1;
       }
    }

    // Driver Code
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);

        // Given Number N
        int N = s.nextInt();
        System.out.println("Enter the starting number");
        Scanner start= new Scanner(System.in);


        int StartingNum=start.nextInt();
        // Function Call
     //   FibSeries(StartingNum,N);
        Fibonacci fb= new Fibonacci();
        for(int i=2;i<=N;i++){
        fb.prime(i);}
    }

      void prime(int n)
    {
        int num=n;

        int m=num/2;

        if(num%m ==0)
        {
            System.out.println(num+"not a prime");
        }
        else {
            System.out.println(num+" prime");
        }



       }

    }

