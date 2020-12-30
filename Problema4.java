import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Problema4 {
    /*
        A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
        Find the largest palindrome made from the product of two 3-digit numbers.
    */
    public static void main(String[] args) {
        List<Integer> palindro = new ArrayList<Integer>();
        int num1 = 800;
        int num2 = 800;

        while (num1 <= 999 && num2 <= 999) {
            for (int aux = num1; aux <= 999; aux++) {
                int multi = aux * num2;
                String number = String.valueOf(multi);//Un numero lo separo por digitos// Es una especie de Casting??
                char[] array = number.toCharArray();
                if (array.length == 6 && array[5] == array[0] && array[4] == array[1] && array[3] == array[2]) {
                    System.out.println("El Numero Palindromico es: " + multi);
                    System.out.println("Producto de: " + aux + " y " + num2);
                    palindro.add(multi);
                }
            }
            num1++;
            num2++;
        }
        int maximo = Collections.max(palindro);
        System.out.println("Solucion= " + maximo);
    }
}

