import java.util.ArrayList;
import java.util.List;


public class Fib {
    public static void main() {
        long num1, num2, num3;
        List<Long> fibonnaci = new ArrayList<>(List.of(1L, 1L));
        for (int i = 0; i < 100; i++) {
            num1 = fibonnaci.get(i);
            num2 = fibonnaci.get(i + 1);
            num3 = num1 + num2;
            if (Long.signum(num3) == -1) {
                System.out.printf("This is the fibonnaci sequence to %d place(s)\n", (i - 1));
                break;
            }
            fibonnaci.add(num3);
        }
        System.out.print(fibonnaci);
    }
}
