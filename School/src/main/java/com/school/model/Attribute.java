package com.school.model;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "ATTRIBUTE")
@Cacheable
public class Attribute {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attribute_Sequence")
	@SequenceGenerator(name = "attribute_Sequence", sequenceName = "ATTRIBUTE_SEQ")
	private Long id;

	@JsonProperty(value = "attributename")
	@Column(name = "attributename")
	private String attributeName;

	@JsonProperty(value = "attributevalue")
	@Column(name = "attributevalue")
	private String attributeValue;

	public Attribute() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	public Attribute(String attributeName, String attributeValue) {
		super();
		this.attributeName = attributeName;
		this.attributeValue = attributeValue;
	}

}