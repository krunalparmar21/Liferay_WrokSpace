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

package com.Employee.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link emp}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see emp
 * @generated
 */
public class empWrapper
	extends BaseModelWrapper<emp> implements emp, ModelWrapper<emp> {

	public empWrapper(emp emp) {
		super(emp);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("empId", getEmpId());
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

		Long empId = (Long)attributes.get("empId");

		if (empId != null) {
			setEmpId(empId);
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
	public emp cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the city of this emp.
	 *
	 * @return the city of this emp
	 */
	@Override
	public String getCity() {
		return model.getCity();
	}

	/**
	 * Returns the company ID of this emp.
	 *
	 * @return the company ID of this emp
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contact no of this emp.
	 *
	 * @return the contact no of this emp
	 */
	@Override
	public String getContactNo() {
		return model.getContactNo();
	}

	/**
	 * Returns the create date of this emp.
	 *
	 * @return the create date of this emp
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the createdby of this emp.
	 *
	 * @return the createdby of this emp
	 */
	@Override
	public long getCreatedby() {
		return model.getCreatedby();
	}

	/**
	 * Returns the emp ID of this emp.
	 *
	 * @return the emp ID of this emp
	 */
	@Override
	public long getEmpId() {
		return model.getEmpId();
	}

	/**
	 * Returns the enrollment no of this emp.
	 *
	 * @return the enrollment no of this emp
	 */
	@Override
	public String getEnrollmentNo() {
		return model.getEnrollmentNo();
	}

	/**
	 * Returns the first name of this emp.
	 *
	 * @return the first name of this emp
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the group ID of this emp.
	 *
	 * @return the group ID of this emp
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the last name of this emp.
	 *
	 * @return the last name of this emp
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the modifiedby of this emp.
	 *
	 * @return the modifiedby of this emp
	 */
	@Override
	public String getModifiedby() {
		return model.getModifiedby();
	}

	/**
	 * Returns the modified date of this emp.
	 *
	 * @return the modified date of this emp
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this emp.
	 *
	 * @return the primary key of this emp
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this emp.
	 *
	 * @return the uuid of this emp
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
	 * Sets the city of this emp.
	 *
	 * @param city the city of this emp
	 */
	@Override
	public void setCity(String city) {
		model.setCity(city);
	}

	/**
	 * Sets the company ID of this emp.
	 *
	 * @param companyId the company ID of this emp
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contact no of this emp.
	 *
	 * @param contactNo the contact no of this emp
	 */
	@Override
	public void setContactNo(String contactNo) {
		model.setContactNo(contactNo);
	}

	/**
	 * Sets the create date of this emp.
	 *
	 * @param createDate the create date of this emp
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the createdby of this emp.
	 *
	 * @param createdby the createdby of this emp
	 */
	@Override
	public void setCreatedby(long createdby) {
		model.setCreatedby(createdby);
	}

	/**
	 * Sets the emp ID of this emp.
	 *
	 * @param empId the emp ID of this emp
	 */
	@Override
	public void setEmpId(long empId) {
		model.setEmpId(empId);
	}

	/**
	 * Sets the enrollment no of this emp.
	 *
	 * @param enrollmentNo the enrollment no of this emp
	 */
	@Override
	public void setEnrollmentNo(String enrollmentNo) {
		model.setEnrollmentNo(enrollmentNo);
	}

	/**
	 * Sets the first name of this emp.
	 *
	 * @param firstName the first name of this emp
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the group ID of this emp.
	 *
	 * @param groupId the group ID of this emp
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the last name of this emp.
	 *
	 * @param lastName the last name of this emp
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the modifiedby of this emp.
	 *
	 * @param modifiedby the modifiedby of this emp
	 */
	@Override
	public void setModifiedby(String modifiedby) {
		model.setModifiedby(modifiedby);
	}

	/**
	 * Sets the modified date of this emp.
	 *
	 * @param modifiedDate the modified date of this emp
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this emp.
	 *
	 * @param primaryKey the primary key of this emp
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this emp.
	 *
	 * @param uuid the uuid of this emp
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
	protected empWrapper wrap(emp emp) {
		return new empWrapper(emp);
	}

}