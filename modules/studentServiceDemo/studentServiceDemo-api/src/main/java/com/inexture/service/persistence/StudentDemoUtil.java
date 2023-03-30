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

package com.inexture.service.persistence;

import com.inexture.model.StudentDemo;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the student demo service. This utility wraps <code>com.inexture.service.persistence.impl.StudentDemoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentDemoPersistence
 * @generated
 */
public class StudentDemoUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(StudentDemo studentDemo) {
		getPersistence().clearCache(studentDemo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, StudentDemo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<StudentDemo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<StudentDemo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<StudentDemo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<StudentDemo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static StudentDemo update(StudentDemo studentDemo) {
		return getPersistence().update(studentDemo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static StudentDemo update(
		StudentDemo studentDemo, ServiceContext serviceContext) {

		return getPersistence().update(studentDemo, serviceContext);
	}

	/**
	 * Returns all the student demos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching student demos
	 */
	public static List<StudentDemo> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the student demos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of student demos
	 * @param end the upper bound of the range of student demos (not inclusive)
	 * @return the range of matching student demos
	 */
	public static List<StudentDemo> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the student demos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of student demos
	 * @param end the upper bound of the range of student demos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching student demos
	 */
	public static List<StudentDemo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<StudentDemo> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the student demos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of student demos
	 * @param end the upper bound of the range of student demos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching student demos
	 */
	public static List<StudentDemo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<StudentDemo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first student demo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student demo
	 * @throws NoSuchStudentDemoException if a matching student demo could not be found
	 */
	public static StudentDemo findByUuid_First(
			String uuid, OrderByComparator<StudentDemo> orderByComparator)
		throws com.inexture.exception.NoSuchStudentDemoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first student demo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student demo, or <code>null</code> if a matching student demo could not be found
	 */
	public static StudentDemo fetchByUuid_First(
		String uuid, OrderByComparator<StudentDemo> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last student demo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student demo
	 * @throws NoSuchStudentDemoException if a matching student demo could not be found
	 */
	public static StudentDemo findByUuid_Last(
			String uuid, OrderByComparator<StudentDemo> orderByComparator)
		throws com.inexture.exception.NoSuchStudentDemoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last student demo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student demo, or <code>null</code> if a matching student demo could not be found
	 */
	public static StudentDemo fetchByUuid_Last(
		String uuid, OrderByComparator<StudentDemo> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the student demos before and after the current student demo in the ordered set where uuid = &#63;.
	 *
	 * @param studentId the primary key of the current student demo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student demo
	 * @throws NoSuchStudentDemoException if a student demo with the primary key could not be found
	 */
	public static StudentDemo[] findByUuid_PrevAndNext(
			long studentId, String uuid,
			OrderByComparator<StudentDemo> orderByComparator)
		throws com.inexture.exception.NoSuchStudentDemoException {

		return getPersistence().findByUuid_PrevAndNext(
			studentId, uuid, orderByComparator);
	}

	/**
	 * Removes all the student demos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of student demos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching student demos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the student demo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchStudentDemoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching student demo
	 * @throws NoSuchStudentDemoException if a matching student demo could not be found
	 */
	public static StudentDemo findByUUID_G(String uuid, long groupId)
		throws com.inexture.exception.NoSuchStudentDemoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the student demo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching student demo, or <code>null</code> if a matching student demo could not be found
	 */
	public static StudentDemo fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the student demo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching student demo, or <code>null</code> if a matching student demo could not be found
	 */
	public static StudentDemo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the student demo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the student demo that was removed
	 */
	public static StudentDemo removeByUUID_G(String uuid, long groupId)
		throws com.inexture.exception.NoSuchStudentDemoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of student demos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching student demos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the student demos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching student demos
	 */
	public static List<StudentDemo> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the student demos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of student demos
	 * @param end the upper bound of the range of student demos (not inclusive)
	 * @return the range of matching student demos
	 */
	public static List<StudentDemo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the student demos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of student demos
	 * @param end the upper bound of the range of student demos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching student demos
	 */
	public static List<StudentDemo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<StudentDemo> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the student demos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of student demos
	 * @param end the upper bound of the range of student demos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching student demos
	 */
	public static List<StudentDemo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<StudentDemo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first student demo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student demo
	 * @throws NoSuchStudentDemoException if a matching student demo could not be found
	 */
	public static StudentDemo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<StudentDemo> orderByComparator)
		throws com.inexture.exception.NoSuchStudentDemoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first student demo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student demo, or <code>null</code> if a matching student demo could not be found
	 */
	public static StudentDemo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<StudentDemo> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last student demo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student demo
	 * @throws NoSuchStudentDemoException if a matching student demo could not be found
	 */
	public static StudentDemo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<StudentDemo> orderByComparator)
		throws com.inexture.exception.NoSuchStudentDemoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last student demo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student demo, or <code>null</code> if a matching student demo could not be found
	 */
	public static StudentDemo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<StudentDemo> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the student demos before and after the current student demo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param studentId the primary key of the current student demo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student demo
	 * @throws NoSuchStudentDemoException if a student demo with the primary key could not be found
	 */
	public static StudentDemo[] findByUuid_C_PrevAndNext(
			long studentId, String uuid, long companyId,
			OrderByComparator<StudentDemo> orderByComparator)
		throws com.inexture.exception.NoSuchStudentDemoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			studentId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the student demos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of student demos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching student demos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the student demos where city = &#63;.
	 *
	 * @param city the city
	 * @return the matching student demos
	 */
	public static List<StudentDemo> findByCity(String city) {
		return getPersistence().findByCity(city);
	}

	/**
	 * Returns a range of all the student demos where city = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param city the city
	 * @param start the lower bound of the range of student demos
	 * @param end the upper bound of the range of student demos (not inclusive)
	 * @return the range of matching student demos
	 */
	public static List<StudentDemo> findByCity(
		String city, int start, int end) {

		return getPersistence().findByCity(city, start, end);
	}

	/**
	 * Returns an ordered range of all the student demos where city = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param city the city
	 * @param start the lower bound of the range of student demos
	 * @param end the upper bound of the range of student demos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching student demos
	 */
	public static List<StudentDemo> findByCity(
		String city, int start, int end,
		OrderByComparator<StudentDemo> orderByComparator) {

		return getPersistence().findByCity(city, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the student demos where city = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param city the city
	 * @param start the lower bound of the range of student demos
	 * @param end the upper bound of the range of student demos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching student demos
	 */
	public static List<StudentDemo> findByCity(
		String city, int start, int end,
		OrderByComparator<StudentDemo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCity(
			city, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first student demo in the ordered set where city = &#63;.
	 *
	 * @param city the city
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student demo
	 * @throws NoSuchStudentDemoException if a matching student demo could not be found
	 */
	public static StudentDemo findByCity_First(
			String city, OrderByComparator<StudentDemo> orderByComparator)
		throws com.inexture.exception.NoSuchStudentDemoException {

		return getPersistence().findByCity_First(city, orderByComparator);
	}

	/**
	 * Returns the first student demo in the ordered set where city = &#63;.
	 *
	 * @param city the city
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student demo, or <code>null</code> if a matching student demo could not be found
	 */
	public static StudentDemo fetchByCity_First(
		String city, OrderByComparator<StudentDemo> orderByComparator) {

		return getPersistence().fetchByCity_First(city, orderByComparator);
	}

	/**
	 * Returns the last student demo in the ordered set where city = &#63;.
	 *
	 * @param city the city
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student demo
	 * @throws NoSuchStudentDemoException if a matching student demo could not be found
	 */
	public static StudentDemo findByCity_Last(
			String city, OrderByComparator<StudentDemo> orderByComparator)
		throws com.inexture.exception.NoSuchStudentDemoException {

		return getPersistence().findByCity_Last(city, orderByComparator);
	}

	/**
	 * Returns the last student demo in the ordered set where city = &#63;.
	 *
	 * @param city the city
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student demo, or <code>null</code> if a matching student demo could not be found
	 */
	public static StudentDemo fetchByCity_Last(
		String city, OrderByComparator<StudentDemo> orderByComparator) {

		return getPersistence().fetchByCity_Last(city, orderByComparator);
	}

	/**
	 * Returns the student demos before and after the current student demo in the ordered set where city = &#63;.
	 *
	 * @param studentId the primary key of the current student demo
	 * @param city the city
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student demo
	 * @throws NoSuchStudentDemoException if a student demo with the primary key could not be found
	 */
	public static StudentDemo[] findByCity_PrevAndNext(
			long studentId, String city,
			OrderByComparator<StudentDemo> orderByComparator)
		throws com.inexture.exception.NoSuchStudentDemoException {

		return getPersistence().findByCity_PrevAndNext(
			studentId, city, orderByComparator);
	}

	/**
	 * Removes all the student demos where city = &#63; from the database.
	 *
	 * @param city the city
	 */
	public static void removeByCity(String city) {
		getPersistence().removeByCity(city);
	}

	/**
	 * Returns the number of student demos where city = &#63;.
	 *
	 * @param city the city
	 * @return the number of matching student demos
	 */
	public static int countByCity(String city) {
		return getPersistence().countByCity(city);
	}

	/**
	 * Returns all the student demos where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @return the matching student demos
	 */
	public static List<StudentDemo> findByfirstName(String firstName) {
		return getPersistence().findByfirstName(firstName);
	}

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
	public static List<StudentDemo> findByfirstName(
		String firstName, int start, int end) {

		return getPersistence().findByfirstName(firstName, start, end);
	}

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
	public static List<StudentDemo> findByfirstName(
		String firstName, int start, int end,
		OrderByComparator<StudentDemo> orderByComparator) {

		return getPersistence().findByfirstName(
			firstName, start, end, orderByComparator);
	}

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
	public static List<StudentDemo> findByfirstName(
		String firstName, int start, int end,
		OrderByComparator<StudentDemo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByfirstName(
			firstName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first student demo in the ordered set where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student demo
	 * @throws NoSuchStudentDemoException if a matching student demo could not be found
	 */
	public static StudentDemo findByfirstName_First(
			String firstName, OrderByComparator<StudentDemo> orderByComparator)
		throws com.inexture.exception.NoSuchStudentDemoException {

		return getPersistence().findByfirstName_First(
			firstName, orderByComparator);
	}

	/**
	 * Returns the first student demo in the ordered set where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student demo, or <code>null</code> if a matching student demo could not be found
	 */
	public static StudentDemo fetchByfirstName_First(
		String firstName, OrderByComparator<StudentDemo> orderByComparator) {

		return getPersistence().fetchByfirstName_First(
			firstName, orderByComparator);
	}

	/**
	 * Returns the last student demo in the ordered set where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student demo
	 * @throws NoSuchStudentDemoException if a matching student demo could not be found
	 */
	public static StudentDemo findByfirstName_Last(
			String firstName, OrderByComparator<StudentDemo> orderByComparator)
		throws com.inexture.exception.NoSuchStudentDemoException {

		return getPersistence().findByfirstName_Last(
			firstName, orderByComparator);
	}

	/**
	 * Returns the last student demo in the ordered set where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student demo, or <code>null</code> if a matching student demo could not be found
	 */
	public static StudentDemo fetchByfirstName_Last(
		String firstName, OrderByComparator<StudentDemo> orderByComparator) {

		return getPersistence().fetchByfirstName_Last(
			firstName, orderByComparator);
	}

	/**
	 * Returns the student demos before and after the current student demo in the ordered set where firstName = &#63;.
	 *
	 * @param studentId the primary key of the current student demo
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student demo
	 * @throws NoSuchStudentDemoException if a student demo with the primary key could not be found
	 */
	public static StudentDemo[] findByfirstName_PrevAndNext(
			long studentId, String firstName,
			OrderByComparator<StudentDemo> orderByComparator)
		throws com.inexture.exception.NoSuchStudentDemoException {

		return getPersistence().findByfirstName_PrevAndNext(
			studentId, firstName, orderByComparator);
	}

	/**
	 * Removes all the student demos where firstName = &#63; from the database.
	 *
	 * @param firstName the first name
	 */
	public static void removeByfirstName(String firstName) {
		getPersistence().removeByfirstName(firstName);
	}

	/**
	 * Returns the number of student demos where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @return the number of matching student demos
	 */
	public static int countByfirstName(String firstName) {
		return getPersistence().countByfirstName(firstName);
	}

	/**
	 * Caches the student demo in the entity cache if it is enabled.
	 *
	 * @param studentDemo the student demo
	 */
	public static void cacheResult(StudentDemo studentDemo) {
		getPersistence().cacheResult(studentDemo);
	}

	/**
	 * Caches the student demos in the entity cache if it is enabled.
	 *
	 * @param studentDemos the student demos
	 */
	public static void cacheResult(List<StudentDemo> studentDemos) {
		getPersistence().cacheResult(studentDemos);
	}

	/**
	 * Creates a new student demo with the primary key. Does not add the student demo to the database.
	 *
	 * @param studentId the primary key for the new student demo
	 * @return the new student demo
	 */
	public static StudentDemo create(long studentId) {
		return getPersistence().create(studentId);
	}

	/**
	 * Removes the student demo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentId the primary key of the student demo
	 * @return the student demo that was removed
	 * @throws NoSuchStudentDemoException if a student demo with the primary key could not be found
	 */
	public static StudentDemo remove(long studentId)
		throws com.inexture.exception.NoSuchStudentDemoException {

		return getPersistence().remove(studentId);
	}

	public static StudentDemo updateImpl(StudentDemo studentDemo) {
		return getPersistence().updateImpl(studentDemo);
	}

	/**
	 * Returns the student demo with the primary key or throws a <code>NoSuchStudentDemoException</code> if it could not be found.
	 *
	 * @param studentId the primary key of the student demo
	 * @return the student demo
	 * @throws NoSuchStudentDemoException if a student demo with the primary key could not be found
	 */
	public static StudentDemo findByPrimaryKey(long studentId)
		throws com.inexture.exception.NoSuchStudentDemoException {

		return getPersistence().findByPrimaryKey(studentId);
	}

	/**
	 * Returns the student demo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param studentId the primary key of the student demo
	 * @return the student demo, or <code>null</code> if a student demo with the primary key could not be found
	 */
	public static StudentDemo fetchByPrimaryKey(long studentId) {
		return getPersistence().fetchByPrimaryKey(studentId);
	}

	/**
	 * Returns all the student demos.
	 *
	 * @return the student demos
	 */
	public static List<StudentDemo> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<StudentDemo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<StudentDemo> findAll(
		int start, int end, OrderByComparator<StudentDemo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<StudentDemo> findAll(
		int start, int end, OrderByComparator<StudentDemo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the student demos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of student demos.
	 *
	 * @return the number of student demos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static StudentDemoPersistence getPersistence() {
		return _persistence;
	}

	private static volatile StudentDemoPersistence _persistence;

}