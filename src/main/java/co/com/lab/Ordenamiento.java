package co.com.lab;

public class Ordenamiento {

    public final int[] numeros = {50, 20, 40, 80, 30};

    public void imprimir() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Arreglo posicion " + i + " valor " + numeros[i]);
        }
    }

    public void seleccion() {
        int i, j;
        int indiceMenor;

        for (i = 0; i < numeros.length - 1; i++) {

            indiceMenor = i;

            for (j = i + 1; j < numeros.length; j++) {

                if (numeros[j] < numeros[indiceMenor]) {

                    indiceMenor = j;

                }

            }

            if (i != indiceMenor) {
                int aux = numeros[i];
                numeros[i] = numeros[indiceMenor];
                numeros[indiceMenor] = aux;
            }

        }
    }

    public void burbuja() {
        int pasada, i;

        for (pasada = 0; pasada < numeros.length - 1; pasada++) {

            for (i = 0; i < numeros.length - 1 - pasada; i++) {

                if (numeros[i] > numeros[i + 1]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = aux;
                }
            }
        }
    }


    public void insercion() {
        int contingente;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[j] < numeros[i]) {
                    contingente = numeros[j];

                    if (j - i >= 0) System.arraycopy(numeros, i, numeros, i + 1, j - i);
                    numeros[i] = contingente;
                }
            }
        }
    }

    public static void main(String[] args) {

        Ordenamiento ord = new Ordenamiento();

        ord.imprimir();

        ord.insercion();

        System.out.println("\nDatos ordenados: ");
        ord.imprimir();
    }
}
