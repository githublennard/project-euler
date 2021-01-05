import java.util.ArrayList;
import java.util.Collections;

public class Problema4 {
    public static ArrayList<Integer> palindro;

    /*
        A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
        Find the largest palindrome made from the product of two 3-digit numbers.
    */
    //**This Code find the largest palindromic number.
    static void checkNumbers(int num1, int num2) {
        System.out.println("Numeros que inician en el metodo checkNumbers: " + num1 + "  " + num2);
        for (int aux = num1; aux >= 100; aux--) {
            int multi = aux * num2;
            String number = "" + multi;
            char[] array = number.toCharArray();
            if (array.length == 6 && array[5] == array[0] && array[4] == array[1] && array[3] == array[2]) {
                System.out.println("El Numero Palindromico es: " + multi);
                palindro.add(multi);
            }
        }
    }

    public static void main(String[] args) {
        palindro = new ArrayList<Integer>();
        int num1 = 999;
        int num2 = 999;
        while (num1 >= 100 && num2 >= 100 && palindro.size() < 100) {
            checkNumbers(num1, num2);
            num1--;
            num2--;

        }
        int maximo = Collections.max(palindro);
        System.out.println("Solucion del Ejercicio: " + maximo);
    }
}