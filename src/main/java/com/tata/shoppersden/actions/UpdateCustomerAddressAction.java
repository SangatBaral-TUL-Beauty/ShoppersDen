package com.tata.shoppersden.actions;

import com.tata.shoppersden.dao.CustomerDao;
import com.tata.shoppersden.dao.CustomerDaoImpl;

public class UpdateCustomerAddressAction {
    private CustomerDao customerDao;
    public void updateCustomerAddress(String address,long userId) throws Exception {
        if(address=="" || userId<0)
        {
            throw new Exception("Invlaid Address or User Id");
        }
        customerDao = new CustomerDaoImpl();
        customerDao.changeAddress(address,userId);
    }
}
