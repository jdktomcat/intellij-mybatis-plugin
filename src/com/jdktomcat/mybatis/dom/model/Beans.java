package com.jdktomcat.mybatis.dom.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.SubTagList;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author 汤旗
 */
public interface Beans extends DomElement {

  @NotNull
  @SubTagList("bean")
  public List<Bean> getBeans();

}
