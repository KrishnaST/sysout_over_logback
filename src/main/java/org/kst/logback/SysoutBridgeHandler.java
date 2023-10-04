package org.kst.logback;

public final class SysoutBridgeHandler {

	public static boolean install() {
		ConsoleTarget.SystemOut.sysout.println("ConsoleTarget Initialized");
		System.setErr(SysoutPrintStream.INSTANCE);
		System.setOut(SysoutPrintStream.INSTANCE);
		return true;
	}
}
