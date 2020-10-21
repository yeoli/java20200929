package chap11.textbook.s110303;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
				
			}
		}
		return false;
	}
	
@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id.hashCode();
	}
}
