import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList();
    public static void main(String[] args) {
        createMenu();
    }

    public static void createMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    break;
                case 3:
                    displayContacts();
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            if (choice == 4) {
                break;
            }
        }

    }
    private static void addContact() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter company: ");
        String company = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();

        Contact contact = new Contact(name, company, email, phone);
        contact.setName(name);
        contact.setCompany(company);
        contact.setEmail(email);
        contact.setPhone(phone);

        contacts.add(contact);
        System.out.println("success");
    }

    private static void displayContacts() {
        ArrayList<Contact> contacts = new ArrayList();

        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contacts:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
    }
