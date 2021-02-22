package com.tata.shoppersden.actions;


import com.tata.shoppersden.dao.CustomerDao;
import com.tata.shoppersden.dao.CustomerDaoImpl;

public class LoginAction {

    public void loginAction(long userId,String password) throws Exception {

        CustomerDao customerDao = new CustomerDaoImpl();
        customerDao.loginUser(userId,password);
    }

}
