package chap06.textbook.exercises;

public class ChildProperty {
	int numOfBead;
	
	ChildProperty(int numOfBead) {
		this.numOfBead = numOfBead;
	}
	
	void obtainBead(ChildProperty child, int obtainCount) {
		int obtainBeadCount = child.loseBead(obtainCount);
		numOfBead += obtainBeadCount;
		
	}
	
	int loseBead(int loseCount) {
		
		if(numOfBead<loseCount) {
			int retValue = numOfBead;
			numOfBead = 0;
			return retValue;
		}
		
		numOfBead -= loseCount;
		return loseCount;
	}
	
	void haveBead() {
		System.out.println(numOfBead);
	}
}
