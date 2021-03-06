package com.turkraft.springfilter.compiler.node.predicate;

import com.turkraft.springfilter.compiler.node.IExpression;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@EqualsAndHashCode(callSuper = true)
public class OperationPrefix extends Operation {

  private IExpression right;

  @Override
  public IExpression transform(IExpression parent) {
    right = right.transform(this);
    return this;
  }

}
