package com.jdktomcat.mybatis.locator;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiPackage;

import org.jetbrains.annotations.NotNull;

import java.util.Set;

/**
 * @author 汤旗
 */
public abstract class PackageProvider {

  @NotNull
  public abstract Set<PsiPackage> getPackages(@NotNull Project project);

}