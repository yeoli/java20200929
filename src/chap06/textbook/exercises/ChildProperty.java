package chap06.textbook.exercises;

public class ChildProperty {
	int Bead;
	
	ChildProperty(int Bead) {
		this.Bead = Bead;
	}
	
	void obtainBead(ChildProperty child, int obtainCount) {
		int obtainBeadCount = child.loseBead(obtainCount);
		Bead += obtainBeadCount;
		
	}
	
	int loseBead(int loseCount) {
		if(Bead<loseCount) {
			int retValue = Bead;
			Bead = 0;
			return retValue;
		}
		
		Bead -= loseCount;
		return loseCount;
	}
	
	void haveBead() {
		System.out.println(Bead);
	}
}
