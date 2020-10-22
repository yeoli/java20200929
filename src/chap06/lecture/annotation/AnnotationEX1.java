package chap06.lecture.annotation;

@MyAnnotation
public class AnnotationEX1 {
	@MyAnnotation
	private int i;
	
	//주석들..
	//annotation
	public String toString() {
		return super.toString();
	}
	
	@MyAnnotation(value="abc", number = 5, names = {"c", "d"})
	public static void mymethod() {
		
	}
}
