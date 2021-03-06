package com.jdktomcat.mybatis.dom.model;

import com.intellij.psi.xml.XmlTag;
import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.Convert;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.jdktomcat.mybatis.dom.converter.ResultMapConverter;
import com.jdktomcat.mybatis.dom.converter.ResultMapConverter;

import org.jetbrains.annotations.NotNull;

/**
 * @author 汤旗
 */
public interface ResultMapGroup extends DomElement {

  @NotNull
  @Attribute("resultMap")
  @Convert(ResultMapConverter.class)
  public GenericAttributeValue<XmlTag> getResultMap();
}
