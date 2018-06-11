package com.seventh7.mybatis.dom.model;

import com.intellij.util.xml.SubTagList;

import java.util.List;

/**
 * @author 汤旗
 */
public interface GroupThree extends GroupTwo{

  @SubTagList("selectKey")
  public List<SelectKey> getSelectKey();

}
