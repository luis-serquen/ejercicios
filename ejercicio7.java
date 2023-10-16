public class ejercicio7 {
    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3, 4 },
                { 4, 3, 2, 1 },
                { 1, 2, 3, 4 },
                { 4, 3, 2, 1 }
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
