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

package com.inexture.studentService.service.persistence.impl;

import com.inexture.studentService.exception.NoSuchStudentDemoException;
import com.inexture.studentService.model.StudentDemo;
import com.inexture.studentService.model.StudentDemoTable;
import com.inexture.studentService.model.impl.StudentDemoImpl;
import com.inexture.studentService.model.impl.StudentDemoModelImpl;
import com.inexture.studentService.service.persistence.StudentDemoPersistence;
import com.inexture.studentService.service.persistence.StudentDemoUtil;
import com.inexture.studentService.service.persistence.impl.constants.studPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the student demo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {StudentDemoPersistence.class, BasePersistence.class})
public class StudentDemoPersistenceImpl
	extends BasePersistenceImpl<StudentDemo> implements StudentDemoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>StudentDemoUtil</code> to access the student demo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		StudentDemoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByfirstName;
	private FinderPath _finderPathWithoutPaginationFindByfirstName;
	private FinderPath _finderPathCountByfirstName;

	/**
	 * Returns all the student demos where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @return the matching student demos
	 */
	@Override
	public List<StudentDemo> findByfirstName(String firstName) {
		return findByfirstName(
			firstName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<StudentDemo> findByfirstName(
		String firstName, int start, int end) {

		return findByfirstName(firstName, start, end, null);
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
	@Override
	public List<StudentDemo> findByfirstName(
		String firstName, int start, int end,
		OrderByComparator<StudentDemo> orderByComparator) {

		return findByfirstName(firstName, start, end, orderByComparator, true);
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
	@Override
	public List<StudentDemo> findByfirstName(
		String firstName, int start, int end,
		OrderByComparator<StudentDemo> orderByComparator,
		boolean useFinderCache) {

		firstName = Objects.toString(firstName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByfirstName;
				finderArgs = new Object[] {firstName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByfirstName;
			finderArgs = new Object[] {
				firstName, start, end, orderByComparator
			};
		}

		List<StudentDemo> list = null;

		if (useFinderCache) {
			list = (List<StudentDemo>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (StudentDemo studentDemo : list) {
					if (!firstName.equals(studentDemo.getFirstName())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_STUDENTDEMO_WHERE);

			boolean bindFirstName = false;

			if (firstName.isEmpty()) {
				sb.append(_FINDER_COLUMN_FIRSTNAME_FIRSTNAME_3);
			}
			else {
				bindFirstName = true;

				sb.append(_FINDER_COLUMN_FIRSTNAME_FIRSTNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(StudentDemoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindFirstName) {
					queryPos.add(firstName);
				}

				list = (List<StudentDemo>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first student demo in the ordered set where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student demo
	 * @throws NoSuchStudentDemoException if a matching student demo could not be found
	 */
	@Override
	public StudentDemo findByfirstName_First(
			String firstName, OrderByComparator<StudentDemo> orderByComparator)
		throws NoSuchStudentDemoException {

		StudentDemo studentDemo = fetchByfirstName_First(
			firstName, orderByComparator);

		if (studentDemo != null) {
			return studentDemo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("firstName=");
		sb.append(firstName);

		sb.append("}");

		throw new NoSuchStudentDemoException(sb.toString());
	}

	/**
	 * Returns the first student demo in the ordered set where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student demo, or <code>null</code> if a matching student demo could not be found
	 */
	@Override
	public StudentDemo fetchByfirstName_First(
		String firstName, OrderByComparator<StudentDemo> orderByComparator) {

		List<StudentDemo> list = findByfirstName(
			firstName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last student demo in the ordered set where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student demo
	 * @throws NoSuchStudentDemoException if a matching student demo could not be found
	 */
	@Override
	public StudentDemo findByfirstName_Last(
			String firstName, OrderByComparator<StudentDemo> orderByComparator)
		throws NoSuchStudentDemoException {

		StudentDemo studentDemo = fetchByfirstName_Last(
			firstName, orderByComparator);

		if (studentDemo != null) {
			return studentDemo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("firstName=");
		sb.append(firstName);

		sb.append("}");

		throw new NoSuchStudentDemoException(sb.toString());
	}

	/**
	 * Returns the last student demo in the ordered set where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student demo, or <code>null</code> if a matching student demo could not be found
	 */
	@Override
	public StudentDemo fetchByfirstName_Last(
		String firstName, OrderByComparator<StudentDemo> orderByComparator) {

		int count = countByfirstName(firstName);

		if (count == 0) {
			return null;
		}

		List<StudentDemo> list = findByfirstName(
			firstName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public StudentDemo[] findByfirstName_PrevAndNext(
			long studentId, String firstName,
			OrderByComparator<StudentDemo> orderByComparator)
		throws NoSuchStudentDemoException {

		firstName = Objects.toString(firstName, "");

		StudentDemo studentDemo = findByPrimaryKey(studentId);

		Session session = null;

		try {
			session = openSession();

			StudentDemo[] array = new StudentDemoImpl[3];

			array[0] = getByfirstName_PrevAndNext(
				session, studentDemo, firstName, orderByComparator, true);

			array[1] = studentDemo;

			array[2] = getByfirstName_PrevAndNext(
				session, studentDemo, firstName, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected StudentDemo getByfirstName_PrevAndNext(
		Session session, StudentDemo studentDemo, String firstName,
		OrderByComparator<StudentDemo> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_STUDENTDEMO_WHERE);

		boolean bindFirstName = false;

		if (firstName.isEmpty()) {
			sb.append(_FINDER_COLUMN_FIRSTNAME_FIRSTNAME_3);
		}
		else {
			bindFirstName = true;

			sb.append(_FINDER_COLUMN_FIRSTNAME_FIRSTNAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(StudentDemoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindFirstName) {
			queryPos.add(firstName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(studentDemo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<StudentDemo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the student demos where firstName = &#63; from the database.
	 *
	 * @param firstName the first name
	 */
	@Override
	public void removeByfirstName(String firstName) {
		for (StudentDemo studentDemo :
				findByfirstName(
					firstName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(studentDemo);
		}
	}

	/**
	 * Returns the number of student demos where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @return the number of matching student demos
	 */
	@Override
	public int countByfirstName(String firstName) {
		firstName = Objects.toString(firstName, "");

		FinderPath finderPath = _finderPathCountByfirstName;

		Object[] finderArgs = new Object[] {firstName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_STUDENTDEMO_WHERE);

			boolean bindFirstName = false;

			if (firstName.isEmpty()) {
				sb.append(_FINDER_COLUMN_FIRSTNAME_FIRSTNAME_3);
			}
			else {
				bindFirstName = true;

				sb.append(_FINDER_COLUMN_FIRSTNAME_FIRSTNAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindFirstName) {
					queryPos.add(firstName);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_FIRSTNAME_FIRSTNAME_2 =
		"studentDemo.firstName = ?";

	private static final String _FINDER_COLUMN_FIRSTNAME_FIRSTNAME_3 =
		"(studentDemo.firstName IS NULL OR studentDemo.firstName = '')";

	public StudentDemoPersistenceImpl() {
		setModelClass(StudentDemo.class);

		setModelImplClass(StudentDemoImpl.class);
		setModelPKClass(long.class);

		setTable(StudentDemoTable.INSTANCE);
	}

	/**
	 * Caches the student demo in the entity cache if it is enabled.
	 *
	 * @param studentDemo the student demo
	 */
	@Override
	public void cacheResult(StudentDemo studentDemo) {
		entityCache.putResult(
			StudentDemoImpl.class, studentDemo.getPrimaryKey(), studentDemo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the student demos in the entity cache if it is enabled.
	 *
	 * @param studentDemos the student demos
	 */
	@Override
	public void cacheResult(List<StudentDemo> studentDemos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (studentDemos.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (StudentDemo studentDemo : studentDemos) {
			if (entityCache.getResult(
					StudentDemoImpl.class, studentDemo.getPrimaryKey()) ==
						null) {

				cacheResult(studentDemo);
			}
		}
	}

	/**
	 * Clears the cache for all student demos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(StudentDemoImpl.class);

		finderCache.clearCache(StudentDemoImpl.class);
	}

	/**
	 * Clears the cache for the student demo.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(StudentDemo studentDemo) {
		entityCache.removeResult(StudentDemoImpl.class, studentDemo);
	}

	@Override
	public void clearCache(List<StudentDemo> studentDemos) {
		for (StudentDemo studentDemo : studentDemos) {
			entityCache.removeResult(StudentDemoImpl.class, studentDemo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(StudentDemoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(StudentDemoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new student demo with the primary key. Does not add the student demo to the database.
	 *
	 * @param studentId the primary key for the new student demo
	 * @return the new student demo
	 */
	@Override
	public StudentDemo create(long studentId) {
		StudentDemo studentDemo = new StudentDemoImpl();

		studentDemo.setNew(true);
		studentDemo.setPrimaryKey(studentId);

		studentDemo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return studentDemo;
	}

	/**
	 * Removes the student demo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentId the primary key of the student demo
	 * @return the student demo that was removed
	 * @throws NoSuchStudentDemoException if a student demo with the primary key could not be found
	 */
	@Override
	public StudentDemo remove(long studentId)
		throws NoSuchStudentDemoException {

		return remove((Serializable)studentId);
	}

	/**
	 * Removes the student demo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the student demo
	 * @return the student demo that was removed
	 * @throws NoSuchStudentDemoException if a student demo with the primary key could not be found
	 */
	@Override
	public StudentDemo remove(Serializable primaryKey)
		throws NoSuchStudentDemoException {

		Session session = null;

		try {
			session = openSession();

			StudentDemo studentDemo = (StudentDemo)session.get(
				StudentDemoImpl.class, primaryKey);

			if (studentDemo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStudentDemoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(studentDemo);
		}
		catch (NoSuchStudentDemoException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected StudentDemo removeImpl(StudentDemo studentDemo) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(studentDemo)) {
				studentDemo = (StudentDemo)session.get(
					StudentDemoImpl.class, studentDemo.getPrimaryKeyObj());
			}

			if (studentDemo != null) {
				session.delete(studentDemo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (studentDemo != null) {
			clearCache(studentDemo);
		}

		return studentDemo;
	}

	@Override
	public StudentDemo updateImpl(StudentDemo studentDemo) {
		boolean isNew = studentDemo.isNew();

		if (!(studentDemo instanceof StudentDemoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(studentDemo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(studentDemo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in studentDemo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom StudentDemo implementation " +
					studentDemo.getClass());
		}

		StudentDemoModelImpl studentDemoModelImpl =
			(StudentDemoModelImpl)studentDemo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (studentDemo.getCreateDate() == null)) {
			if (serviceContext == null) {
				studentDemo.setCreateDate(date);
			}
			else {
				studentDemo.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!studentDemoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				studentDemo.setModifiedDate(date);
			}
			else {
				studentDemo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(studentDemo);
			}
			else {
				studentDemo = (StudentDemo)session.merge(studentDemo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			StudentDemoImpl.class, studentDemoModelImpl, false, true);

		if (isNew) {
			studentDemo.setNew(false);
		}

		studentDemo.resetOriginalValues();

		return studentDemo;
	}

	/**
	 * Returns the student demo with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the student demo
	 * @return the student demo
	 * @throws NoSuchStudentDemoException if a student demo with the primary key could not be found
	 */
	@Override
	public StudentDemo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStudentDemoException {

		StudentDemo studentDemo = fetchByPrimaryKey(primaryKey);

		if (studentDemo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStudentDemoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return studentDemo;
	}

	/**
	 * Returns the student demo with the primary key or throws a <code>NoSuchStudentDemoException</code> if it could not be found.
	 *
	 * @param studentId the primary key of the student demo
	 * @return the student demo
	 * @throws NoSuchStudentDemoException if a student demo with the primary key could not be found
	 */
	@Override
	public StudentDemo findByPrimaryKey(long studentId)
		throws NoSuchStudentDemoException {

		return findByPrimaryKey((Serializable)studentId);
	}

	/**
	 * Returns the student demo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param studentId the primary key of the student demo
	 * @return the student demo, or <code>null</code> if a student demo with the primary key could not be found
	 */
	@Override
	public StudentDemo fetchByPrimaryKey(long studentId) {
		return fetchByPrimaryKey((Serializable)studentId);
	}

	/**
	 * Returns all the student demos.
	 *
	 * @return the student demos
	 */
	@Override
	public List<StudentDemo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<StudentDemo> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<StudentDemo> findAll(
		int start, int end, OrderByComparator<StudentDemo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<StudentDemo> findAll(
		int start, int end, OrderByComparator<StudentDemo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<StudentDemo> list = null;

		if (useFinderCache) {
			list = (List<StudentDemo>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_STUDENTDEMO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_STUDENTDEMO;

				sql = sql.concat(StudentDemoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<StudentDemo>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the student demos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (StudentDemo studentDemo : findAll()) {
			remove(studentDemo);
		}
	}

	/**
	 * Returns the number of student demos.
	 *
	 * @return the number of student demos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_STUDENTDEMO);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "studentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_STUDENTDEMO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return StudentDemoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the student demo persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByfirstName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByfirstName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"firstName"}, true);

		_finderPathWithoutPaginationFindByfirstName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfirstName",
			new String[] {String.class.getName()}, new String[] {"firstName"},
			true);

		_finderPathCountByfirstName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfirstName",
			new String[] {String.class.getName()}, new String[] {"firstName"},
			false);

		_setStudentDemoUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setStudentDemoUtilPersistence(null);

		entityCache.removeCache(StudentDemoImpl.class.getName());
	}

	private void _setStudentDemoUtilPersistence(
		StudentDemoPersistence studentDemoPersistence) {

		try {
			Field field = StudentDemoUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, studentDemoPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = studPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = studPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = studPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_STUDENTDEMO =
		"SELECT studentDemo FROM StudentDemo studentDemo";

	private static final String _SQL_SELECT_STUDENTDEMO_WHERE =
		"SELECT studentDemo FROM StudentDemo studentDemo WHERE ";

	private static final String _SQL_COUNT_STUDENTDEMO =
		"SELECT COUNT(studentDemo) FROM StudentDemo studentDemo";

	private static final String _SQL_COUNT_STUDENTDEMO_WHERE =
		"SELECT COUNT(studentDemo) FROM StudentDemo studentDemo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "studentDemo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No StudentDemo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No StudentDemo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		StudentDemoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private StudentDemoModelArgumentsResolver
		_studentDemoModelArgumentsResolver;

}