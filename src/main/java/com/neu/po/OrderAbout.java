package com.neu.po;

import com.neu.beans.Address;
import com.neu.beans.Lesson;
import com.neu.beans.SOrder;

public class OrderAbout {
	private Lesson lesson;
	private Address address;
	private SOrder order;
	public Lesson getLesson() {
		return lesson;
	}
	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public SOrder getOrder() {
		return order;
	}
	public void setOrder(SOrder order) {
		this.order = order;
	}
	
}
