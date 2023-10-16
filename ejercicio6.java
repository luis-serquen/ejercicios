public class ejercicio6 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (j % 2 == 0) ? 1 : 0; // Establecer los valores 1 o 0 según el patrón 1010
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Cambiar de línea después de cada fila
        }
    }
}