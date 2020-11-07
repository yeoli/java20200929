package chap14.lecture.predicate;

class Fruit{
	public void showYou() {
		System.out.println("난 과일입니다.");
	}
}

class Apple extends Fruit{
	public void showYou() {
		super.showYou();
		System.out.println("난 붉은 과일입니다.");
	}
}

class banana extends Fruit{
	public void showYou() {
		super.showYou();
		System.out.println("난 노란 과일입니다.");
	}
}

class FruitBox<T>{ //t 대신 Fruit를 상속받는 인스턴스가 들어가면??
	T item;
	public void store(T item) {this.item = item;}
	public T pullOut() {return item;}
}

public class IntroWIldCard {
	public static void openAndShowFruitBox(FruitBox<? extends Fruit> box) {
		Fruit fruit = box.pullOut();
		fruit.showYou();
	}
	
	public static void main(String[] args) {
		FruitBox<Apple> box1 = new FruitBox<Apple>();
		box1.store(new Apple());
		
		openAndShowFruitBox(box1);
		
	}
}
