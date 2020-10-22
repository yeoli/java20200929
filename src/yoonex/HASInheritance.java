package yoonex;

class Gun{
	int bullet;
	
	public Gun(int bullet) {
		this.bullet = bullet;
	}
	
	public void shot() {
		System.out.println("BBang!");
		bullet--;
	}
}

class Police extends Gun {
	int handcuffs; //소유한 수갑의 수
	Gun pistol;
	
	public Police(int bullet, int handcuffs) {
		super(bullet);
		this.handcuffs = handcuffs;
		
		if(bullet!=0) {
			pistol = new Gun(bullet);
		} else pistol = null;
	}
	
	public void putHandcuff() {
		System.out.println("SNAP!");
		handcuffs--;
	}
	
	public void shot() {
		if(pistol==null)
			System.out.println("Hut BBANG!");
		else pistol.shot();
	}
}

public class HASInheritance {
	public static void main(String[] args) {
		Police haveGun = new Police(5, 3);
		haveGun.shot();
		haveGun.putHandcuff();
		
		Police dontHaveGun = new Police(0, 3);
		dontHaveGun.shot();
		dontHaveGun.putHandcuff();
		
	}
}
