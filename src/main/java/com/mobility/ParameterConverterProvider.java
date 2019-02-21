package com.mobility;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

import com.mobility.boundary.TimeParam;
import com.mobility.entity.Location;

@Provider
public class ParameterConverterProvider implements ParamConverterProvider {

	@SuppressWarnings("unchecked")
	@Override
	public <T> ParamConverter<T> getConverter(Class<T> type, Type type1,
			Annotation[] antns) {
		if (TimeParam.class.equals(type)) {
			return (ParamConverter<T>) new TimeParameterConverter();
		} else if (Location.Geometry.class.equals(type)) {
			return (ParamConverter<T>) new LocationParameterConverter();
		}
		return null;
	}

}
