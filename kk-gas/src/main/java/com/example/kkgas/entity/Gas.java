package com.example.kkgas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gas")
public class Gas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition = "Integer(5)")
	private int gasId;

	@Column(name = "gas_amount")
	private Integer gasAmount;

	private Boolean gasStatus;

	public int getGasId() {
		return gasId;
	}

	public void setGasId(int gasId) {
		this.gasId = gasId;
	}

	public Integer getGasAmount() {
		return gasAmount;
	}

	public void setGasAmount(Integer gasAmount) {
		this.gasAmount = gasAmount;
	}

	public Boolean getGasStatus() {
		return gasStatus;
	}

	public void setGasStatus(Boolean gasStatus) {
		this.gasStatus = gasStatus;
	}
	
	public Gas(Integer gasAmount, Boolean gasStatus) {
		this.gasAmount = gasAmount;
		this.gasStatus = gasStatus;
	}
	public Gas() {
		
	}
}
