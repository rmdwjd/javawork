package interface05;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		/*
			DataAccessObject dao = new OracleDao();
			--> 형변환 하라는 뜻!
		*/
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

}
