package com.seventh7.mybatis.dom.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.Required;
import com.intellij.util.xml.SubTag;
import com.intellij.util.xml.SubTagList;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author 汤旗
 */
public interface Choose extends DomElement {

  @NotNull
  @Required
  @SubTagList("when")
  public List<When> getWhens();

  @SubTag("otherwise")
  public Otherwise getOtherwise();

}
