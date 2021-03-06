package com.turkraft.springfilter.exception;

public class InvalidInputException extends TokenizerException {

  private static final long serialVersionUID = 1L;

  public InvalidInputException(String input) {
    super("Could not determine a token for input " + input);
  }

}
