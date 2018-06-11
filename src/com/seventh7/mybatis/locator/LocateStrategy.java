package com.seventh7.mybatis.locator;

import com.intellij.psi.PsiClass;

import org.jetbrains.annotations.NotNull;

/**
 * @author 汤旗
 */
public abstract class LocateStrategy {

  public abstract boolean apply(@NotNull PsiClass clazz);

}
