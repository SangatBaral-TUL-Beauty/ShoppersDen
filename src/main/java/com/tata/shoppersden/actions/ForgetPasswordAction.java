package com.tata.shoppersden.actions;

import com.tata.shoppersden.dao.CustomerDao;
import com.tata.shoppersden.dao.CustomerDaoImpl;

public class ForgetPasswordAction {
    private CustomerDao customerDao;
    public void forgetPasswordAction(String password,long userid) throws Exception {
        if(password == "")
        {
            throw new Exception("Password Cannot be Empty");
        }
        customerDao = new CustomerDaoImpl();
        customerDao.forgetPassword(password,userid);
    }

}
