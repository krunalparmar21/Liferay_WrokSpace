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

package com.inexture.studentService.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StudentDemoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see StudentDemoLocalService
 * @generated
 */
public class StudentDemoLocalServiceWrapper
	implements ServiceWrapper<StudentDemoLocalService>,
			   StudentDemoLocalService {

	public StudentDemoLocalServiceWrapper() {
		this(null);
	}

	public StudentDemoLocalServiceWrapper(
		StudentDemoLocalService studentDemoLocalService) {

		_studentDemoLocalService = studentDemoLocalService;
	}

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
	@Override
	public com.inexture.studentService.model.StudentDemo addStudentDemo(
		com.inexture.studentService.model.StudentDemo studentDemo) {

		return _studentDemoLocalService.addStudentDemo(studentDemo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentDemoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new student demo with the primary key. Does not add the student demo to the database.
	 *
	 * @param studentId the primary key for the new student demo
	 * @return the new student demo
	 */
	@Override
	public com.inexture.studentService.model.StudentDemo createStudentDemo(
		long studentId) {

		return _studentDemoLocalService.createStudentDemo(studentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentDemoLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public com.inexture.studentService.model.StudentDemo deleteStudentDemo(
			long studentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentDemoLocalService.deleteStudentDemo(studentId);
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
	@Override
	public com.inexture.studentService.model.StudentDemo deleteStudentDemo(
		com.inexture.studentService.model.StudentDemo studentDemo) {

		return _studentDemoLocalService.deleteStudentDemo(studentDemo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _studentDemoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _studentDemoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _studentDemoLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _studentDemoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.inexture.studentService.model.impl.StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _studentDemoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.inexture.studentService.model.impl.StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _studentDemoLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _studentDemoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _studentDemoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.inexture.studentService.model.StudentDemo fetchStudentDemo(
		long studentId) {

		return _studentDemoLocalService.fetchStudentDemo(studentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _studentDemoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _studentDemoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _studentDemoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentDemoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the student demo with the primary key.
	 *
	 * @param studentId the primary key of the student demo
	 * @return the student demo
	 * @throws PortalException if a student demo with the primary key could not be found
	 */
	@Override
	public com.inexture.studentService.model.StudentDemo getStudentDemo(
			long studentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentDemoLocalService.getStudentDemo(studentId);
	}

	/**
	 * Returns a range of all the student demos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.inexture.studentService.model.impl.StudentDemoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of student demos
	 * @param end the upper bound of the range of student demos (not inclusive)
	 * @return the range of student demos
	 */
	@Override
	public java.util.List<com.inexture.studentService.model.StudentDemo>
		getStudentDemos(int start, int end) {

		return _studentDemoLocalService.getStudentDemos(start, end);
	}

	/**
	 * Returns the number of student demos.
	 *
	 * @return the number of student demos
	 */
	@Override
	public int getStudentDemosCount() {
		return _studentDemoLocalService.getStudentDemosCount();
	}

	@Override
	public java.util.List<com.inexture.studentService.model.StudentDemo>
			getStudentForStandard(String firstName)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _studentDemoLocalService.getStudentForStandard(firstName);
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
	@Override
	public com.inexture.studentService.model.StudentDemo updateStudentDemo(
		com.inexture.studentService.model.StudentDemo studentDemo) {

		return _studentDemoLocalService.updateStudentDemo(studentDemo);
	}

	@Override
	public StudentDemoLocalService getWrappedService() {
		return _studentDemoLocalService;
	}

	@Override
	public void setWrappedService(
		StudentDemoLocalService studentDemoLocalService) {

		_studentDemoLocalService = studentDemoLocalService;
	}

	private StudentDemoLocalService _studentDemoLocalService;

}