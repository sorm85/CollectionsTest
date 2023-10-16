package exercises;

import java.util.Scanner;

public class Anagram {
    public Anagram() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Escribe la 1ra palabra: ");
//        String str1 = scan.nextLine();
//        System.out.println("Escribe la 2da palabra: ");
//        String str2 = scan.nextLine();
//        System.out.println("Las palabras "+isAnagram(str1,str2));


//        abecedario();

        System.out.println("el resultado es : "+isAnagram2("aaabbb","bbaaa"));
    }

    private String isAnagram(String str1, String str2) {
        String response = "son anagramas";
        if (str1.length() != str2.length()){
            return "no son anagramas";
        }

        char [] strChar1 = str1.toCharArray();
        char [] strChar2 = str2.toCharArray();



        for (int i = 0; i <strChar2.length ; i++) {
            System.out.println(strChar2[i]+" y "+strChar1[strChar1.length-1-i]);
            if (strChar2[i] != strChar1[strChar1.length-1-i]){
                return "No son anagramas";
            }
        }


        return response;
    }
    protected void abecedario () {
        char[] s;
        s=new char[26];
        for ( int i=0; i<26; i++) {
            s[i] = (char) ('A' + i );
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
    static boolean isAnagram2(String a, String b) {

        if (a.length() != b.length()){
//            System.out.println("return false en length");
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();

        char [] str1 = a.toCharArray();
        char [] str2 = b.toCharArray();

        char [] abc = new char [26];
        for (int i = 0; i < abc.length; i++) {
            abc[i] = (char) ('a' + i);
        }
        for (int i = 0; i < abc.length; i++) {
            int indexA = 0;
            int indexB = 0;

            for (int j = 0; j < str1.length; j++) {
                if (abc[i] == str1[j]){
                    indexA++;
                }
            }
            for (int j = 0; j < str2.length; j++) {
                if (abc[i] == str2[j]){
                    indexB++;
                }
            }
            if(indexA != indexB){
                return false;
            }
        }

        return true;
    }

}
