package com.example;

import config.FactoryConfiguration;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {

//        order (m-m) item
//        order (o-m) orderdetails , orderdetails (m-o) item

        Session session = FactoryConfiguration.getInstance().getSession();
        session.close();
    }
}