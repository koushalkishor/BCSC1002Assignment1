/*  Created by IntelliJ IDEA.
 *  User: Koushal kishor
 *  Date: 30/08/20
 *  Time: 6:28 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String authorName;
    private String ISBNNumber;

    public Book() {
        bookName = "Ramayan";
        authorName = "Tulsi Das";
        ISBNNumber = "9018478945618";
    }

    public Book(String bookName, String authorName, String ISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNNumber = ISBNNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public String toString() {
        return String.format("Book Name: %s,Author Name: %s,ISBN Number: %s", getBookName(), getAuthorName(), getISBNNumber());
    }

}
