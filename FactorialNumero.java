import java.util.Scanner;

public class FactorialNumero {

    
    public static void main(String[] args) {
        long factorial=1;
        long division=0;
        int num;
        int ceros=0;
        Scanner numero = new Scanner(System.in);
        System.out.print("Por favor introduzca un número: ");
        num = numero.nextInt();
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        division=factorial;
        while (division == (division/10)*10) {
        division=division/10;        
        ceros++;
        }
        System.out.println(" ");
        System.out.println("El factorial de " + num + " es: " + factorial);
        System.out.println(" ");
        System.out.println("y tiene " + ceros +" cero(s) al final");   
        
    }
}