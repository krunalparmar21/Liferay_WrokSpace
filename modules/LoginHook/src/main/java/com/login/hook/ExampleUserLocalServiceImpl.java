package com.login.hook;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.service.UserLocalServiceWrapper;

import java.util.Map;


public class ExampleUserLocalServiceImpl extends UserLocalServiceWrapper {


    public ExampleUserLocalServiceImpl(UserLocalService userLocalService) {
        super(userLocalService);
    }


    @Override
    public int authenticateByEmailAddress(long companyId, String emailAddress,
                                          String password, Map<String, String[]> headerMap,
                                          Map<String, String[]> parameterMap, Map<String, Object> resultsMap)
            throws PortalException, SystemException {

        System.out.println("Custom Login Authentication is called");
        return super.authenticateByEmailAddress(companyId, emailAddress, password,
                headerMap, parameterMap, resultsMap);
    }
}

