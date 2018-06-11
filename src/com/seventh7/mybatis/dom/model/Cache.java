package com.seventh7.mybatis.dom.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.SubTagList;

import java.util.List;

/**
 * @author 汤旗
 */
public interface Cache extends DomElement {

  @SubTagList("property")
  public List<Property> getProperties();

}
