package exercises;

import java.util.ArrayList;
import java.util.List;

public class SubString {

    public SubString () {
//        firstSubString(3,7,"Helloworld");
        firstAndFinalLexico(3,"welcometojava");
    }
    protected void firstSubString (int start, int end, String str) {
        String result = str.substring(start,end);
        System.out.println(result);
    }
    protected void firstAndFinalLexico (int n , String str) {
        List<String> lexico = new ArrayList<>();
        int index =  0;


        for (int i = 0; i < str.length() - n+1; i++) {
            String sub = str.substring(i, i+n);
            lexico.add(sub);
        }

        //Collections.sort(lexico); solo funciona en java 15/17

        String smallest = lexico.get(0);
        String largest = lexico.get(str.length()-n);

        System.out.println(smallest);
        System.out.println(largest);
        System.out.println(lexico);
    }
}
