package exercises;

public class ReversNumber {

    public ReversNumber (int number) {
//        int number = 9876;
        int response = getReverseNumber(number);
        System.out.println("la reversa del numero: "+number+" es: "+response);
    }

    private int getReverseNumber(int number) {
        int result = 0;

        for (int i = 0; i <=  9 ; i++) {
            int temp = number;
            while (temp > 0){
                if (temp % 10 == i) {
                    result = result * 10 + i;
                }
                temp /=10;
            }

        }
        return result;
    }
}
