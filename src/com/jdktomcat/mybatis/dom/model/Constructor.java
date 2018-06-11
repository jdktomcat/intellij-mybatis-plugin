package com.jdktomcat.mybatis.dom.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.SubTagList;

import java.util.List;

/**
 * @author 汤旗
 */
public interface Constructor extends DomElement {

  @SubTagList("arg")
  public List<Arg> getArgs();

  @SubTagList("idArg")
  public List<IdArg> getIdArgs();
}
