package com.login.hook;


import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletResponse;
import java.util.Date;

public class SampleServletFilter implements Filter{


    public void init(FilterConfig config) throws ServletException {

        System.out.println("Init method being called");

        /*
         * If we define init parameter in web.xml the following method retrive
         * the configured value
         */
        String intiParamValue = config.getInitParameter("initparam");
        System.out.println("initParamValue: " + intiParamValue);
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws java.io.IOException, ServletException {

        System.out.println("DoFilter method being called");

        /* Retrive the IP address of client from where user requested */
        String clientIPAddress = request.getRemoteAddr();

// Display or save the IP address of requested client.
        System.out.println("Requested Client IP Address" + clientIPAddress
                + ", Time " + new Date().toString());

        /* Pass request back down the filter chain */
        chain.doFilter(request, response);
    }

    public void destroy() {
        /*
         * This method will be executed when we undeploy application or stop
         * server
         */
        System.out.println("Destroy method being called");
    }
}
