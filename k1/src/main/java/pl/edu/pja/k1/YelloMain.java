package pl.edu.pja.k1;

import java.io.PrintWriter;
import java.util.Objects;

public class YelloMain {

	public static void main(String[] args) {		
		new YelloMain().greet(System.console().writer(), args);
	}

	public String buildGreetings(String[] args) {
		Objects.requireNonNull(args);
		String who = args.length > 0 ? args[0] : "world";
		return String.format("Yello %s!", who);
	}

	public void greet(PrintWriter pw, String[] args) {
		pw.println(buildGreetings(args));
	}

}
