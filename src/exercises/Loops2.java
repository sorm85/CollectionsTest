package exercises;

import java.util.ArrayList;
import java.util.List;

public class Loops2 {

    public Loops2 () {
        int t=1;
        for(int i=0;i<t;i++) {
            List<Integer> list = new ArrayList<>();
            int a = 0;
            int b = 2;
            int n = 10;

            int result = 0;
            int multiply = 2;
            result = b;
            result += a;
            System.out.print(result+" ");
            for (int j = 0; j < n-1; j++) {

                result += multiply * b;
                multiply+=multiply;

                // list.add(result);
                System.out.print(result+" ");

            }
            System.out.println();
        }
    }
}
