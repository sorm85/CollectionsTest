package exercises;

import java.util.Scanner;

public class Palindrome {
    public Palindrome () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe la palabra: ");
        String str = scan.nextLine();
        System.out.println("La palabra "+str+" "+isPalindrome(str));
    }

    private String isPalindrome(String str) {
        String response = "no es un palindromo";
        char [] palindrome = str.toCharArray();

        for (int i = 0; i < palindrome.length; i++) {
//            System.out.println(palindrome[i]+" y "+palindrome[palindrome.length-1-i]);
            if (palindrome[i] != palindrome[palindrome.length-1-i]){
                return response;
            }
        }

        return "es un palindromo";
    }

}
