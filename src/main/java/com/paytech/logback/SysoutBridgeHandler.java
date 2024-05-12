package com.paytech.logback;

public final class SysoutBridgeHandler {

	public static boolean install() {
		ConsoleTarget.sysout.println("ConsoleTarget Initialized");
		System.setErr(SysoutPrintStream.INSTANCE);
		System.setOut(SysoutPrintStream.INSTANCE);
		return true;
	}
}
