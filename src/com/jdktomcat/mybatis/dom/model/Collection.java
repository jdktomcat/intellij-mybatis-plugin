package com.jdktomcat.mybatis.dom.model;

import com.intellij.psi.PsiClass;
import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.Convert;
import com.intellij.util.xml.GenericAttributeValue;
import com.jdktomcat.mybatis.dom.converter.AliasConverter;
import com.jdktomcat.mybatis.dom.converter.AliasConverter;

import org.jetbrains.annotations.NotNull;

/**
 * @author 汤旗
 */
public interface Collection extends GroupFour, ResultMapGroup, PropertyGroup {

  @NotNull
  @Attribute("ofType")
  @Convert(AliasConverter.class)
  public GenericAttributeValue<PsiClass> getOfType();

}