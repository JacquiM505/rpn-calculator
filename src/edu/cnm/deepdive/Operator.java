package edu.cnm.deepdive;

import java.util.Arrays;

/**
 * Enumerated values representing in a postfix (RPN) calculator. Each operator has a token to recognize the operator in a input string, and to represent the operator in output string.
 */
public enum Operator {

  /** Pops 2 values from stack, pushes sum of the 2 back onto stack. */
  ADD("+"),
  /** Pops 2 values from stack, pushes differences of the 2 back onto stack. */
  SUBTRACT("-"),
  /** Pops 2 values from stack, pushes products of the 2 back onto stack. */
  MULTIPLY("*"),
  /** Pops 2 values from stack, pushes times of the 2 back onto stack. */
  DIVIDE("/"),

  /** Pops 2 values from stack, pushes
   SQUARE_ROOT("sqrt"),
   /* *
   POWER("^"),
   /**
   MODULO("%");
   /**

   private String token;

   Operator(String token) {
   this.token = token;
   }


   /**
   *
   * @param args
   */
  public static void main(String[] args) {
    System.out.println(Arrays.toString(Operator.values()));
  }

  @Override
  public String toString() {
    return token;
  }

}
