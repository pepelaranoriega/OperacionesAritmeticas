import java.util.Scanner;
public class SeparadorDePalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.println("Ingresa una frase: ");
        frase = sc.nextLine();
        String[] palabras = frase.split(" "); //Creamos un array con las palabras ingresadas en la variable frase.
        for (String palabra : palabras) { //Cada elemento del array guárdalo en palabra.
            System.out.println(palabra); //Imprime cada palabra.
        }
    }
}
