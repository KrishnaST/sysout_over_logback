package sysout_over_logback;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.kst.logback.SysoutBridgeHandler;

public class SysoutOverLogbackTest {

	@Test
	public void test() {
		SysoutBridgeHandler.install();
		System.out.println("test logging");
		assertTrue(true);
	}
}
