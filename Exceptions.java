import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions {

    public static void myMethod() throws IOException {
        // method code goes here

        try{
            //code that can cause an exception
            // goes here
        } catch (FileNotFoundException e) {
            throw new ClassRosterDaoException("Student data could not be read", e);
        }
    }


    /*
    public static void myMethod() throws Exception, anotherException {
        try {
            // code that cause an exception
            // goes here
        } catch (<excepion type> identifier) {
            // code to handle this type
            //of exception
        } catch(<another_Exception type> identifier) {
            // code to handle this type
            // of exception
        } finally {
            // code that runs whether an exception
            // occured or not
        }
    }

     */
}
