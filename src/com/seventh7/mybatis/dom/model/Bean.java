package com.seventh7.mybatis.dom.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.SubTagList;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author 汤旗
 */
public interface Bean extends DomElement {

  @NotNull
  @SubTagList("property")
  public List<BeanProperty> getBeanProperties();

}
