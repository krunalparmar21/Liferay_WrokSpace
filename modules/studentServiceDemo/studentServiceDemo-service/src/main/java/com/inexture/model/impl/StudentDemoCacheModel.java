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

package com.inexture.model.impl;

import com.inexture.model.StudentDemo;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing StudentDemo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StudentDemoCacheModel
	implements CacheModel<StudentDemo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof StudentDemoCacheModel)) {
			return false;
		}

		StudentDemoCacheModel studentDemoCacheModel =
			(StudentDemoCacheModel)object;

		if (studentId == studentDemoCacheModel.studentId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, studentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", studentId=");
		sb.append(studentId);
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
	public StudentDemo toEntityModel() {
		StudentDemoImpl studentDemoImpl = new StudentDemoImpl();

		if (uuid == null) {
			studentDemoImpl.setUuid("");
		}
		else {
			studentDemoImpl.setUuid(uuid);
		}

		studentDemoImpl.setStudentId(studentId);
		studentDemoImpl.setGroupId(groupId);
		studentDemoImpl.setCompanyId(companyId);
		studentDemoImpl.setCreatedby(createdby);

		if (modifiedby == null) {
			studentDemoImpl.setModifiedby("");
		}
		else {
			studentDemoImpl.setModifiedby(modifiedby);
		}

		if (createDate == Long.MIN_VALUE) {
			studentDemoImpl.setCreateDate(null);
		}
		else {
			studentDemoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			studentDemoImpl.setModifiedDate(null);
		}
		else {
			studentDemoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (enrollmentNo == null) {
			studentDemoImpl.setEnrollmentNo("");
		}
		else {
			studentDemoImpl.setEnrollmentNo(enrollmentNo);
		}

		if (firstName == null) {
			studentDemoImpl.setFirstName("");
		}
		else {
			studentDemoImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			studentDemoImpl.setLastName("");
		}
		else {
			studentDemoImpl.setLastName(lastName);
		}

		if (contactNo == null) {
			studentDemoImpl.setContactNo("");
		}
		else {
			studentDemoImpl.setContactNo(contactNo);
		}

		if (city == null) {
			studentDemoImpl.setCity("");
		}
		else {
			studentDemoImpl.setCity(city);
		}

		studentDemoImpl.resetOriginalValues();

		return studentDemoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		studentId = objectInput.readLong();

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

		objectOutput.writeLong(studentId);

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
	public long studentId;
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