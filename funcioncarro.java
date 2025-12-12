import java.util.Scanner;
public class funcioncarro {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a su panel de control");
        System.out.println("Puedes elegir entre la siguientes opciones");
        System.out.println("modo 1: Encender/Apagar las luces");
        System.out.println("modo 2: Ajustar la velocidad");
        System.out.println("modo 3: Activar modo de conducción (Normal, Eco o Sport");
        int modo = sc.nextInt();
        boolean lucesEncendidas = true;
        switch (modo){
            case 1 : //Encendido y apagado de las luces
            System.out.println("opcion 1: lucesEncendidas");
            System.out.println("opcion 2: lucesApagadas");
            int opcion = sc.nextInt();
            if (opcion == 1){
                System.out.println("Luces Encendidas");
            }else {
                System.out.println("Luces Apagadas");
            }
            break;

            case 2: //Ajustar la velocidad
            System.out.println("Elije la velocidad");
            System.out.println("velocidad 1: Normal");
            System.out.println("velocidad 2: Moderado");
            System.out.println("velocidad 3: Rápido");
            int velocidad = sc.nextInt();
            if (velocidad == 1){
                System.out.println("Modo conducción normal");
            } else if (velocidad == 2){
                System.out.println("Modo conducción segura");
            }else if (velocidad == 3){
                System.out.println("Conducción modo rápido y furioso");
            }else {
                System.out.println("Elección inválida");
            }
            break;
            
            case 3: // modo de conducción 
            System.out.println("Elije tu manera de conducir");
            System.out.println("manera 1: Eco");
            System.out.println("manera 2: Sport");
            System.out.println("manera 3: Normal");
            int manera = sc.nextInt();
            
            if (manera == 1){
                System.out.println("Ahorro de combustible");
            }else if (manera == 2){
                System.out.println("Mpdo tranquilo");
            }else {
                System.out.println("Modo conducción normal");
            }
            break;

            }
            sc.close();

            }
        
        }