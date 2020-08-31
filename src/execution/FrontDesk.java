/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_NEW_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int SHOW_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int customerInput;
        String studentName;
        long universityRollNumber;
        String nameOfBook;
        String authorName;
        String ISBNNumber;
        System.out.println("Please Enter your Name\r");
        studentName = scanner.nextLine();
        System.out.println(" Please Enter your university roll number\r");
        universityRollNumber = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Please Enter book name you have assigned earlier\r");
        nameOfBook = scanner.nextLine();
        System.out.println("Please Enter book's author Name");
        authorName = scanner.nextLine();
        System.out.println("Please Enter 13 digit ISBN number");
        ISBNNumber = scanner.nextLine();
        Book book = new Book(nameOfBook, authorName, ISBNNumber);
        Book[] issuedBooks = {book};
        Student student = new Student(studentName, universityRollNumber, issuedBooks.length, issuedBooks);
        Library library = new Library();
        System.out.println("******************************************************************************");
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n");
            System.out.println("How may I help you today?\n");
            System.out.println("1. Issue a new book for me.\n");
            System.out.println("2. Return a previously issues book for me.\n");
            System.out.println("3. Show me all my issues books.\n");
            System.out.println("4. Exit.\n");
            customerInput = scanner.nextInt();
            switch (customerInput) {
                case ISSUE_NEW_BOOK:
                    Scanner scanner1 = new Scanner(System.in);
                    String bookName;
                    System.out.println("Enter the name of book you want");
                    bookName = scanner1.nextLine();
                    library.issueBook(bookName);
                    break;
                case RETURN_BOOK:
                    library.returnBook();
                    break;
                case SHOW_ISSUED_BOOKS:
                    library.issuedBooksToStudent(studentName, universityRollNumber, issuedBooks);
                    break;
                default:
                    break;
            }
        }
        while (customerInput != EXIT);
        scanner.close();
    }
}

