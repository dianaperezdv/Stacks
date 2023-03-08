import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean validarAdmin=true;
        Chat chat = new Chat();
        String nombreGuardado;

        if(validarAdmin)  {
            System.out.println("Es usted administrador: ");
            System.out.println("1.Si");
            System.out.println("2.No");
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Usted es admin puede crear usuarios");
                    System.out.println("Ingrese el nombre de usuario que desea crear");
                    nombreGuardado = scanner.next();
                    System.out.println("Conectando usuario.." + nombreGuardado);
                    chat.usuarioConectado(nombreGuardado);
                    break;
                case 2:
                    System.out.println("Escriba '3' para conectarse al chat: ");
                    System.out.println("Escriba '4' Desea desconectarse del chat: ");
                    int eleccion = scanner.nextInt();
                    if(eleccion == 3){
                        System.out.println("Ingrese el nombre de usuario que desea conectar");
                        String usuarioCase2 = scanner.next();
                        System.out.println("Conectando al usuario.." + usuarioCase2);
                        chat.usuarioConectado(usuarioCase2);
                    } else if (eleccion==4) {
                        System.out.println("Seras desconectado");
                        chat.usuarioDesconectado();
                    }break;
            }

        }else{
            System.out.println("Opcion incorrecta");
        }

    }
}