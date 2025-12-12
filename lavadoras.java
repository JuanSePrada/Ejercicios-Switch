import java.util.Scanner;
public class lavadoras {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a su mejor servicio de lavadora");
        System.out.println("Elije tu lavadora de acuerdo al tamaño que requieres");
        System.out.println("opcion 1: Lavadora estándar");
        System.out.println("opcion 2: Lavadora grande");
        System.out.println("opcion 3: Lavadora Industrial");
        int opcion = sc.nextInt();

        System.out.println("¿Cuál será tu tiempo de uso?");
        int hora = sc.nextInt();
        int valorhora = 0;
        
        switch (opcion){
            case 1:// lavadora estandar
            if (hora <=3 ){
                valorhora = 5000;
            }else if (hora >=4){
                valorhora = 4000;
            }else{
                System.out.println("valor no permitido");
            }
            break;

            case 2:// lavadora grande
            if (hora <=3){
                valorhora = 7000;
            }else if (hora >=4){
                valorhora = 6000;
            }else {
                System.out.println("Valor no permitido");
            }
            break;

            case 3:// lavadora industrial
            if (hora <= 3){
                valorhora = 10000;
            }else if (hora >= 4){
                valorhora = 8000;
            }else {
                System.out.println("Valor no permitido");
            }
            break;
        }
        int preciototal = valorhora * hora;

        System.out.println("-----------------");
        System.out.println("opcion "+ opcion);
        System.out.println("hora " + hora);
        System.out.println("valorhora " + valorhora);
        System.out.println("total "+ preciototal);
        System.out.println("------------------");

        sc.close();
    }
    

}

