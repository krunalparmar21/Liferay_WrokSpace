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

package com.Employee.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link empLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see empLocalService
 * @generated
 */
public class empLocalServiceWrapper
	implements empLocalService, ServiceWrapper<empLocalService> {

	public empLocalServiceWrapper() {
		this(null);
	}

	public empLocalServiceWrapper(empLocalService empLocalService) {
		_empLocalService = empLocalService;
	}

	/**
	 * Adds the emp to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect empLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param emp the emp
	 * @return the emp that was added
	 */
	@Override
	public com.Employee.model.emp addemp(com.Employee.model.emp emp) {
		return _empLocalService.addemp(emp);
	}

	/**
	 * Creates a new emp with the primary key. Does not add the emp to the database.
	 *
	 * @param empId the primary key for the new emp
	 * @return the new emp
	 */
	@Override
	public com.Employee.model.emp createemp(long empId) {
		return _empLocalService.createemp(empId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _empLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the emp from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect empLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param emp the emp
	 * @return the emp that was removed
	 */
	@Override
	public com.Employee.model.emp deleteemp(com.Employee.model.emp emp) {
		return _empLocalService.deleteemp(emp);
	}

	/**
	 * Deletes the emp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect empLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param empId the primary key of the emp
	 * @return the emp that was removed
	 * @throws PortalException if a emp with the primary key could not be found
	 */
	@Override
	public com.Employee.model.emp deleteemp(long empId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _empLocalService.deleteemp(empId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _empLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _empLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _empLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _empLocalService.dynamicQuery();
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

		return _empLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.Employee.model.impl.empModelImpl</code>.
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

		return _empLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.Employee.model.impl.empModelImpl</code>.
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

		return _empLocalService.dynamicQuery(
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

		return _empLocalService.dynamicQueryCount(dynamicQuery);
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

		return _empLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.Employee.model.emp fetchemp(long empId) {
		return _empLocalService.fetchemp(empId);
	}

	/**
	 * Returns the emp matching the UUID and group.
	 *
	 * @param uuid the emp's UUID
	 * @param groupId the primary key of the group
	 * @return the matching emp, or <code>null</code> if a matching emp could not be found
	 */
	@Override
	public com.Employee.model.emp fetchempByUuidAndGroupId(
		String uuid, long groupId) {

		return _empLocalService.fetchempByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public java.util.List<com.Employee.model.emp> findByCity(String city)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _empLocalService.findByCity(city);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _empLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the emp with the primary key.
	 *
	 * @param empId the primary key of the emp
	 * @return the emp
	 * @throws PortalException if a emp with the primary key could not be found
	 */
	@Override
	public com.Employee.model.emp getemp(long empId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _empLocalService.getemp(empId);
	}

	/**
	 * Returns the emp matching the UUID and group.
	 *
	 * @param uuid the emp's UUID
	 * @param groupId the primary key of the group
	 * @return the matching emp
	 * @throws PortalException if a matching emp could not be found
	 */
	@Override
	public com.Employee.model.emp getempByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _empLocalService.getempByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the emps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.Employee.model.impl.empModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @return the range of emps
	 */
	@Override
	public java.util.List<com.Employee.model.emp> getemps(int start, int end) {
		return _empLocalService.getemps(start, end);
	}

	/**
	 * Returns all the emps matching the UUID and company.
	 *
	 * @param uuid the UUID of the emps
	 * @param companyId the primary key of the company
	 * @return the matching emps, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.Employee.model.emp> getempsByUuidAndCompanyId(
		String uuid, long companyId) {

		return _empLocalService.getempsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of emps matching the UUID and company.
	 *
	 * @param uuid the UUID of the emps
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching emps, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.Employee.model.emp> getempsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.Employee.model.emp>
			orderByComparator) {

		return _empLocalService.getempsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of emps.
	 *
	 * @return the number of emps
	 */
	@Override
	public int getempsCount() {
		return _empLocalService.getempsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _empLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _empLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _empLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _empLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the emp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect empLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param emp the emp
	 * @return the emp that was updated
	 */
	@Override
	public com.Employee.model.emp updateemp(com.Employee.model.emp emp) {
		return _empLocalService.updateemp(emp);
	}

	@Override
	public empLocalService getWrappedService() {
		return _empLocalService;
	}

	@Override
	public void setWrappedService(empLocalService empLocalService) {
		_empLocalService = empLocalService;
	}

	private empLocalService _empLocalService;

}