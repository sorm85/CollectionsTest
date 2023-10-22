package exercises;

import java.util.regex.Pattern;

public class StringSplit {
    public StringSplit () {
        StringStr();
    }
    protected void StringStr () {
        String s = "fdfdfd ";
        s = s.strip();
        s = s.replaceAll("[^A-Za-z]+", " ");
        String []  parts = s.split(" ");
        if (s.isBlank()){
            System.out.println(0);
        } else {
            System.out.println(parts.length);
        }

        for (String str : parts){
            System.out.println(str);
        }
    }
    protected void patternExample () {
        int testCases = 1;
        while(testCases>0){
            String pattern = "[AZ[a-z](a-z)";
            //Write your code
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception ie) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
