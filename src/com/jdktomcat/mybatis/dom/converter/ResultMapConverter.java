package com.jdktomcat.mybatis.dom.converter;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

import com.intellij.util.xml.ConvertContext;
import com.intellij.util.xml.DomElement;
import com.jdktomcat.mybatis.util.MapperUtils;
import com.jdktomcat.mybatis.dom.model.IdDomElement;
import com.jdktomcat.mybatis.dom.model.Mapper;
import com.jdktomcat.mybatis.dom.model.ResultMap;
import com.jdktomcat.mybatis.util.MapperUtils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

/**
 * @author 汤旗
 */
public class ResultMapConverter extends IdBasedTagConverter{

  @NotNull @Override
  public Collection<? extends IdDomElement> getComparisons(@Nullable Mapper mapper, ConvertContext context) {
    DomElement invocationElement = context.getInvocationElement();
    if (isContextElementOfResultMap(mapper, invocationElement)) {
      return doFilterResultMapItself(mapper, (ResultMap)invocationElement.getParent());
    } else {
      return mapper.getResultMaps();
    }
  }

  private boolean isContextElementOfResultMap(Mapper mapper, DomElement invocationElement) {
    return MapperUtils.isMapperWithSameNamespace(MapperUtils.getMapper(invocationElement), mapper)
           && invocationElement.getParent() instanceof ResultMap;
  }

  private Collection<? extends IdDomElement> doFilterResultMapItself(Mapper mapper, final ResultMap resultMap) {
    return Collections2.filter(mapper.getResultMaps(), new Predicate<ResultMap>() {
      @Override
      public boolean apply(ResultMap input) {
        return !MapperUtils.getId(input).equals(MapperUtils.getId(resultMap));
      }
    });
  }

}
