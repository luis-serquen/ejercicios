public class ejercicio4 {
    public static void main(String[] args) {
        int n = 4; // Número de filas del patrón
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("0");
            }
            System.out.print("1");
            for (int j = i + 1; j < n; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
