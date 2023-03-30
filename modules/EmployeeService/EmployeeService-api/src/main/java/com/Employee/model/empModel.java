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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the emp service. Represents a row in the &quot;DemoEmployee_emp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.Employee.model.impl.empModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.Employee.model.impl.empImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see emp
 * @generated
 */
@ProviderType
public interface empModel extends BaseModel<emp>, ShardedModel, StagedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a emp model instance should use the {@link emp} interface instead.
	 */

	/**
	 * Returns the primary key of this emp.
	 *
	 * @return the primary key of this emp
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this emp.
	 *
	 * @param primaryKey the primary key of this emp
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this emp.
	 *
	 * @return the uuid of this emp
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this emp.
	 *
	 * @param uuid the uuid of this emp
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the emp ID of this emp.
	 *
	 * @return the emp ID of this emp
	 */
	public long getEmpId();

	/**
	 * Sets the emp ID of this emp.
	 *
	 * @param empId the emp ID of this emp
	 */
	public void setEmpId(long empId);

	/**
	 * Returns the group ID of this emp.
	 *
	 * @return the group ID of this emp
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this emp.
	 *
	 * @param groupId the group ID of this emp
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this emp.
	 *
	 * @return the company ID of this emp
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this emp.
	 *
	 * @param companyId the company ID of this emp
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the createdby of this emp.
	 *
	 * @return the createdby of this emp
	 */
	public long getCreatedby();

	/**
	 * Sets the createdby of this emp.
	 *
	 * @param createdby the createdby of this emp
	 */
	public void setCreatedby(long createdby);

	/**
	 * Returns the modifiedby of this emp.
	 *
	 * @return the modifiedby of this emp
	 */
	@AutoEscape
	public String getModifiedby();

	/**
	 * Sets the modifiedby of this emp.
	 *
	 * @param modifiedby the modifiedby of this emp
	 */
	public void setModifiedby(String modifiedby);

	/**
	 * Returns the create date of this emp.
	 *
	 * @return the create date of this emp
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this emp.
	 *
	 * @param createDate the create date of this emp
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this emp.
	 *
	 * @return the modified date of this emp
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this emp.
	 *
	 * @param modifiedDate the modified date of this emp
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the enrollment no of this emp.
	 *
	 * @return the enrollment no of this emp
	 */
	@AutoEscape
	public String getEnrollmentNo();

	/**
	 * Sets the enrollment no of this emp.
	 *
	 * @param enrollmentNo the enrollment no of this emp
	 */
	public void setEnrollmentNo(String enrollmentNo);

	/**
	 * Returns the first name of this emp.
	 *
	 * @return the first name of this emp
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this emp.
	 *
	 * @param firstName the first name of this emp
	 */
	public void setFirstName(String firstName);

	/**
	 * Returns the last name of this emp.
	 *
	 * @return the last name of this emp
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this emp.
	 *
	 * @param lastName the last name of this emp
	 */
	public void setLastName(String lastName);

	/**
	 * Returns the contact no of this emp.
	 *
	 * @return the contact no of this emp
	 */
	@AutoEscape
	public String getContactNo();

	/**
	 * Sets the contact no of this emp.
	 *
	 * @param contactNo the contact no of this emp
	 */
	public void setContactNo(String contactNo);

	/**
	 * Returns the city of this emp.
	 *
	 * @return the city of this emp
	 */
	@AutoEscape
	public String getCity();

	/**
	 * Sets the city of this emp.
	 *
	 * @param city the city of this emp
	 */
	public void setCity(String city);

	@Override
	public emp cloneWithOriginalValues();

}