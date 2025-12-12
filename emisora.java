import java.util.Scanner;

public class emisora {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a su estación de radio Tropicana la más bacana");
        System.out.println("¡Conoce tus estaciones de radio favoritas");
        System.out.println("radio 1: Emisora Pop");
        System.out.println("radio 2: Emisora Rock");
        System.out.println("radio 3: Emisora Vallenato");
        int radio = sc.nextInt();

        System.out.println("Elije la hora (Formato Militar) de tu preferencia musical");
        System.out.println("hora 1: 6 a 12");
        System.out.println("hora 2: 12 a 18");
        System.out.println("hora 3: 18 a 24");
        int hora = sc.nextInt();
        
        switch (radio){
            case 1: // Emisora pop
            if (radio == 1 && hora == 1){
                System.out.println("Pop de la mañana");
            }else if (radio == 1 && hora == 2){
                System.out.println("Exitos del momento");
            }else if (radio == 1 && hora == 3){
                System.out.println("Noche Pop");
            }else{
                System.out.println("Emisora no válida");
            }
            break;

            case 2: // Emisora Pop
            if (radio == 2 && hora == 1){
                System.out.println("Rock clásico");
            }else if (radio == 2 && hora == 2){
                System.out.println("Rock en español");
            }else if (radio == 2 && hora == 3){
                System.out.println("Rock Pesado");
            }else{
                System.out.println("Emisora no válida");
            }
            break;

            case 3: // Emisora Vallenato
            if (radio == 3 && hora == 1){
                System.out.println("Vallenato tradicional");
            }else if (radio == 3 && hora == 2){
                System.out.println("Vallenato moderno");
            }else if (radio == 3 && hora == 3){
                System.out.println("Parranda vallenata");
            }else{
                System.out.println("Emisora no válida");
            }
            break;

            
        }
        sc.close();



    }      
}