package com.neu.po;

import com.neu.beans.Address;
import com.neu.beans.Lesson;

public class LessonAndAddress{
	private Lesson lesson;
	private Address address;	
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
}
