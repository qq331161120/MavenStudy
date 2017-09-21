package com.cj.mvnbook.hellowordm2e;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String str = " Hello World!";
		if (args.length > 0) {
			str = args[0] + str;
		}
		System.out.println(str);
	}
}
