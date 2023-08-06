package com.canvas.dto;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoursesDTO {
     @Id
	 private float id;
	 private String name;
	 private float account_id;
	 private String uuid;
	 private String start_at;
	 private String grading_standard_id = null;
	 private boolean is_public;
	 private String created_at;
	 private String course_code;
	 private String default_view;
	 private float root_account_id;
	 private float enrollment_term_id;
	 private String license;
	 private String end_at = null;
	 private boolean public_syllabus;
	 private boolean public_syllabus_to_auth;
	 private float storage_quota_mb;
	 private boolean is_public_to_auth_users;
	 private boolean apply_assignment_group_weights;
	public float getId() {
		return id;
	}
	public void setId(float id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAccount_id() {
		return account_id;
	}
	public void setAccount_id(float account_id) {
		this.account_id = account_id;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getStart_at() {
		return start_at;
	}
	public void setStart_at(String start_at) {
		this.start_at = start_at;
	}
	public String getGrading_standard_id() {
		return grading_standard_id;
	}
	public void setGrading_standard_id(String grading_standard_id) {
		this.grading_standard_id = grading_standard_id;
	}
	public boolean isIs_public() {
		return is_public;
	}
	public void setIs_public(boolean is_public) {
		this.is_public = is_public;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getCourse_code() {
		return course_code;
	}
	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}
	public String getDefault_view() {
		return default_view;
	}
	public void setDefault_view(String default_view) {
		this.default_view = default_view;
	}
	public float getRoot_account_id() {
		return root_account_id;
	}
	public void setRoot_account_id(float root_account_id) {
		this.root_account_id = root_account_id;
	}
	public float getEnrollment_term_id() {
		return enrollment_term_id;
	}
	public void setEnrollment_term_id(float enrollment_term_id) {
		this.enrollment_term_id = enrollment_term_id;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getEnd_at() {
		return end_at;
	}
	public void setEnd_at(String end_at) {
		this.end_at = end_at;
	}
	public boolean isPublic_syllabus() {
		return public_syllabus;
	}
	public void setPublic_syllabus(boolean public_syllabus) {
		this.public_syllabus = public_syllabus;
	}
	public boolean isPublic_syllabus_to_auth() {
		return public_syllabus_to_auth;
	}
	public void setPublic_syllabus_to_auth(boolean public_syllabus_to_auth) {
		this.public_syllabus_to_auth = public_syllabus_to_auth;
	}
	public float getStorage_quota_mb() {
		return storage_quota_mb;
	}
	public void setStorage_quota_mb(float storage_quota_mb) {
		this.storage_quota_mb = storage_quota_mb;
	}
	public boolean isIs_public_to_auth_users() {
		return is_public_to_auth_users;
	}
	public void setIs_public_to_auth_users(boolean is_public_to_auth_users) {
		this.is_public_to_auth_users = is_public_to_auth_users;
	}
	public boolean isApply_assignment_group_weights() {
		return apply_assignment_group_weights;
	}
	public void setApply_assignment_group_weights(boolean apply_assignment_group_weights) {
		this.apply_assignment_group_weights = apply_assignment_group_weights;
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
