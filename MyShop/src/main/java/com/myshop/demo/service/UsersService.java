package com.myshop.demo.service;

import java.util.List;

import com.myshop.demo.entity.Users;

public interface UsersService {
	 
	public Users saveUsers(Users u);

	public Users findById(Long id);

	public Users findByPhone(String phone);

	public Users findUsersByUserName(String userName);

	public Users getUserByPhoneNoAndPassword(String phone, String password);

	public Users getUserByUserNameAndPassword(String userName, String password);
	public List<Users> findAll();

	public Users getUserByPhoneAndOTP(String phone, String otp);

	public Object getUserCompleteProfile(Long id,Long spId);

}
