import java.util.Scanner;

public class rifafundacion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        int cantidad;
        int precioUnitario = 0;
        int total;
        String tipoBoleta = "";

        // Menú
        System.out.println("=== RIFA FUNDACIÓN ===");
        System.out.println("1. Boleta Plata");
        System.out.println("2. Boleta Oro");
        System.out.println("3. Boleta Diamante");
        System.out.print("Seleccione el tipo de boleta (1-3): ");
        opcion = sc.nextInt();

        // Validar opción
        if (opcion < 1 || opcion > 3) {
            System.out.println("Opción inválida.");
            return;
        }

        System.out.print("Ingrese la cantidad de boletas: ");
        cantidad = sc.nextInt();

        // Validar cantidad
        if (cantidad <= 0) {
            System.out.println("❌ La cantidad debe ser mayor que cero.");
            return;
        }

        // Switch para tipo de boleta
        switch (opcion) {
            case 1:
                tipoBoleta = "Plata";
                if (cantidad < 5) {
                    precioUnitario = 5000;
                } else {
                    precioUnitario = 4500;
                }
                break;

            case 2:
                tipoBoleta = "Oro";
                if (cantidad < 3) {
                    precioUnitario = 10000;
                } else {
                    precioUnitario = 9000;
                }
                break;

            case 3:
                tipoBoleta = "Diamante";
                if (cantidad < 2) {
                    precioUnitario = 20000;
                } else {
                    precioUnitario = 18000;
                }
                break;
        }

        // Calcular total
        total = precioUnitario * cantidad;

        // Mostrar resultados
        System.out.println("\n=== RESUMEN DE COMPRA ===");
        System.out.println("Tipo de boleta: " + tipoBoleta);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total a pagar: $" + total);

        sc.close();
    }
}

