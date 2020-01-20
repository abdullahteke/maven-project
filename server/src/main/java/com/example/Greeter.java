/**
* @author abdullahteke@gmail.com
* @version 1.0
*/
package com.example;


/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

/** {@inheritDoc}*/
  public final String greet(final String someone) {
    return String.format("Hello MR, %s!", someone);
  }
}
