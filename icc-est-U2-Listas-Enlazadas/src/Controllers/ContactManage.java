package Controllers;



import Models.Contact;
import Models.LinkedList;
import Models.Node;

public class ContactManage {
    private LinkedList<Contact> contacts = new LinkedList<>();

    public void addContact(Contact contact) {
        contacts.appendToTail(new Node<Contact>(contact));
       
    }

   


    public void findContactByName(String name) {
        Node<Contact> current = contacts.getHead();
        boolean found = false;
        while (current != null) {
            if (current.getValue().getName().equalsIgnoreCase(name)) {
                System.out.println("Encontrado: " + current.getValue());
                found = true;
            }
            current = current.getNext();
        }
        if (!found) {
            System.out.println("Contacto no encontrado.");
        }
    }
      
        
    
    public void deleteContactByName(String name) {
        Node<Contact> current = contacts.getHead();
        boolean deleted = false;
        while (current != null) {
            if (current.getValue().getName().equalsIgnoreCase(name)) {
                contacts.deleteByValue(current.getValue());
                System.out.println("Eliminado: " + current.getValue());
                deleted = true;
                break;
            }
            current = current.getNext();
        }
        if (!deleted) {
            System.out.println("Contacto no encontrado.");
        }
       
    }
    public void printList() {
         if (contacts.getSize() == 0) {
            System.out.println("Lista vacía.");
            return;
        }
        contacts.println();
       
    }
}