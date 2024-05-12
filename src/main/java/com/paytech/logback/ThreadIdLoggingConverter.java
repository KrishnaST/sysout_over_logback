package com.paytech.logback;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.DynamicConverter;

public final class ThreadIdLoggingConverter extends DynamicConverter<ILoggingEvent> {

	@Override
	public final String convert(ILoggingEvent event) {
		return String.format("%04d", Thread.currentThread().getId());
	}

}
