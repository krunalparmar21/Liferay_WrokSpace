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

package com.Employee.service.impl;

import com.Employee.model.emp;
import com.Employee.service.base.empServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.SystemException;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=demoemployee",
		"json.web.service.context.path=emp"
	},
	service = AopService.class
)
public class empServiceImpl extends empServiceBaseImpl {

	/*
	public List<emp> getempFirstName(String firstName) throws SystemException {
		return this.empPersistence.findByfirstName(firstName);
	}*/
}