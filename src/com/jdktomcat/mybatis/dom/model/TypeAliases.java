package com.jdktomcat.mybatis.dom.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.SubTagList;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author 汤旗
 */
public interface TypeAliases extends DomElement {

  @NotNull
  @SubTagList("typeAlias")
  public List<TypeAlias> getTypeAlias();

  @NotNull
  @SubTagList("package")
  public List<java.lang.Package> getPackages();

}
