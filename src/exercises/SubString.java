package exercises;

public class SubString {

    public SubString () {
        firstSubString(3,7,"Helloworld");
    }
    protected void firstSubString (int start, int end, String str) {
        String result = str.substring(start,end);
        System.out.println(result);
    }
}
