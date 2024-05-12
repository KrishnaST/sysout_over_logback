package com.paytech.logback;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public final class ClassLoggingConverter extends ClassicConverter {

	@Override
	public final String convert(ILoggingEvent event) {
		try {
			String location ="";
			StackTraceElement[] stack = event.getCallerData();
			for (StackTraceElement caller : stack) {
				location = location + "-" + caller.getClassName() + "." + caller.getMethodName() + "(" + caller.getLineNumber() + ")";
			}
			return location;
		} catch (Exception e) {e.printStackTrace();}
		return null;
	}

}
