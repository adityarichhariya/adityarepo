package com.school.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
@Cacheable
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "student_Sequence")
	@SequenceGenerator(name = "student_Sequence", sequenceName = "STUDENT_SEQ")
	private Integer id;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Attribute> attributeList;
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Student(List<Attribute> attributeList) {
		super();
		this.attributeList = attributeList;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Attribute> getAttributeList() {
		return attributeList;
	}

	public void setAttributeList(List<Attribute> attributeList) {
		this.attributeList = attributeList;
	}
	
	
}
