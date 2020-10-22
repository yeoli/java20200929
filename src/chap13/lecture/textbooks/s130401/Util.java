package chap13.lecture.textbooks.s130401;

import chap13.lecture.textbooks.s130202.Box;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
