package com.jdktomcat.mybatis.dom.converter;

import com.intellij.psi.PsiMethod;
import com.intellij.util.xml.ConvertContext;
import com.jdktomcat.mybatis.util.JavaUtils;
import com.jdktomcat.mybatis.util.MapperUtils;
import com.jdktomcat.mybatis.dom.model.Mapper;
import com.jdktomcat.mybatis.util.JavaUtils;
import com.jdktomcat.mybatis.util.MapperUtils;

import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.Nullable;

/**
 * @author 汤旗
 */
public class DaoMethodConverter extends ConverterAdaptor<PsiMethod> {

  @Nullable @Override
  public PsiMethod fromString(@Nullable @NonNls String id, ConvertContext context) {
    Mapper mapper = MapperUtils.getMapper(context.getInvocationElement());
    return JavaUtils.findMethod(context.getProject(), MapperUtils.getNamespace(mapper), id).orNull();
  }

}