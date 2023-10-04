package org.kst.logback;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public final class ClassLoggingConverter extends ClassicConverter {

	@Override
	public final String convert(ILoggingEvent arg0) {
		try {
			String location ="";
			StackTraceElement[] stack = arg0.getCallerData();
			for (StackTraceElement caller : stack) {
				location = location + "-" + caller.getClassName() + "." + caller.getMethodName() + "(" + caller.getLineNumber() + ")";
			}
			return location;
		} catch (Exception e) {e.printStackTrace();}
		return null;
	}

}
