package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.Box;

import java.io.PrintWriter;

/**
 * A simple set of experiments with predicates and searching.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class BoxExperiments {
  /**
   * Run the experiments.
   *
   * @param args
   *   Command-line arguments (ignored).
   */
  public static void main(String[] args) {
    // Prepare for output.
    PrintWriter pen = new PrintWriter(System.out, true);

    Box<String> s1 = new Box<String>("Hello");
    Box<String> s2 = new Box<String>("Hello");
    Box<String> s3 = s1;
    pen.println(s1.get());        // Prints "Hello"
    pen.println(s2.get());        // Prints "Hello"
    pen.println(s3.get());        // Prints "Hello"
    s1.set("Goodbye");
    pen.println(s1.get());        // Prints "Goodbye"
    pen.println(s2.get());        // Prints "Hello"
    pen.println(s3.get());        // Prints "Goodbye"
    s3.set("Whatever");
    pen.println(s1.get());        // Prints "Whatever"
    pen.println(s2.get());        // Prints "Hello"
    pen.println(s3.get());        // Prints "Whatever"
  
    Box<Integer> i1 = new Box<Integer>(42);
    Box<Integer> i2 = i1;
    pen.println(i2.get() + 3);          // Prints 45
    i2.set(21);
    pen.println(i1.get() * 2);          // Prints 42
  } // main(String[])

} // class SearchExperiments
