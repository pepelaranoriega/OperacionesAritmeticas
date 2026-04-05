public class NumerosPrimos {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) { //Recorremos los números del 1 al 100
            int contador = 0; //Se reinicia el contador de divisores para cada número
            for (int j = 1; j <= i; j++) { //Probamos los divisores de i
                if (i % j == 0) { //j divide a i sin residuo?
                    contador++;
                }
            }

            if (contador == 2) { //Si solo tiene dos divisores es primo
                System.out.println(i); //Imprime el número primo
            }
        }
    }
}
