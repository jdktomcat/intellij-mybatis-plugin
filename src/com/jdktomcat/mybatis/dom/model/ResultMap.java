package com.jdktomcat.mybatis.dom.model;

import com.intellij.psi.PsiClass;
import com.intellij.psi.xml.XmlAttributeValue;
import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.Convert;
import com.intellij.util.xml.GenericAttributeValue;
import com.jdktomcat.mybatis.dom.converter.AliasConverter;
import com.jdktomcat.mybatis.dom.converter.ResultMapConverter;
import com.jdktomcat.mybatis.dom.converter.AliasConverter;
import com.jdktomcat.mybatis.dom.converter.ResultMapConverter;

import org.jetbrains.annotations.NotNull;

/**
 * @author 汤旗
 */
public interface ResultMap extends GroupFour, IdDomElement{

  @NotNull
  @Attribute("extends")
  @Convert(ResultMapConverter.class)
  public GenericAttributeValue<XmlAttributeValue> getExtends();

  @NotNull
  @Attribute("type")
  @Convert(AliasConverter.class)
  public GenericAttributeValue<PsiClass> getType();

}