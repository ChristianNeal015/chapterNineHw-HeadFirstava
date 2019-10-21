package headFirstJavaChapterNine;

public class ChapterNine {
    /**
     * this my notes for the HomeWork Chapter 9
     * in HeadFirstJava
     *
     * Heap: Where all objects live aka "The Garbage Collectible Heap"
     * Uses reference variables because objects live in heap
     * Stack: Where method invocations and local variables live
     * Methods are stacked
     *
     * Example of stacked methods;
     *
     * public void doStuff() {
     *           boolean b = true;
     *          go(4);
     *       }
     * public void go(int) {
     *           int z = x + 24;
     *           crazy();
     *       }
     * public void crazy() {
     *            char c = 'a';
     *       }
     *
     * The method doStuff(); calls the second method (go()), and the method calls the third (crazy()).
     * Each method declares one local variable within the body of the method,
     * and go() also declares a parameter variable( which means go() has no local variables).
     *
     * Remember, a non-primitive variable holds a reference to a object, not the object itself.
     * You already know where objects live---on in the heap. It doesn't matter where they're declared or created.
     * If the local variable is a reference to an object,
     * only the variable (the reference/remote control) goes in the stack
     *
     *  public class StackRef {
     *    public void roof() {
     *     barf();
     *   }
     * }
     *
     *  Public void barf () {
     *   Duck d = new Duck(24);
     * }
     *
     *  barf() declares and creates a new Duck reference variable 'd'
     *  (since it's declared inside the method, it's a local variable
     *   and goes in the stack.
     *
     *   SuperClass Constructors:
     *   The Super Constructor run to build out the superclass in the object
     */

}
