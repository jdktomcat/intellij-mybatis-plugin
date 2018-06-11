package com.jdktomcat.mybatis.dom.description;

import com.intellij.openapi.module.Module;
import com.intellij.psi.xml.XmlFile;
import com.intellij.util.xml.DomFileDescription;
import com.jdktomcat.mybatis.util.DomUtils;
import com.jdktomcat.mybatis.dom.model.Mapper;
import com.jdktomcat.mybatis.util.DomUtils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author 汤旗
 */
public class MapperDescription extends DomFileDescription<Mapper> {

  public MapperDescription() {
    super(Mapper.class, "mapper");
  }

  @Override
  public boolean isMyFile(@NotNull XmlFile file, @Nullable Module module) {
    return DomUtils.isMybatisFile(file);
  }

}
