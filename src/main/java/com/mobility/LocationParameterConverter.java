package com.mobility;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.ParamConverter;
import com.mobility.entity.Location;
import com.mobility.entity.Location.Geometry;

public class LocationParameterConverter implements
		ParamConverter<Location.Geometry> {

	@Override
	public Geometry fromString(String value) {
		try {
			String[] params = value.split(",");
			Location.Geometry location = new Location.Geometry(
					Double.valueOf(params[0]), Double.valueOf(params[1]));
			return location;

		} catch (IndexOutOfBoundsException ioobe) {
			throw new WebApplicationException(
					"location parameters are incomplete!");
		} catch (NumberFormatException nfe) {
			throw new WebApplicationException(
					"location parameters have invalid format!");
		}
	}

	@Override
	public String toString(Geometry value) {
		return String.valueOf(value.getLat()) + String.valueOf(value.getLng());
	}

}
