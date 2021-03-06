package com.jdktomcat.mybatis.dom.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.Required;
import com.intellij.util.xml.SubTagList;

import java.util.List;

/**
 * @author 汤旗
 */
public interface Discriminator extends DomElement {

  @Required
  @SubTagList("case")
  public List<Case> getCases();

}
