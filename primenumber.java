// Optimised version of prime number
import java.util.*;

class Student {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 2; i <= n; i++) {
            int count = 0;
            for(int j = 2; j < i; j++) {  // fix: j < i
                if(i % j == 0) {
                    count++;
                }
            }
            if(count == 0) {  // fix: should be count == 0
                System.out.print(i + " ");
            }
        }
    }
}
