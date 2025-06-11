package Controllers;

import Models.Contact;
import Views.ConsoleView;

public class MenuControllers {
    private ContactManage contactManage;
    private ConsoleView consoleView;

    public MenuControllers() {
        contactManage = new ContactManage();
        consoleView = new ConsoleView();
    }

    public void showMenu() {
        consoleView = new ConsoleView();
        consoleView.displayMenu();
    }
    private void addContact() {
        consoleView.showMensage("Ingrese nombre:");
        String name = consoleView.getLine();
        consoleView.showMensage("Ingrese teléfono:");
        String phone = consoleView.getLine();
        contactManage.addContact(new Contact(name, phone));
        consoleView.showMensage("Contacto agregado: " + name);
        
       
        
    }
    private void deleteContact() {
        consoleView.showMensage("Ingrese nombre del contacto a eliminar:");
        String name = consoleView.getLine();
        contactManage.deleteContactByName(name);
        
    }
    private void printList() {
        consoleView.showMensage("Lista de contactos:");
        contactManage.printList();
        
    }


}
