package com.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="regStudent")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="name"))
})
public class RegStudent extends Student {
	@Column(name="fees")
   private float fees;
	@Column(name="dept")
   private String dept;
    
    
	public RegStudent() {
		super();
	}
	public RegStudent(float fees, String dept, String name) {
		super(name);
		this.fees = fees;
		this.dept = dept;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}

