import java.util.Scanner;

public class programassena {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcionPrograma;
        int modalidad;
        String nombrePrograma = "";
        String nombreModalidad = "";
        int duracion = 0;
        String jornada = "";

        // Menú de programas
        System.out.println("=== PROGRAMAS DE FORMACIÓN SENA ===");
        System.out.println("1. ADSO – Análisis y Desarrollo de Software");
        System.out.println("2. Gestión Empresarial");
        System.out.println("3. Mantenimiento de Equipos de Cómputo");
        System.out.print("Seleccione el programa (1-3): ");
        opcionPrograma = sc.nextInt();

        // Validar programa
        if (opcionPrograma < 1 || opcionPrograma > 3) {
            System.out.println(" Programa no válido.");
            return;
        }

        // Menú de modalidad
        System.out.println("\nModalidad:");
        System.out.println("1. Presencial");
        System.out.println("2. Virtual");
        System.out.print("Seleccione la modalidad (1-2): ");
        modalidad = sc.nextInt();

        // Validar modalidad
        if (modalidad < 1 || modalidad > 2) {
            System.out.println("❌ Modalidad no válida.");
            return;
        }

        // Switch para programa
        switch (opcionPrograma) {

            case 1:
                nombrePrograma = "ADSO – Análisis y Desarrollo de Software";
                duracion = 24;

                if (modalidad == 1) {
                    nombreModalidad = "Presencial";
                    jornada = "Mañana / Tarde";
                } else {
                    nombreModalidad = "Virtual";
                    jornada = "Flexible";
                }
                break;

            case 2:
                nombrePrograma = "Gestión Empresarial";
                duracion = 18;

                if (modalidad == 1) {
                    nombreModalidad = "Presencial";
                    jornada = "Mañana";
                } else {
                    nombreModalidad = "Virtual";
                    jornada = "Flexible";
                }
                break;

            case 3:
                nombrePrograma = "Mantenimiento de Equipos de Cómputo";
                duracion = 12;

                if (modalidad == 1) {
                    nombreModalidad = "Presencial";
                    jornada = "Tarde";
                } else {
                    nombreModalidad = "Virtual";
                    jornada = "Noche";
                }
                break;
        }

        // Mostrar información
        System.out.println("\n=== INFORMACIÓN DEL PROGRAMA ===");
        System.out.println("Programa: " + nombrePrograma);
        System.out.println("Modalidad: " + nombreModalidad);
        System.out.println("Duración: " + duracion + " meses");
        System.out.println("Jornada sugerida: " + jornada);

        sc.close();
    }
}
