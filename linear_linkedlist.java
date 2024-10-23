import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insertAtBeginning(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;

    }

    void delete(int d) {
        Node temp;
        Node runner;
        if (head.next == null) {
            head = null;
            return;
        }
        runner = head;
        temp = head;
        while (runner.data != d) {
            runner = runner.next;
        }
        while (temp.next.data != d) {
            temp = temp.next;
        }
        temp.next = runner.next;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    void insertAfter(int key, int data) {
        Node temp = head;
        while (temp.data != key) {
            temp = temp.next;
            if (temp == null) {
                System.out.println("element not found to insert after");
                break;
            }
        }
        Node newnode = new Node(data);
        newnode.next = temp.next;
        temp.next = newnode;

    }

    void printlist() {
        Node temp = head;
        if (head == null) {
            System.out.println("NULL");
        }
        while (temp != null) {
            if (temp.next != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            } else {
                System.out.println(temp.data + "->NULL");
                break;
            }
        }
    }

    static void function(LinkedList l1, Scanner sc, int choice) {

        switch (choice) {
            case 1:
                l1.printlist();
                break;
            case 2:
                System.out.println("enter the element to insert  ");
                int key = sc.nextInt();
                l1.insertAtBeginning(key);
                break;
            case 3:
                System.out.println("After which element you want to insert your element  ");
                int prev = sc.nextInt();
                System.out.println("Value of element you want to insert");
                int data = sc.nextInt();
                l1.insertAfter(prev, data);
                break;
            case 4:
                System.out.println("enter the element to insert in end   ");
                key = sc.nextInt();
                l1.insertAtEnd(key);
                break;
            case 5:
                System.out.println("Enter the element to delete");
                key = sc.nextInt();
                l1.delete(key);
                break;
            case 6:
                System.out.println("This is all about Linkedlist");
                Linked_List.exit = true;
                break;
        }
    }
}

public class Linked_List {
    public static boolean exit = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        while (!exit) {
            printmenu();
            int choice = sc.nextInt();
            LinkedList.function(l1, sc, choice);
        }

    }

    static void printmenu() {
        System.out.println("press 1 for checking the linked list");
        System.out.println("press 2 for inserting the element in begining of  the linked list");
        System.out.println("press 3 for inserting the element after a node  of  the linked list");
        System.out.println("press 4 for inserting the element in end of  the linked list");
        System.out.println("press 5 for delete a node of  the linked list");
        System.out.println("press 6 for exit ");

    }

}