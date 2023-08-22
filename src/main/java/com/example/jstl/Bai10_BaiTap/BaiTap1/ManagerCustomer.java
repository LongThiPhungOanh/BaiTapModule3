package com.example.jstl.Bai10_BaiTap.BaiTap1;

import java.util.ArrayList;
import java.util.List;
public class ManagerCustomer {
    List<Customer> customers = new ArrayList<>();
    public void addProduct(){
        customers.add(new Customer("Oanh","11-10-2008","Hồ Chí Minh","img.png"));
        customers.add(new Customer("Phu","09-16-1998","Hà Nội","img.png"));
        customers.add(new Customer("Thanh","09-08-1998","Hải Dương","img.png"));
        customers.add(new Customer("Nam","03-02-1997","Hải Phòng","img.png"));
    }
}
