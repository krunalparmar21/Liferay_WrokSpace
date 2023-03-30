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

package com.inexture.service;

import com.inexture.model.StudentDemo;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for StudentDemo. This utility wraps
 * <code>com.inexture.service.impl.StudentDemoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see StudentDemoLocalService
 * @generated
 */
public class StudentDemoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.inexture.service.impl.StudentDemoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the student demo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StudentDemoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param studentDemo the student demo
	 * @return the student demo that was added
	 */
	public static StudentDemo addStudentDemo(StudentDemo studentDemo) {
		return getService().addStudentDemo(studentDemo);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new student demo with the primary key. Does not add the student demo to the database.
	 *
	 * @param studentId the primary key for the new student demo
	 * @return the new student demo
	 */
	public static StudentDemo createStudentDemo(long studentId) {
		return getService().createStudentDemo(studentId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the student demo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StudentDemoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param studentId the primary key of the student demo
	 * @return the student demo that was removed
	 * @throws PortalException if a student demo with the primary key could not be found
	 */
	public static StudentDemo deleteStudentDemo(long studentId)
		throws PortalException {

		return getService().deleteStudentDemo(studentId);
	}

	/**
	 * Deletes the student demo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StudentDemoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param studentDemo the student demo
	 * @return the student demo that was removed
	 */
	public static StudentDemo deleteStudentDemo(StudentDemo studentDemo) {
		return getService().deleteStudentDemo(studentDemo);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.inexture.model.impl.StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.inexture.model.impl.StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static StudentDemo fetchStudentDemo(long studentId) {
		return getService().fetchStudentDemo(studentId);
	}

	/**
	 * Returns the student demo matching the UUID and group.
	 *
	 * @param uuid the student demo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching student demo, or <code>null</code> if a matching student demo could not be found
	 */
	public static StudentDemo fetchStudentDemoByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchStudentDemoByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the student demo with the primary key.
	 *
	 * @param studentId the primary key of the student demo
	 * @return the student demo
	 * @throws PortalException if a student demo with the primary key could not be found
	 */
	public static StudentDemo getStudentDemo(long studentId)
		throws PortalException {

		return getService().getStudentDemo(studentId);
	}

	/**
	 * Returns the student demo matching the UUID and group.
	 *
	 * @param uuid the student demo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching student demo
	 * @throws PortalException if a matching student demo could not be found
	 */
	public static StudentDemo getStudentDemoByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getStudentDemoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the student demos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.inexture.model.impl.StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of student demos
	 * @param end the upper bound of the range of student demos (not inclusive)
	 * @return the range of student demos
	 */
	public static List<StudentDemo> getStudentDemos(int start, int end) {
		return getService().getStudentDemos(start, end);
	}

	/**
	 * Returns all the student demos matching the UUID and company.
	 *
	 * @param uuid the UUID of the student demos
	 * @param companyId the primary key of the company
	 * @return the matching student demos, or an empty list if no matches were found
	 */
	public static List<StudentDemo> getStudentDemosByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getStudentDemosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of student demos matching the UUID and company.
	 *
	 * @param uuid the UUID of the student demos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of student demos
	 * @param end the upper bound of the range of student demos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching student demos, or an empty list if no matches were found
	 */
	public static List<StudentDemo> getStudentDemosByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<StudentDemo> orderByComparator) {

		return getService().getStudentDemosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of student demos.
	 *
	 * @return the number of student demos
	 */
	public static int getStudentDemosCount() {
		return getService().getStudentDemosCount();
	}

	/**
	 * Updates the student demo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StudentDemoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param studentDemo the student demo
	 * @return the student demo that was updated
	 */
	public static StudentDemo updateStudentDemo(StudentDemo studentDemo) {
		return getService().updateStudentDemo(studentDemo);
	}

	public static StudentDemoLocalService getService() {
		return _service;
	}

	private static volatile StudentDemoLocalService _service;

}