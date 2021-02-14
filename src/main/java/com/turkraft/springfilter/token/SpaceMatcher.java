package com.turkraft.springfilter.token;

import com.turkraft.springfilter.Extensions;

import lombok.experimental.ExtensionMethod;

@ExtensionMethod(Extensions.class)
public class SpaceMatcher extends Matcher<IToken> {

  @Override
  public IToken match(StringBuilder input) {

    // just skip unnecessary spaces

    while (input.indexIs(' ') || input.indexIs('\t')) {
      input.take();
    }

    return null;

  }

}
