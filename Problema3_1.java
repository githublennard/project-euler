import java.util.ArrayList;
import java.util.List;
//El codigo funciona, pero el resultado no es el correcto
public class Problema3_1 {
    /*
           The prime factors of 13195 are 5, 7, 13 and 29.
           What is the largest prime factor of the number 600851475143 ?
   */
    public static void main(String[] args) {
        List<Integer> priFac = new ArrayList<Integer>();
        List<Long> cocienteDiv = new ArrayList <Long>();
        //long limit = 600851475143L;//Numero Obligatorio del ejercicio
        //int limit = 13195;
        int limit = 90709;//3/7/11/Numeros primos
        int aux1 = 0;
        long aux2 = 0;//Tiene que ser Long para que sea generico//valor de los cocientes
        int div = 2;//Descarto el 1 por los numeros primos
        while (div <= limit) {
            if (limit % div == 0) {
                aux1 = div;
                System.out.println(aux1);//Me imprime un factor primo del numero
                priFac.add(div);//Si se divide un numero por su primer factor primo se obtiene el fp mas grande
                aux2 = (limit / div);//Cociente de la division de un numero entre su primer factor primo
                cocienteDiv.add(aux2);
                if (priFac.size() > 3) {
                    break;
                }
            }
            div++;
        }
        if (priFac.size() >= 2) {
            System.out.println("El numero: " + limit + " No es Primo");
            System.out.println("El factor primo mas grande es: " + cocienteDiv.get(0));//Me imprime factor primo mas grande
        } else {
            System.out.println("El numero: " + limit + " es Primo");
        }
    }
}