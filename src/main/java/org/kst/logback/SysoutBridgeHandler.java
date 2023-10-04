package org.kst.logback;

import java.io.PrintStream;

public final class SysoutBridgeHandler {

	public static final PrintStream out = System.out;
	public static final PrintStream err = System.err;
	
	public static boolean install() {
		System.setErr(SysoutPrintStream.INSTANCE);
		System.setOut(SysoutPrintStream.INSTANCE);
		return true;
	}
}
