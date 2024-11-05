package com.service;

import com.dao.Bookdao;

public class Bookservice {

	public void insertdata(int bid, String book_name, String book_type, int book_price) throws Exception{
		Bookdao sd=new Bookdao();
		
		sd.insertData(bid,book_name,book_type,book_price);
	}
	public void updateData(int bid, String book_name) throws Exception{
		Bookdao sd=new Bookdao();
		sd.updateData(bid,book_name);
	}
	public void deleteData(int bid) throws Exception{
		Bookdao sd=new Bookdao();
		sd.deleteData(bid);
	}
	public void fetchData() throws Exception{
		Bookdao sd=new Bookdao();
		sd.fetchData();
	}
}
	

