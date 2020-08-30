/*  Created by IntelliJ IDEA.
 *  User: Koushal kishor
 *  Date: 30/08/20
 *  Time: 7:09 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] allCurrentlyAvailableBooks;

    public Library(Book[] allCurrentlyAvailableBooks) {
        this.allCurrentlyAvailableBooks = allCurrentlyAvailableBooks;
    }

    public Library() {
        this.allCurrentlyAvailableBooks = new Book[100];
        for (int START_INDEX = 0; START_INDEX < allCurrentlyAvailableBooks.length; START_INDEX++)
            allCurrentlyAvailableBooks[START_INDEX] = new Book("Book" + (START_INDEX + 1));

    }

    public void issuedBook(String bookName) {
        System.out.println(bookName + "book is issued by you");
    }

    public void returnedBook(String bookName) {
        System.out.println(bookName + "Thank you for returning the book!");
    }

    public void viewAllIssuedBooks() {
        for (Book allCurrentAvailableBook : allCurrentlyAvailableBooks) {
            System.out.println(allCurrentAvailableBook);
        }
    }

    public Book[] getAllCurrentlyAvailableBooks() {
        return allCurrentlyAvailableBooks;
    }

    public void setAllCurrentlyAvailableBooks(Book[] allCurrentlyAvailableBooks) {
        this.allCurrentlyAvailableBooks = allCurrentlyAvailableBooks;
    }

    public String toString() {
        return Arrays.toString(allCurrentlyAvailableBooks);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Arrays.equals(getAllCurrentlyAvailableBooks(), library.getAllCurrentlyAvailableBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getAllCurrentlyAvailableBooks());
    }

}
