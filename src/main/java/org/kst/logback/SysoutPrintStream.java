package org.kst.logback;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SysoutPrintStream extends PrintStream {

	//private static final PrintStream printer = ConsoleTarget.sysout;
	
	private static final Logger log = LoggerFactory.getLogger(SysoutPrintStream.class);
	
	public static final SysoutPrintStream INSTANCE = new SysoutPrintStream();

	private SysoutPrintStream() {
		super(new ByteArrayOutputStream());
	}

	@Override
	public void print(String s) {
		StackTraceElement caller = Thread.currentThread().getStackTrace()[2];
		String location = caller.getClassName() + "." + caller.getMethodName() + "(" + caller.getLineNumber() + ") ";
		//printer.println(location + s);
		log.info(location + s);

	}

	@Override
	public void print(Object obj) {
		StackTraceElement caller = Thread.currentThread().getStackTrace()[2];
		String location = caller.getClassName() + "." + caller.getMethodName() + "(" + caller.getLineNumber() + ") ";
		//printer.println(location + obj);
		log.info(location + obj);
	}

	@Override
	public void println() {
		StackTraceElement caller = Thread.currentThread().getStackTrace()[2];
		String location = caller.getClassName() + "." + caller.getMethodName() + "(" + caller.getLineNumber() + ") ";
		//printer.println(location);
		log.info(location);

	}

	@Override
	public void println(String x) {
		try {
			StackTraceElement caller = Thread.currentThread().getStackTrace()[2];
			String location = caller.getClassName() + "." + caller.getMethodName() + "(" + caller.getLineNumber() + ") ";
			//printer.println(location + x);
			log.info(location + x);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void println(Object x) {
		StackTraceElement caller = Thread.currentThread().getStackTrace()[2];
		String location = caller.getClassName() + "." + caller.getMethodName() + "(" + caller.getLineNumber() + ") ";
		//printer.println(location + x);
		log.info(location + x);
	}

	@Override
	public PrintStream printf(String format, Object... args) {
		StackTraceElement caller = Thread.currentThread().getStackTrace()[2];
		String location = caller.getClassName() + "." + caller.getMethodName() + "(" + caller.getLineNumber() + ") ";
		//printer.println(location + Arrays.toString(args));
		log.info(location + Arrays.toString(args));
		return this;
	}

	@Override
	public void flush() {

		super.flush();
	}

	@Override
	public void close() {

		super.close();
	}

	@Override
	protected void setError() {

		super.setError();
	}

	@Override
	protected void clearError() {

		super.clearError();
	}

	@Override
	public void write(int b) {

		super.write(b);
	}

	@Override
	public void write(byte[] buf, int off, int len) {

		super.write(buf, off, len);
	}

	@Override
	public void print(boolean b) {

		super.print(b);
	}

	@Override
	public void print(char c) {

		super.print(c);
	}

	@Override
	public void print(int i) {

		super.print(i);
	}

	@Override
	public void print(long l) {

		super.print(l);
	}

	@Override
	public void print(float f) {

		super.print(f);
	}

	@Override
	public void print(double d) {

		super.print(d);
	}

	@Override
	public void print(char[] s) {

		super.print(s);
	}

	@Override
	public void println(boolean x) {

		super.println(x);
	}

	@Override
	public void println(char x) {

		super.println(x);
	}

	@Override
	public void println(int x) {

		super.println(x);
	}

	@Override
	public void println(long x) {

		super.println(x);
	}

	@Override
	public void println(float x) {

		super.println(x);
	}

	@Override
	public void println(double x) {

		super.println(x);
	}

	@Override
	public void println(char[] x) {

		super.println(x);
	}

	@Override
	public PrintStream printf(Locale l, String format, Object... args) {
		return this;
	}

	@Override
	public PrintStream format(String format, Object... args) {
		return this;
	}

	@Override
	public PrintStream format(Locale l, String format, Object... args) {
		return this;

	}

	@Override
	public PrintStream append(CharSequence csq) {
		return this;
	}

	@Override
	public PrintStream append(CharSequence csq, int start, int end) {
		return this;
	}

	@Override
	public PrintStream append(char c) {
		return this;
	}

	@Override
	public void write(byte[] b) throws IOException {

		super.write(b);
	}

	@Override
	protected void finalize() throws Throwable {

	}

	public void logCaller(Object obj) {
		StackTraceElement caller = Thread.currentThread().getStackTrace()[3];
		StackTraceElement called = Thread.currentThread().getStackTrace()[2];
		String callerLocation = caller.getClassName() + "." + caller.getMethodName() + "(" + caller.getLineNumber() + ") ";
		String calledLocation = called.getClassName() + "." + called.getMethodName() + "(" + called.getLineNumber() + ") ";
		//printer.println("caller : "+callerLocation + " : called : "+calledLocation+ " : "+obj);
		log.info("caller : "+callerLocation + " : called : "+calledLocation+ " : "+obj);
	}

}
