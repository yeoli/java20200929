package chap11.string.textbook.s110302;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	public boolean equal(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
		return number;
	}
}
