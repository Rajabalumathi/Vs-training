package com.example.kkgas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "access")
public class Access implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 566198743875480110L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition = "Integer(5)")
	private int accessId;

	@Column(name = "access_name")
	private String accessName;

	@Column(name = "accessDescp")
	private String accessDescp;

	public int getAccessId() {
		return accessId;
	}

	public void setAccessId(int accessId) {
		this.accessId = accessId;
	}

	public String getAccessName() {
		return accessName;
	}

	public void setAccessName(String accessName) {
		this.accessName = accessName;
	}

	public String getAccessDescp() {
		return accessDescp;
	}

	public void setAccessDescp(String accessDescp) {
		this.accessDescp = accessDescp;
	}

	public Access( String accessName, String accessDescp) {
		this.accessName = accessName;
		this.accessDescp = accessDescp;
	}

	public Access() {

	}
}
