package exercises;

import java.util.Scanner;

public class Anagram {
    public Anagram() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe la 1ra palabra: ");
        String str1 = scan.nextLine();
        System.out.println("Escribe la 2da palabra: ");
        String str2 = scan.nextLine();
        System.out.println("Las palabras "+isAnagram(str1,str2));
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

}
