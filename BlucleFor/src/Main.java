import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        System.out.println("(+) Ingrese la cantidad de numeros a imprimir");

        long numero = cs.nextInt();

        for (long i = 0; i <= numero; i++) {
            System.out.println(i);
        }
    }
}
