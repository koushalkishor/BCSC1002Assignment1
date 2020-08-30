/*  Created by IntelliJ IDEA.
 *  User: Koushal kishor
 *  Date: 30/08/20
 *  Time: 7:55 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] namesOfTheBooksIssued;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }


    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }


    public Book[] getNamesOfTheBooksIssued() {
        return namesOfTheBooksIssued;
    }
}
