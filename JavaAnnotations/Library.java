/** @author Yash Tank
 * @version 2.0
 * @since 2020
 */
package JavaAnnotations;

/**
 * 
 * @author Yash
 * 
 * Class for library Book.
 * 
 */

public class Library {
    /**
     * {@value} 10 default value
     */
    static int val = 10;

    /**
     * Parameterized constructor
     * @param s Library Name
     */
    public Library(String s){

    }

    /**
     * Issue a book to a Student
     * @param roll roll number of a Student
     * @throws Exception if library is closed, throws Exception
     */
    public void issue(int roll){

    }

    /**
     * Check if book is available
     * @param str Book name
     * @return if book is available return true else false
     */
    public boolean available(String str){
        return true;
    }

    /**
     * Get book name
     * @param id book id
     * @return return book name
     */
    public String getName(int id){
        return "";
    }

    // now you can generate Java Document
}
