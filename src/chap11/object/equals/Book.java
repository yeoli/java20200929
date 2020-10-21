package chap11.object.equals;

public class Book {
	private int barCode;
	
	public Book(int barCode) {
		this.barCode = barCode;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return barCode;
	}
	
	public boolean equals(Object obj) {
		Book o = (Book) obj;
		
		return this.barCode == o.barCode;
		
	}

}
