package com.jdktomcat.mybatis.intention;

import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;

import org.jetbrains.annotations.NotNull;

/**
 * @author 汤旗
 */
public interface IntentionChooser {

  public boolean isAvailable(@NotNull Project project, Editor editor, PsiFile file);

}
