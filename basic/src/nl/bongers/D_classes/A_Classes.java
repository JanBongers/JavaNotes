package nl.bongers.D_classes;

public class A_Classes {

    /**
     * Java is an object-oriented language. Objects encapsulates data, operations and usage semantics.
     *
     *  - Objects allows storage and manipulation details to be hidden
     *  - It separates what is to be done from how it is done. It should not be the user of consumers concern how something is done.
     *
     * The way we get to objects in Java is through classes. A class provides a structure for describing and creating objects.
     * We use classes to be able to describe our objects and then be able to instantiate them to be worked with.
     *
     * A class is a template for creating an object:
     *
     *  - A class is declared with the 'class' keyword, followed by the class name. e.g.: class A_classes
     *  - Normally, a class is created in its own source file. The source file will have the same name as the class (in most cases)
     *  - The body of the class is contained within brackets.
     *
     * A class is made up of both state (data) and executable code.
     *
     *  - The state itself is in fields. Fields store the object state
     *       int maxPages;
     *       int pages;
     *
     *  - Classes also have methods. This is the executable code that manipulates state and performs operations.
     *      void addPage() {
     *          if (pages < maxPages) {
     *              pages++;
     *          }
     *      }
     *
     *  - A class also has a constructor. A constructor is an executable code that is used during object creation to set the initial state.
     *      eg for class Book:
     *          Book() {
     *              maxPages = 50;
     *              pages = 0;
     *          }
     */

    public static void main(String[] args) {
        A_Classes className = new A_Classes();
    }
}
