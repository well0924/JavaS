package com.java.Study.Chap09;

public class Sample08 {
	public static void main(String[] args) {
		OracleDatabase or = new OracleDatabase();
		MsDatabase ms = new MsDatabase();
		or.getConnection();
		System.out.println(or.getDbInfo());
		System.out.println(ms.getDbInfo());
	}
}

interface Database{
	public void getConnection();
	public String getDbInfo();
}

class OracleDatabase implements Database{
	boolean conn = false;
	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		this.conn = true;
	}

	@Override
	public String getDbInfo() {
		// TODO Auto-generated method stub
		String ret = "";
		if(conn) {
			ret = "Oracle에 접속되었습니다.";
		}else {
			ret ="Oracle에 접속되지 않았습니다.";
		}
		return ret;
	}
	
}

class MsDatabase implements Database{
	boolean conn = false;
	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		this.conn = true;
	}

	@Override
	public String getDbInfo() {
		// TODO Auto-generated method stub
		String ret = "";
		if(conn) {
			ret = "MsDatabase에 접속되었습니다.";
		}else {
			ret ="MsDatabase에 접속되지 않았습니다.";
		}
		return ret;
	}
	
}