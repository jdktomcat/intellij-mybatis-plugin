package com.jdktomcat.mybatis.generate;

import com.intellij.psi.PsiMethod;
import com.jdktomcat.mybatis.dom.model.GroupTwo;
import com.jdktomcat.mybatis.dom.model.Mapper;

import org.jetbrains.annotations.NotNull;

/**
 * @author 汤旗
 */
public class UpdateGenerator extends StatementGenerator{

  public UpdateGenerator(@NotNull String... patterns) {
    super(patterns);
  }

  @NotNull @Override
  protected GroupTwo getTarget(@NotNull Mapper mapper, @NotNull PsiMethod method) {
    return mapper.addUpdate();
  }

  @NotNull @Override
  public String getId() {
    return "UpdateGenerator";
  }

  @NotNull @Override
  public String getDisplayText() {
    return "Update Statement";
  }

}
