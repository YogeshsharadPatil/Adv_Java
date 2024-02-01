package com.ysp.app;

import com.ysp.dao.Customerdao;

public class deleteCustomer {

	public static void main(String[] args) {
		Customerdao dao = new Customerdao();
		dao.delete(9);

	}

}
