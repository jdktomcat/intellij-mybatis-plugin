package com.seventh7.mybatis.dom.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.SubTagList;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author 汤旗
 */
public interface Configuration extends DomElement {

  @NotNull
  @SubTagList("typeAliases")
  public List<TypeAliases> getTypeAliases();

}
