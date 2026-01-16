package com.myshop.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "appointment_slots")

public class AppointmentSlots {
	
	private Long id;
	private String appointType;
	private Long customerId;
	private Long shopId;
	private Long slotId;
	private Long ownerId;
	private Boolean status;
	private Date createdAt;
	public AppointmentSlots() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppointmentSlots(Long id, String appointType, Long customerId, Long shopId, Long slotId, Long ownerId,
			Boolean status, Date createdAt) {
		super();
		this.id = id;
		this.appointType = appointType;
		this.customerId = customerId;
		this.shopId = shopId;
		this.slotId = slotId;
		this.ownerId = ownerId;
		this.status = status;
		this.createdAt = createdAt;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name= "appointtype")
	public String getAppointType() {
		return appointType;
	}
	public void setAppointType(String appointType) {
		this.appointType = appointType;
	}
	@Column(name= "customerid")
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	@Column(name= "shopid")
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	@Column(name= "slotid")
	public Long getSlotId() {
		return slotId;
	}
	public void setSlotId(Long slotId) {
		this.slotId = slotId;
	}
	@Column(name= "ownerid")
	public Long getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}
	@Column(name= "status")
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	@Column(name= "createat")
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}

