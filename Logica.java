import java.util.Scanner;

public class Logica {
    public static void main(String[] args) {
        Scanner market = new Scanner(System.in);
        final double IVA = 0.19;

        double productoBasico = 15000.0;
        double productoMedio = 35000.0;
        double productoPremium = 80000.0;

        int opcion = 0;
        double totalBruto = 0.0;
        int totalArticulos = 0;
        int articulosPremium = 0;
       
        while (opcion != 4) {
            System.out.println("Elige un producto: 1. Básico, 2. Medio, 3. Premium, 4. Finalizar compra");
            opcion = market.nextInt();
            if (opcion == 1) {
                totalBruto = totalBruto + productoBasico;
                totalArticulos = totalArticulos + 1;
            } else if (opcion == 2) {
                totalBruto = totalBruto + productoMedio;
                totalArticulos = totalArticulos + 1;
            } else if (opcion == 3) {
                totalBruto = totalBruto + productoPremium;
                totalArticulos = totalArticulos + 1;
                articulosPremium = articulosPremium + 1;
                } else if (opcion != 4) {
                System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }

}



