package com.mobility;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.ParamConverter;
import com.mobility.boundary.TimeParam;


public class TimeParameterConverter implements ParamConverter<TimeParam> {

	@Override
	public TimeParam fromString(String string) {
		try {
			String[] params = string.split(",");
			TimeParam time = new TimeParam(params[0], params[1]);
			return time;

		} catch (IndexOutOfBoundsException ioobe) {
			throw new WebApplicationException("time parameters are incomplete!");
		} catch (NumberFormatException nfe) {
			throw new WebApplicationException(
					"time parameters have invalid format!");
		}
	}

	@Override
	public String toString(TimeParam time) {
		return time.toString();
	}

}

