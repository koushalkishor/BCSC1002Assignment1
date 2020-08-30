/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;

import java.util.Scanner;

public class FrontDesk {

    private static final int ISSUED_NEW_BOOKS = 1;
    private static final int RETURN_ISSUED_BOOKS = 2;
    private static final int LIST_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        Library LibraryInformation = new Library();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice(1..4):");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ISSUED_NEW_BOOKS:
                    System.out.println(" Enter the name of the book that you want to issue:");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    LibraryInformation.issuedBook(bookName);
                    break;
                case RETURN_ISSUED_BOOKS:
                    System.out.println("Enter the name of the book that you want to return:");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    LibraryInformation.returnedBook(bookName);
                    break;
                case LIST_ISSUED_BOOKS:
                    LibraryInformation.viewAllIssuedBooks();
                    break;
                default:
            }
        } while (studentInput != EXIT);
        scanner.close();
    }
}

