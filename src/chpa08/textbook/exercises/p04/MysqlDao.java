package chpa08.textbook.exercises.p04;

public class MysqlDao implements DataAccessObject{

	public static String s = "Mysql DB";
	
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println(s +"에서 검색");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println(s +"에서 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(s +"에서 수정");
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println(s +"에서 삭제");
	}
	
}
