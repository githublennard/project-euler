import java.util.ArrayList;
import java.util.Collections;

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/
//**This Code find the largest palindromic number.
public class Problem4 {
    private static ArrayList<Integer> palindro;

    private static boolean isPalindrome(String number) {
        char[] array = number.toCharArray();
        return (array.length == 6 && array[5] == array[0] && array[4] == array[1] && array[3] == array[2]);
    }

    public static void main(String[] args) {
        palindro = new ArrayList<Integer>();
        int num1 = 999;
        int num2 = 999;
        while (num1 >= 100 && num2 >= 100 && palindro.size() < 100) {
            System.out.println("\n" + "Numeros que inician en el metodo checkNumbers: " + num1 + " and " + num2);
            int aux = num2;
            while (aux >= 100) {
                int product = num1 * aux;
                String number = "" + product;
                boolean numberChecking = isPalindrome(number);
                if (numberChecking == true) {
                    System.out.println("Numero que es palindromo dentro del metodo checkNumbers es: " + product);
                    palindro.add(product);
                }
                aux--;
            }
            num1--;
            num2--;
        }
        int maximo = Collections.max(palindro);
        System.out.println("Solucion del Ejercicio: " + maximo);
    }
}