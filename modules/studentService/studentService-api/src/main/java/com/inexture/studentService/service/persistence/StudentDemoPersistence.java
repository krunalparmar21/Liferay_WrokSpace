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

package com.inexture.studentService.service.persistence;

import com.inexture.studentService.exception.NoSuchStudentDemoException;
import com.inexture.studentService.model.StudentDemo;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the student demo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentDemoUtil
 * @generated
 */
@ProviderType
public interface StudentDemoPersistence extends BasePersistence<StudentDemo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StudentDemoUtil} to access the student demo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the student demos where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @return the matching student demos
	 */
	public java.util.List<StudentDemo> findByfirstName(String firstName);

	/**
	 * Returns a range of all the student demos where firstName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param firstName the first name
	 * @param start the lower bound of the range of student demos
	 * @param end the upper bound of the range of student demos (not inclusive)
	 * @return the range of matching student demos
	 */
	public java.util.List<StudentDemo> findByfirstName(
		String firstName, int start, int end);

	/**
	 * Returns an ordered range of all the student demos where firstName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param firstName the first name
	 * @param start the lower bound of the range of student demos
	 * @param end the upper bound of the range of student demos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching student demos
	 */
	public java.util.List<StudentDemo> findByfirstName(
		String firstName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StudentDemo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the student demos where firstName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param firstName the first name
	 * @param start the lower bound of the range of student demos
	 * @param end the upper bound of the range of student demos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching student demos
	 */
	public java.util.List<StudentDemo> findByfirstName(
		String firstName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StudentDemo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first student demo in the ordered set where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student demo
	 * @throws NoSuchStudentDemoException if a matching student demo could not be found
	 */
	public StudentDemo findByfirstName_First(
			String firstName,
			com.liferay.portal.kernel.util.OrderByComparator<StudentDemo>
				orderByComparator)
		throws NoSuchStudentDemoException;

	/**
	 * Returns the first student demo in the ordered set where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student demo, or <code>null</code> if a matching student demo could not be found
	 */
	public StudentDemo fetchByfirstName_First(
		String firstName,
		com.liferay.portal.kernel.util.OrderByComparator<StudentDemo>
			orderByComparator);

	/**
	 * Returns the last student demo in the ordered set where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student demo
	 * @throws NoSuchStudentDemoException if a matching student demo could not be found
	 */
	public StudentDemo findByfirstName_Last(
			String firstName,
			com.liferay.portal.kernel.util.OrderByComparator<StudentDemo>
				orderByComparator)
		throws NoSuchStudentDemoException;

	/**
	 * Returns the last student demo in the ordered set where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student demo, or <code>null</code> if a matching student demo could not be found
	 */
	public StudentDemo fetchByfirstName_Last(
		String firstName,
		com.liferay.portal.kernel.util.OrderByComparator<StudentDemo>
			orderByComparator);

	/**
	 * Returns the student demos before and after the current student demo in the ordered set where firstName = &#63;.
	 *
	 * @param studentId the primary key of the current student demo
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student demo
	 * @throws NoSuchStudentDemoException if a student demo with the primary key could not be found
	 */
	public StudentDemo[] findByfirstName_PrevAndNext(
			long studentId, String firstName,
			com.liferay.portal.kernel.util.OrderByComparator<StudentDemo>
				orderByComparator)
		throws NoSuchStudentDemoException;

	/**
	 * Removes all the student demos where firstName = &#63; from the database.
	 *
	 * @param firstName the first name
	 */
	public void removeByfirstName(String firstName);

	/**
	 * Returns the number of student demos where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @return the number of matching student demos
	 */
	public int countByfirstName(String firstName);

	/**
	 * Caches the student demo in the entity cache if it is enabled.
	 *
	 * @param studentDemo the student demo
	 */
	public void cacheResult(StudentDemo studentDemo);

	/**
	 * Caches the student demos in the entity cache if it is enabled.
	 *
	 * @param studentDemos the student demos
	 */
	public void cacheResult(java.util.List<StudentDemo> studentDemos);

	/**
	 * Creates a new student demo with the primary key. Does not add the student demo to the database.
	 *
	 * @param studentId the primary key for the new student demo
	 * @return the new student demo
	 */
	public StudentDemo create(long studentId);

	/**
	 * Removes the student demo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentId the primary key of the student demo
	 * @return the student demo that was removed
	 * @throws NoSuchStudentDemoException if a student demo with the primary key could not be found
	 */
	public StudentDemo remove(long studentId) throws NoSuchStudentDemoException;

	public StudentDemo updateImpl(StudentDemo studentDemo);

	/**
	 * Returns the student demo with the primary key or throws a <code>NoSuchStudentDemoException</code> if it could not be found.
	 *
	 * @param studentId the primary key of the student demo
	 * @return the student demo
	 * @throws NoSuchStudentDemoException if a student demo with the primary key could not be found
	 */
	public StudentDemo findByPrimaryKey(long studentId)
		throws NoSuchStudentDemoException;

	/**
	 * Returns the student demo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param studentId the primary key of the student demo
	 * @return the student demo, or <code>null</code> if a student demo with the primary key could not be found
	 */
	public StudentDemo fetchByPrimaryKey(long studentId);

	/**
	 * Returns all the student demos.
	 *
	 * @return the student demos
	 */
	public java.util.List<StudentDemo> findAll();

	/**
	 * Returns a range of all the student demos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of student demos
	 * @param end the upper bound of the range of student demos (not inclusive)
	 * @return the range of student demos
	 */
	public java.util.List<StudentDemo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the student demos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of student demos
	 * @param end the upper bound of the range of student demos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of student demos
	 */
	public java.util.List<StudentDemo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StudentDemo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the student demos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of student demos
	 * @param end the upper bound of the range of student demos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of student demos
	 */
	public java.util.List<StudentDemo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StudentDemo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the student demos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of student demos.
	 *
	 * @return the number of student demos
	 */
	public int countAll();

}