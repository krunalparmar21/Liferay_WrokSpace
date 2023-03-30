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

package com.Employee.model.impl;

import com.Employee.model.emp;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing emp in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class empCacheModel implements CacheModel<emp>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof empCacheModel)) {
			return false;
		}

		empCacheModel empCacheModel = (empCacheModel)object;

		if (empId == empCacheModel.empId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, empId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", empId=");
		sb.append(empId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createdby=");
		sb.append(createdby);
		sb.append(", modifiedby=");
		sb.append(modifiedby);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", enrollmentNo=");
		sb.append(enrollmentNo);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", contactNo=");
		sb.append(contactNo);
		sb.append(", city=");
		sb.append(city);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public emp toEntityModel() {
		empImpl empImpl = new empImpl();

		if (uuid == null) {
			empImpl.setUuid("");
		}
		else {
			empImpl.setUuid(uuid);
		}

		empImpl.setEmpId(empId);
		empImpl.setGroupId(groupId);
		empImpl.setCompanyId(companyId);
		empImpl.setCreatedby(createdby);

		if (modifiedby == null) {
			empImpl.setModifiedby("");
		}
		else {
			empImpl.setModifiedby(modifiedby);
		}

		if (createDate == Long.MIN_VALUE) {
			empImpl.setCreateDate(null);
		}
		else {
			empImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			empImpl.setModifiedDate(null);
		}
		else {
			empImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (enrollmentNo == null) {
			empImpl.setEnrollmentNo("");
		}
		else {
			empImpl.setEnrollmentNo(enrollmentNo);
		}

		if (firstName == null) {
			empImpl.setFirstName("");
		}
		else {
			empImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			empImpl.setLastName("");
		}
		else {
			empImpl.setLastName(lastName);
		}

		if (contactNo == null) {
			empImpl.setContactNo("");
		}
		else {
			empImpl.setContactNo(contactNo);
		}

		if (city == null) {
			empImpl.setCity("");
		}
		else {
			empImpl.setCity(city);
		}

		empImpl.resetOriginalValues();

		return empImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		empId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		createdby = objectInput.readLong();
		modifiedby = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		enrollmentNo = objectInput.readUTF();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		contactNo = objectInput.readUTF();
		city = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(empId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(createdby);

		if (modifiedby == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(modifiedby);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (enrollmentNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(enrollmentNo);
		}

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (contactNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactNo);
		}

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}
	}

	public String uuid;
	public long empId;
	public long groupId;
	public long companyId;
	public long createdby;
	public String modifiedby;
	public long createDate;
	public long modifiedDate;
	public String enrollmentNo;
	public String firstName;
	public String lastName;
	public String contactNo;
	public String city;

}