package com.model;


import org.hibernate.Session;
import org.hibernate.Transaction;

public class TPCExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tr=null;
        try (Session ses=HBUtil.getSesFactory().openSession()){
        	tr=ses.beginTransaction();
        	Student s1=new Student("Gowsika");
        	RegStudent s2=new RegStudent(5000,"cse","Hema");
        	Staff s3=new Staff(500,"6","Anu");
        	ses.persist(s1);
        	ses.persist(s2);
        	ses.persist(s3);
        	
        	tr.commit();
        	ses.close();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
	}

}