package com.torshid.springfilter.token.input;

import com.torshid.compiler.token.IToken;

public interface IInput extends IToken {

  boolean canBe(Class<?> klass);

  Object getValueAs(Class<?> klass);

  String toStringAs(Class<?> klass);

}