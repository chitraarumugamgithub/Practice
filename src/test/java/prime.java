import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prime {

        public static void main(String args[]) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bf.readLine().trim());
            for(int j=0;j<=n;++j){
                checkprime(j);
            }

            }

static void checkprime(int n) {


    int i, m = 0, flag = 0;
    m = n / 2;
    if (n == 0 || n == 1) {
        System.out.println(n + " is not prime number");
    } else {
        for (i = 2; i <= m; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not prime number");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println(n + " is prime number");
        }
    }//end of else
}
}