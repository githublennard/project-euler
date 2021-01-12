/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/
public class Problem3 {
    public static void main(String[] args) {
        long number = 600851475143L;
        long primeLimit = (int) Math.ceil(Math.sqrt(number));//Comprobar valores primos hasta la raiz cuadrada de 'number', se usa una funcion math de Java
        long cont = 2;
        long fprimo = 0;//Por buenas practicas con el tema memoria se coloca en cero el inicio de la variable
        long dividendo = number;
        while (cont <= primeLimit) {//La condicion de primeLimit es para colocar una limitante con respecto a la division
            while (dividendo % cont == 0) {//si el modulo da cero, ese seria un factor primo a considerar
                fprimo = cont;//Se tiene un factor primo porque su modulo es cero
                dividendo /= cont;//El resultado de la division es un limite que sirve para los calculos
            }
            if (dividendo == 1) {
                System.out.println("Time to stop the loop because 'dividendo = 1', does not make sense to increase cont that divide 'dividendo'");
                break;
            }
            cont++;
        }
        System.out.println("The largest prime factor is: " + fprimo);
    }
}