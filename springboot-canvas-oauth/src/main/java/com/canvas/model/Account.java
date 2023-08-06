package com.canvas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Account {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String name;
	 private String workflow_state;
	 private String parent_account_id = null;
	 private String root_account_id = null;
	 private String uuid;
	 private Long default_storage_quota_mb;
	 private Long default_user_storage_quota_mb;
	 private Long default_group_storage_quota_mb;
	 private String default_time_zone;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWorkflow_state() {
		return workflow_state;
	}
	public void setWorkflow_state(String workflow_state) {
		this.workflow_state = workflow_state;
	}
	public String getParent_account_id() {
		return parent_account_id;
	}
	public void setParent_account_id(String parent_account_id) {
		this.parent_account_id = parent_account_id;
	}
	public String getRoot_account_id() {
		return root_account_id;
	}
	public void setRoot_account_id(String root_account_id) {
		this.root_account_id = root_account_id;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public Long getDefault_storage_quota_mb() {
		return default_storage_quota_mb;
	}
	public void setDefault_storage_quota_mb(Long default_storage_quota_mb) {
		this.default_storage_quota_mb = default_storage_quota_mb;
	}
	public Long getDefault_user_storage_quota_mb() {
		return default_user_storage_quota_mb;
	}
	public void setDefault_user_storage_quota_mb(Long default_user_storage_quota_mb) {
		this.default_user_storage_quota_mb = default_user_storage_quota_mb;
	}
	public Long getDefault_group_storage_quota_mb() {
		return default_group_storage_quota_mb;
	}
	public void setDefault_group_storage_quota_mb(Long default_group_storage_quota_mb) {
		this.default_group_storage_quota_mb = default_group_storage_quota_mb;
	}
	public String getDefault_time_zone() {
		return default_time_zone;
	}
	public void setDefault_time_zone(String default_time_zone) {
		this.default_time_zone = default_time_zone;
	}
	 
}
