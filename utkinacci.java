/**
 * Created by danil on 24.12.16.
 */
import java.util.*;
public class utkinacci {
    public static void main(String[] args) {

    }
    int fib(int n){
        int a=1,ta,b=1,tb,c=1,rc=0,tc,d=0,rd=1;
        while(n){
            Scanner input = new Scanner(System.in);
            System.out.println("print N of utkinacci:");
            n=input.nextInt();
            if (n & 1){
                // Умножаем вектор R на матрицу A
                tc = rc;
                rc = rc*a + rd*c;
                rd = tc*b + rd*d;
            }
            // Умножаем матрицу A на саму себя
            ta = a; tb = b; tc = c;
            a = a*a  + b*c;
            b = ta*b + b*d;
            c = c*ta + d*c;
            d = tc*tb+ d*d;

            n >>= 1;  // Уменьшаем степень вдвое

        }
        return rc;
        }
    }


