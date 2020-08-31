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

    private static final int ISSUE_NEW_BOOK = 1;
    private static final int RETURN_ISSUED_BOOK = 2;
    private static final int SHOW_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        Library myLibrary = new Library();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter Your Choice(1..4): ");
            userInput = scanner.nextInt();

            switch (userInput) {
                case ISSUE_NEW_BOOK:
                    System.out.println("Enter the Name of the book which you want to issue: ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    myLibrary.issuedBook(bookName);
                    break;
                case RETURN_ISSUED_BOOK:
                    System.out.println("Enter the Name of the book which you want to return:");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myLibrary.returnedBook(bookName);
                    break;
                case SHOW_ISSUED_BOOKS:
                    myLibrary.showAllIssuedBooks();
                    break;
                case EXIT:
                    System.out.println("EXIT ");
                    break;
                default:
                    System.out.println("YOUR INOUT IS WRONG");
            }
        } while (userInput != EXIT);
        scanner.close();
    }
}

