package com.ysp.app;

import com.ysp.Entity.Address;
import com.ysp.Entity.User;
import com.ysp.dao.UserAddressdao;

public class Adduser {
	public static void main(String[] args) {
		
		//---------- scenario 1 -----------------//
		//first store user, then store address, finally link the user with the address

		//adding a user
		/*User user = new User();
		user.setName("Puja");
		user.setEmail("puja@gmail.com");
		user.setMobileNumber(9988776655L);
		dao.add(user);*/
		
		//adding an address
		/*Address addr = new Address();
		addr.setPincode(40002);
		addr.setCity("Mumbai");
		addr.setState("Maharashtra");
		dao.add(addr);*/
		
		//link user and address
		/*User user = dao.fetchUserById(15);
		Address addr = dao.fetchAddressById(16);
		user.setAddress(addr);
		dao.update(user);*/

		//---------- scenario 2 -----------------//
				//store user and address in one go in the db
		User user = new User();
		user.setName("Yogesh");
		user.setEmail("yogesh@gmail.com");
		user.setMobileNo(8408039572L);
		Address address = new Address();
		address.setCity("Latur");
		address.setPincode(413532);
		address.setState("Maharashtra");
		address.setCountry("india");
		UserAddressdao dao = new UserAddressdao();
		user.setAddress(address); 
		//here we will get one error if we are directly liking without storing each object in the databases
		//the error is related to cascade
		//cascade is used for if we are performing one action on a perticular table
		//them same action will automatically perform in its associated entity
		//so in onToOne write as a parameter onToone(Cascade= cascadeType.All)
		
		dao.adduser(user);
		
		
	}
	
	
	
	
	
	

}
