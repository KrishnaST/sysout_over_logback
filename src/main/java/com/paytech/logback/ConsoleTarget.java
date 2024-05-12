package com.paytech.logback;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public enum ConsoleTarget {
	
    SystemOut("System.out", new OutputStream() {
        @Override
        public void write(int b) throws IOException {
        	sysout.write(b);
        }

        @Override
        public void write(byte b[]) throws IOException {
        	sysout.write(b);
        }

        @Override
        public void write(byte b[], int off, int len) throws IOException {
        	sysout.write(b, off, len);
        }

        @Override
        public void flush() throws IOException {
        	sysout.flush();
        }
    }),

    SystemErr("System.err", new OutputStream() {
        @Override
        public void write(int b) throws IOException {
        	syserr.write(b);
        }

        @Override
        public void write(byte b[]) throws IOException {
        	syserr.write(b);
        }

        @Override
        public void write(byte b[], int off, int len) throws IOException {
        	syserr.write(b, off, len);
        }

        @Override
        public void flush() throws IOException {
        	syserr.flush();
        }
    });

    public static ConsoleTarget findByName(String name) {
        for (ConsoleTarget target : ConsoleTarget.values()) {
            if (target.name.equalsIgnoreCase(name)) {
                return target;
            }
        }
        return null;
    }

    private final String name;
    private final OutputStream stream;

    private ConsoleTarget(String name, OutputStream stream) {
        this.name = name;
        this.stream = stream;
    }

    public String getName() {
        return name;
    }

    public OutputStream getStream() {
        return stream;
    }

    @Override
    public String toString() {
        return name;
    }
    
    public static final PrintStream sysout = System.out;
    public static final PrintStream syserr = System.err;
}
