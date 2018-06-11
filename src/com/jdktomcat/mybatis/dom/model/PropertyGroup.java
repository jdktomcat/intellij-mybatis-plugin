package com.jdktomcat.mybatis.dom.model;

import com.intellij.psi.xml.XmlAttributeValue;
import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.Convert;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.jdktomcat.mybatis.dom.converter.PropertyConverter;
import com.jdktomcat.mybatis.dom.converter.PropertyConverter;

/**
 * @author 汤旗
 */
public interface PropertyGroup extends DomElement {

  @Attribute("property")
  @Convert(PropertyConverter.class)
  GenericAttributeValue<XmlAttributeValue> getProperty();
}
