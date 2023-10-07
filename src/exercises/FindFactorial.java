package exercises;

import java.math.BigInteger;
import java.util.Scanner;

public class FindFactorial {

    public FindFactorial () {
        System.out.println("dame un número: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("El factorial con long de "+number+ " es: "+getFactorial(number));
        System.out.println("El factorial con BigInteger de "+number+ " es: "+getFactorialBig(number));

    }

    public long getFactorial (int number) {
        long result = 1L;
        for (int i = 1; i <= number; i++) {
            result *= i;

        }

        return result;
    }
    public BigInteger getFactorialBig ( int number ) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number ; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
