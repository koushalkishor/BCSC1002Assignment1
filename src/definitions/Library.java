/*  Created by IntelliJ IDEA.
 *  User: Koushal kishor
 *  Date: 30/08/20
 *  Time: 7:09 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] availableBooks;

    public Library(Book[] availableBooks ) {
        this.availableBooks = availableBooks;
    }

    public Library() {
        this.availableBooks = new Book[70];
        for (int START= 0; START <availableBooks.length; START++)
            availableBooks[START] = new Book("Book" + (START + 1));

    }

    public void issuedBook(String bookName) {
        System.out.println(bookName + "the book whisch is issued by you");
    }

    public void returnedBook(String bookName) {
        System.out.println(bookName + "returned");
    }

    public void viewAllIssuedBooks() {
        for (Book availableBook : availableBooks) {
            System.out.println(availableBooks);
        }
    }

    public Book[] getavailableBooks() {
        return availableBooks;
    }

    public void setavailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    public String toString() {
        return Arrays.toString(availableBooks);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Arrays.equals(getavailableBooks(), library.availableBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(availableBooks());
    }

}
