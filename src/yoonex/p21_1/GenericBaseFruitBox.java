package yoonex.p21_1;

class Orange{
	int sugarContent;
	
	//생성자
	public Orange(int sugar) {
		sugarContent = sugar;
	}
	
	//메소드
	public void showSugarContent() {
		System.out.println("당도 " + sugarContent);
	}
}

class Apple{
	int weight;
	
	//생성자
	public Apple(int weight) {
		this.weight = weight;
	}
	
	//메소드
	public void showAppleWeight() {
		System.out.println("무게 " + weight);
	}
}

class FruitBox<T> {
	T item; // 자료형 T형의 객체 참조값을 item에 저장
	
	public FruitBox() {
		
	}

	public FruitBox(T item) {
		this.item = item;
	}

	public void store(T item) {
		this.item = item;
	}
	
	public T pullOut() {
		return item; //item 객체 반환
	}
}

public class GenericBaseFruitBox {
	public static void main(String[] args) {
		
//		FruitBox<Orange> orgBox = new FruitBox<Orange>();
//		Orange org1 = new Orange(20);
//		orgBox.store(org1);
//		org1 = orgBox.pullOut();
//		org1.showSugarContent();
//		
//		FruitBox<Apple> appleBox = new FruitBox<Apple>();
//		Apple app1 = new Apple(30);
//		appleBox.store(app1);
//		app1 = appleBox.pullOut();
//		app1.showAppleWeight();
		
		FruitBox<Orange> orBox = new FruitBox<Orange>(new Orange(10));
		Orange org = orBox.pullOut();
		org.showSugarContent();
		
		FruitBox<Apple> apBox = new FruitBox<Apple>(new Apple(20));
		Apple app = apBox.pullOut();
		app.showAppleWeight();
		
		
	}
}
