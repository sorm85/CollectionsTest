package exercises;

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

}
