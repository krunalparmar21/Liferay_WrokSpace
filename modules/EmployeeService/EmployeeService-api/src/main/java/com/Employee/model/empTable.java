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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;DemoEmployee_emp&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see emp
 * @generated
 */
public class empTable extends BaseTable<empTable> {

	public static final empTable INSTANCE = new empTable();

	public final Column<empTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<empTable, Long> empId = createColumn(
		"empId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<empTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<empTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<empTable, Long> createdby = createColumn(
		"createdby", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<empTable, String> modifiedby = createColumn(
		"modifiedby", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<empTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<empTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<empTable, String> enrollmentNo = createColumn(
		"enrollmentNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<empTable, String> firstName = createColumn(
		"firstName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<empTable, String> lastName = createColumn(
		"lastName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<empTable, String> contactNo = createColumn(
		"contactNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<empTable, String> city = createColumn(
		"city", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private empTable() {
		super("DemoEmployee_emp", empTable::new);
	}

}