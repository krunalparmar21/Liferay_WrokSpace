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

package com.inexture.studentService.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;stud_StudentDemo&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see StudentDemo
 * @generated
 */
public class StudentDemoTable extends BaseTable<StudentDemoTable> {

	public static final StudentDemoTable INSTANCE = new StudentDemoTable();

	public final Column<StudentDemoTable, Long> studentId = createColumn(
		"studentId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<StudentDemoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<StudentDemoTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<StudentDemoTable, Long> createdby = createColumn(
		"createdby", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<StudentDemoTable, String> modifiedby = createColumn(
		"modifiedby", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StudentDemoTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<StudentDemoTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<StudentDemoTable, String> enrollmentNo = createColumn(
		"enrollmentNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StudentDemoTable, String> firstName = createColumn(
		"firstName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StudentDemoTable, String> lastName = createColumn(
		"lastName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StudentDemoTable, String> contactNo = createColumn(
		"contactNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StudentDemoTable, String> city = createColumn(
		"city", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private StudentDemoTable() {
		super("stud_StudentDemo", StudentDemoTable::new);
	}

}