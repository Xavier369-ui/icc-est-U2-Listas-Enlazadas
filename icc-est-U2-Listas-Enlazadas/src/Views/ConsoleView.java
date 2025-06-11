package Views;

import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView(){
        Scanner scanner = new Scanner(System.in);

    }


    public void displayMenu() {
        System.out.println("1. Agregar Contacto");
        System.out.println("2. Eliminar Contacto");
        System.out.println("3. Buscar Contacto");
        System.out.println("4. Lista Contactos");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        
    }

    public void showMensage(String message) {
        System.out.println(message);
    }

    public String getLine() {
        return scanner.nextLine();

    }
}
