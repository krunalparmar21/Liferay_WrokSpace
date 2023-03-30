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

package com.Employee.service.persistence;

import com.Employee.model.emp;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the emp service. This utility wraps <code>com.Employee.service.persistence.impl.empPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see empPersistence
 * @generated
 */
public class empUtil {

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
	public static void clearCache(emp emp) {
		getPersistence().clearCache(emp);
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
	public static Map<Serializable, emp> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<emp> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<emp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<emp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<emp> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static emp update(emp emp) {
		return getPersistence().update(emp);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static emp update(emp emp, ServiceContext serviceContext) {
		return getPersistence().update(emp, serviceContext);
	}

	/**
	 * Returns all the emps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching emps
	 */
	public static List<emp> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the emps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>empModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @return the range of matching emps
	 */
	public static List<emp> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the emps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>empModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching emps
	 */
	public static List<emp> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<emp> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the emps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>empModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching emps
	 */
	public static List<emp> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<emp> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first emp in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emp
	 * @throws NoSuchempException if a matching emp could not be found
	 */
	public static emp findByUuid_First(
			String uuid, OrderByComparator<emp> orderByComparator)
		throws com.Employee.exception.NoSuchempException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first emp in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emp, or <code>null</code> if a matching emp could not be found
	 */
	public static emp fetchByUuid_First(
		String uuid, OrderByComparator<emp> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last emp in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emp
	 * @throws NoSuchempException if a matching emp could not be found
	 */
	public static emp findByUuid_Last(
			String uuid, OrderByComparator<emp> orderByComparator)
		throws com.Employee.exception.NoSuchempException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last emp in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emp, or <code>null</code> if a matching emp could not be found
	 */
	public static emp fetchByUuid_Last(
		String uuid, OrderByComparator<emp> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the emps before and after the current emp in the ordered set where uuid = &#63;.
	 *
	 * @param empId the primary key of the current emp
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next emp
	 * @throws NoSuchempException if a emp with the primary key could not be found
	 */
	public static emp[] findByUuid_PrevAndNext(
			long empId, String uuid, OrderByComparator<emp> orderByComparator)
		throws com.Employee.exception.NoSuchempException {

		return getPersistence().findByUuid_PrevAndNext(
			empId, uuid, orderByComparator);
	}

	/**
	 * Removes all the emps where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of emps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching emps
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the emp where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchempException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching emp
	 * @throws NoSuchempException if a matching emp could not be found
	 */
	public static emp findByUUID_G(String uuid, long groupId)
		throws com.Employee.exception.NoSuchempException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the emp where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching emp, or <code>null</code> if a matching emp could not be found
	 */
	public static emp fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the emp where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching emp, or <code>null</code> if a matching emp could not be found
	 */
	public static emp fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the emp where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the emp that was removed
	 */
	public static emp removeByUUID_G(String uuid, long groupId)
		throws com.Employee.exception.NoSuchempException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of emps where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching emps
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the emps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching emps
	 */
	public static List<emp> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the emps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>empModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @return the range of matching emps
	 */
	public static List<emp> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the emps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>empModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching emps
	 */
	public static List<emp> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<emp> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the emps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>empModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching emps
	 */
	public static List<emp> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<emp> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first emp in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emp
	 * @throws NoSuchempException if a matching emp could not be found
	 */
	public static emp findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<emp> orderByComparator)
		throws com.Employee.exception.NoSuchempException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first emp in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emp, or <code>null</code> if a matching emp could not be found
	 */
	public static emp fetchByUuid_C_First(
		String uuid, long companyId, OrderByComparator<emp> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last emp in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emp
	 * @throws NoSuchempException if a matching emp could not be found
	 */
	public static emp findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<emp> orderByComparator)
		throws com.Employee.exception.NoSuchempException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last emp in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emp, or <code>null</code> if a matching emp could not be found
	 */
	public static emp fetchByUuid_C_Last(
		String uuid, long companyId, OrderByComparator<emp> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the emps before and after the current emp in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param empId the primary key of the current emp
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next emp
	 * @throws NoSuchempException if a emp with the primary key could not be found
	 */
	public static emp[] findByUuid_C_PrevAndNext(
			long empId, String uuid, long companyId,
			OrderByComparator<emp> orderByComparator)
		throws com.Employee.exception.NoSuchempException {

		return getPersistence().findByUuid_C_PrevAndNext(
			empId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the emps where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of emps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching emps
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the emps where city = &#63;.
	 *
	 * @param city the city
	 * @return the matching emps
	 */
	public static List<emp> findByCity(String city) {
		return getPersistence().findByCity(city);
	}

	/**
	 * Returns a range of all the emps where city = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>empModelImpl</code>.
	 * </p>
	 *
	 * @param city the city
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @return the range of matching emps
	 */
	public static List<emp> findByCity(String city, int start, int end) {
		return getPersistence().findByCity(city, start, end);
	}

	/**
	 * Returns an ordered range of all the emps where city = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>empModelImpl</code>.
	 * </p>
	 *
	 * @param city the city
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching emps
	 */
	public static List<emp> findByCity(
		String city, int start, int end,
		OrderByComparator<emp> orderByComparator) {

		return getPersistence().findByCity(city, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the emps where city = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>empModelImpl</code>.
	 * </p>
	 *
	 * @param city the city
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching emps
	 */
	public static List<emp> findByCity(
		String city, int start, int end,
		OrderByComparator<emp> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByCity(
			city, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first emp in the ordered set where city = &#63;.
	 *
	 * @param city the city
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emp
	 * @throws NoSuchempException if a matching emp could not be found
	 */
	public static emp findByCity_First(
			String city, OrderByComparator<emp> orderByComparator)
		throws com.Employee.exception.NoSuchempException {

		return getPersistence().findByCity_First(city, orderByComparator);
	}

	/**
	 * Returns the first emp in the ordered set where city = &#63;.
	 *
	 * @param city the city
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emp, or <code>null</code> if a matching emp could not be found
	 */
	public static emp fetchByCity_First(
		String city, OrderByComparator<emp> orderByComparator) {

		return getPersistence().fetchByCity_First(city, orderByComparator);
	}

	/**
	 * Returns the last emp in the ordered set where city = &#63;.
	 *
	 * @param city the city
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emp
	 * @throws NoSuchempException if a matching emp could not be found
	 */
	public static emp findByCity_Last(
			String city, OrderByComparator<emp> orderByComparator)
		throws com.Employee.exception.NoSuchempException {

		return getPersistence().findByCity_Last(city, orderByComparator);
	}

	/**
	 * Returns the last emp in the ordered set where city = &#63;.
	 *
	 * @param city the city
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emp, or <code>null</code> if a matching emp could not be found
	 */
	public static emp fetchByCity_Last(
		String city, OrderByComparator<emp> orderByComparator) {

		return getPersistence().fetchByCity_Last(city, orderByComparator);
	}

	/**
	 * Returns the emps before and after the current emp in the ordered set where city = &#63;.
	 *
	 * @param empId the primary key of the current emp
	 * @param city the city
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next emp
	 * @throws NoSuchempException if a emp with the primary key could not be found
	 */
	public static emp[] findByCity_PrevAndNext(
			long empId, String city, OrderByComparator<emp> orderByComparator)
		throws com.Employee.exception.NoSuchempException {

		return getPersistence().findByCity_PrevAndNext(
			empId, city, orderByComparator);
	}

	/**
	 * Removes all the emps where city = &#63; from the database.
	 *
	 * @param city the city
	 */
	public static void removeByCity(String city) {
		getPersistence().removeByCity(city);
	}

	/**
	 * Returns the number of emps where city = &#63;.
	 *
	 * @param city the city
	 * @return the number of matching emps
	 */
	public static int countByCity(String city) {
		return getPersistence().countByCity(city);
	}

	/**
	 * Caches the emp in the entity cache if it is enabled.
	 *
	 * @param emp the emp
	 */
	public static void cacheResult(emp emp) {
		getPersistence().cacheResult(emp);
	}

	/**
	 * Caches the emps in the entity cache if it is enabled.
	 *
	 * @param emps the emps
	 */
	public static void cacheResult(List<emp> emps) {
		getPersistence().cacheResult(emps);
	}

	/**
	 * Creates a new emp with the primary key. Does not add the emp to the database.
	 *
	 * @param empId the primary key for the new emp
	 * @return the new emp
	 */
	public static emp create(long empId) {
		return getPersistence().create(empId);
	}

	/**
	 * Removes the emp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param empId the primary key of the emp
	 * @return the emp that was removed
	 * @throws NoSuchempException if a emp with the primary key could not be found
	 */
	public static emp remove(long empId)
		throws com.Employee.exception.NoSuchempException {

		return getPersistence().remove(empId);
	}

	public static emp updateImpl(emp emp) {
		return getPersistence().updateImpl(emp);
	}

	/**
	 * Returns the emp with the primary key or throws a <code>NoSuchempException</code> if it could not be found.
	 *
	 * @param empId the primary key of the emp
	 * @return the emp
	 * @throws NoSuchempException if a emp with the primary key could not be found
	 */
	public static emp findByPrimaryKey(long empId)
		throws com.Employee.exception.NoSuchempException {

		return getPersistence().findByPrimaryKey(empId);
	}

	/**
	 * Returns the emp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param empId the primary key of the emp
	 * @return the emp, or <code>null</code> if a emp with the primary key could not be found
	 */
	public static emp fetchByPrimaryKey(long empId) {
		return getPersistence().fetchByPrimaryKey(empId);
	}

	/**
	 * Returns all the emps.
	 *
	 * @return the emps
	 */
	public static List<emp> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the emps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>empModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @return the range of emps
	 */
	public static List<emp> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the emps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>empModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of emps
	 */
	public static List<emp> findAll(
		int start, int end, OrderByComparator<emp> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the emps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>empModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of emps
	 */
	public static List<emp> findAll(
		int start, int end, OrderByComparator<emp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the emps from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of emps.
	 *
	 * @return the number of emps
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static empPersistence getPersistence() {
		return _persistence;
	}

	private static volatile empPersistence _persistence;

}