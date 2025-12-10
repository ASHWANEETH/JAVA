void main() {
    //------------------------------------------------------------------------
    // EXCEPTION HANDLING IN JAVA (FULL CHEATSHEET WITH EXAMPLES)
    //------------------------------------------------------------------------

    /*
        WHAT IS AN EXCEPTION?
        ---------------------
        An exception is an event that disrupts normal program flow.
        Example: dividing by zero, accessing invalid index, null pointer, etc.

        KEY TERMS:
        - Exception: Recoverable error
        - Error: Serious issue (JVM error), not handled normally
        - Throwable: Parent class of Exception & Error
    */

    //------------------------------------------------------------------------
    // TYPES OF EXCEPTIONS
    //------------------------------------------------------------------------

    /*
        1. Checked Exceptions (must be handled at compile-time)
           e.g., IOException, SQLException, FileNotFoundException

        2. Unchecked Exceptions (Runtime exceptions)
           e.g., ArithmeticException, NullPointerException, IndexOutOfBoundsException

        3. Errors
           e.g., StackOverflowError, OutOfMemoryError
    */

    //------------------------------------------------------------------------
    // BASIC TRY-CATCH
    //------------------------------------------------------------------------

    try {
        int x = 10 / 0;                   // throws ArithmeticException
    } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero");
    }

    //------------------------------------------------------------------------
    // MULTIPLE CATCH BLOCKS
    //------------------------------------------------------------------------

    try {
        int arr[] = {1, 2};
        System.out.println(arr[5]);       // ArrayIndexOutOfBoundsException
    } catch (ArithmeticException e) {
        System.out.println("Math error");
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid index");
    } catch (Exception e) {
        System.out.println("General exception");
    }

    //------------------------------------------------------------------------
    // FINALLY BLOCK (ALWAYS EXECUTES)
    //------------------------------------------------------------------------

    try {
        System.out.println(10/2);
    } catch (Exception e) {
        System.out.println("Error");
    } finally {
        System.out.println("Finally always runs");
    }

    //------------------------------------------------------------------------
    // THROW (MANUALLY THROWING EXCEPTION)
    //------------------------------------------------------------------------

    public void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18+");
        }
    }

    //------------------------------------------------------------------------
    // THROWS (SENDING EXCEPTION TO CALLER)
    //------------------------------------------------------------------------

    public void readFile() throws IOException {
        FileReader fr = new FileReader("data.txt");
    }

    //------------------------------------------------------------------------
    // CUSTOM EXCEPTION
    //------------------------------------------------------------------------

    class MyException extends Exception {            // must extend Exception
        public MyException(String msg) {
            super(msg);
        }
    }

    public void testCustom() throws MyException {
        throw new MyException("Custom error occurred");
    }

    //------------------------------------------------------------------------
    // TRY WITH RESOURCES (AUTO CLOSES RESOURCE)
    //------------------------------------------------------------------------

    try (FileReader fr = new FileReader("text.txt")) {
        System.out.println("File opened");
    } catch (IOException e) {
        e.printStackTrace();
    }

    //------------------------------------------------------------------------
    // COMMON EXCEPTIONS LIST (MOST ASKED IN INTERVIEWS)
    //------------------------------------------------------------------------
    /*
        - NullPointerException
        - ArrayIndexOutOfBoundsException
        - NumberFormatException
        - ClassCastException
        - ArithmeticException
        - IllegalArgumentException
        - IOException
        - FileNotFoundException
    */

    //------------------------------------------------------------------------
    // BEST PRACTICES
    //------------------------------------------------------------------------
    /*
        ✔ Catch specific exceptions before general
        ✔ Never swallow exceptions (don’t leave catch empty)
        ✔ Use custom exceptions for meaningful error messages
        ✔ Use try-with-resources for files, DB connections
    */

}