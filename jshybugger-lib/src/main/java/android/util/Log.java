package android.util;

public class Log {
	public static void e(String tag, String message) {
		System.err.println(tag + ":" + message);
	}
	public static void e(String tag, String message, Throwable e) {
		System.err.println(tag + ":" + message);
		e.printStackTrace();
	}
	public static void w(String tag, String message) {
		e(tag, message);
	}
	public static void i(String tag, String message) {
		System.out.println(tag + ":" + message);
	}
	public static void d(String tag, String message) {
		e(tag, message);
	}
	public static void d(String tag, String message, Throwable e) {
		e(tag, message, e);
	}
}
