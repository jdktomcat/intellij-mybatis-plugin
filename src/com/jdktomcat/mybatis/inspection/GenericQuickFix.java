package com.jdktomcat.mybatis.inspection;

import com.intellij.codeInspection.LocalQuickFix;

import org.jetbrains.annotations.NotNull;

/**
 * @author 汤旗
 */
public abstract class GenericQuickFix implements LocalQuickFix {

  @NotNull @Override
  public String getFamilyName() {
    return getName();
  }

}
