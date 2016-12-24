import java.math.BigInteger;
import java.util.*;
/**
 * Created by danil on 23.12.16.Stepanachi...
 */

public class nextStep {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long Stepanachi;
        System.out.print("Print index of Stepanachi:");
        Stepanachi = input.nextInt();
        BigInteger StepanachiNumbera = BigInteger.ZERO;
        BigInteger StepanachiNumber = BigInteger.ONE;

        for (int k = 2; k < Stepanachi; k++) {
                StepanachiNumber = StepanachiNumbera.add(StepanachiNumber);
                StepanachiNumbera = StepanachiNumber.subtract(StepanachiNumbera);
            }

        System.out.println(StepanachiNumber);

    }

}

