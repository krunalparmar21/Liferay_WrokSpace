/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.inexture.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link StudentDemo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentDemo
 * @generated
 */
public class StudentDemoWrapper
	extends BaseModelWrapper<StudentDemo>
	implements ModelWrapper<StudentDemo>, StudentDemo {

	public StudentDemoWrapper(StudentDemo studentDemo) {
		super(studentDemo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("studentId", getStudentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createdby", getCreatedby());
		attributes.put("modifiedby", getModifiedby());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("enrollmentNo", getEnrollmentNo());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("contactNo", getContactNo());
		attributes.put("city", getCity());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long studentId = (Long)attributes.get("studentId");

		if (studentId != null) {
			setStudentId(studentId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long createdby = (Long)attributes.get("createdby");

		if (createdby != null) {
			setCreatedby(createdby);
		}

		String modifiedby = (String)attributes.get("modifiedby");

		if (modifiedby != null) {
			setModifiedby(modifiedby);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String enrollmentNo = (String)attributes.get("enrollmentNo");

		if (enrollmentNo != null) {
			setEnrollmentNo(enrollmentNo);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String contactNo = (String)attributes.get("contactNo");

		if (contactNo != null) {
			setContactNo(contactNo);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}
	}

	@Override
	public StudentDemo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the city of this student demo.
	 *
	 * @return the city of this student demo
	 */
	@Override
	public String getCity() {
		return model.getCity();
	}

	/**
	 * Returns the company ID of this student demo.
	 *
	 * @return the company ID of this student demo
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contact no of this student demo.
	 *
	 * @return the contact no of this student demo
	 */
	@Override
	public String getContactNo() {
		return model.getContactNo();
	}

	/**
	 * Returns the create date of this student demo.
	 *
	 * @return the create date of this student demo
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the createdby of this student demo.
	 *
	 * @return the createdby of this student demo
	 */
	@Override
	public long getCreatedby() {
		return model.getCreatedby();
	}

	/**
	 * Returns the enrollment no of this student demo.
	 *
	 * @return the enrollment no of this student demo
	 */
	@Override
	public String getEnrollmentNo() {
		return model.getEnrollmentNo();
	}

	/**
	 * Returns the first name of this student demo.
	 *
	 * @return the first name of this student demo
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the group ID of this student demo.
	 *
	 * @return the group ID of this student demo
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the last name of this student demo.
	 *
	 * @return the last name of this student demo
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the modifiedby of this student demo.
	 *
	 * @return the modifiedby of this student demo
	 */
	@Override
	public String getModifiedby() {
		return model.getModifiedby();
	}

	/**
	 * Returns the modified date of this student demo.
	 *
	 * @return the modified date of this student demo
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this student demo.
	 *
	 * @return the primary key of this student demo
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the student ID of this student demo.
	 *
	 * @return the student ID of this student demo
	 */
	@Override
	public long getStudentId() {
		return model.getStudentId();
	}

	/**
	 * Returns the uuid of this student demo.
	 *
	 * @return the uuid of this student demo
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the city of this student demo.
	 *
	 * @param city the city of this student demo
	 */
	@Override
	public void setCity(String city) {
		model.setCity(city);
	}

	/**
	 * Sets the company ID of this student demo.
	 *
	 * @param companyId the company ID of this student demo
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contact no of this student demo.
	 *
	 * @param contactNo the contact no of this student demo
	 */
	@Override
	public void setContactNo(String contactNo) {
		model.setContactNo(contactNo);
	}

	/**
	 * Sets the create date of this student demo.
	 *
	 * @param createDate the create date of this student demo
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the createdby of this student demo.
	 *
	 * @param createdby the createdby of this student demo
	 */
	@Override
	public void setCreatedby(long createdby) {
		model.setCreatedby(createdby);
	}

	/**
	 * Sets the enrollment no of this student demo.
	 *
	 * @param enrollmentNo the enrollment no of this student demo
	 */
	@Override
	public void setEnrollmentNo(String enrollmentNo) {
		model.setEnrollmentNo(enrollmentNo);
	}

	/**
	 * Sets the first name of this student demo.
	 *
	 * @param firstName the first name of this student demo
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the group ID of this student demo.
	 *
	 * @param groupId the group ID of this student demo
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the last name of this student demo.
	 *
	 * @param lastName the last name of this student demo
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the modifiedby of this student demo.
	 *
	 * @param modifiedby the modifiedby of this student demo
	 */
	@Override
	public void setModifiedby(String modifiedby) {
		model.setModifiedby(modifiedby);
	}

	/**
	 * Sets the modified date of this student demo.
	 *
	 * @param modifiedDate the modified date of this student demo
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this student demo.
	 *
	 * @param primaryKey the primary key of this student demo
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the student ID of this student demo.
	 *
	 * @param studentId the student ID of this student demo
	 */
	@Override
	public void setStudentId(long studentId) {
		model.setStudentId(studentId);
	}

	/**
	 * Sets the uuid of this student demo.
	 *
	 * @param uuid the uuid of this student demo
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected StudentDemoWrapper wrap(StudentDemo studentDemo) {
		return new StudentDemoWrapper(studentDemo);
	}

}