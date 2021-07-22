package com.thisisjava.chap8.q4;

public class DaoExample {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		
		DataAccessObject tempObj = new DataAccessObject() {

			@Override
			public void select() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void insert() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void update() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void delete() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

}
