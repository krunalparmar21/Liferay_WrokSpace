package com.inexture.portlet;

import com.inexture.constants.CustomUserModelListenerPortletKeys;

import com.liferay.blogs.model.BlogsEntry;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;


import com.liferay.portal.kernel.model.User;
import org.osgi.service.component.annotations.Component;


/**
 * @author root329
 */

@Component(
		immediate = true,
		service = ModelListener.class
)
public class CustomUserModelListenerPortlet extends BaseModelListener<BlogsEntry> {
	private static final Log log = LogFactoryUtil.getLog(CustomUserModelListenerPortlet.class);

	@Override
	public void onBeforeCreate(BlogsEntry blogsModel) throws ModelListenerException {
		log.info("in onBeforeCreate method");
		log.info("userModel : " +blogsModel);

		System.out.println("Before Blogs added");
		super.onBeforeCreate(blogsModel);
	}

	@Override
	public void onAfterCreate(BlogsEntry blogsModel) throws ModelListenerException {

		log.info("in onAfterCreate method");
		log.info("userModel : " + blogsModel);

		System.out.println("after blogs added");
		super.onAfterCreate(blogsModel);
	}

	@Override
	public void onBeforeRemove(BlogsEntry blogsModel) throws ModelListenerException {

		log.info("in onBefore Blogs remove ");
		log.info("userModel : " +blogsModel);

		// System.out.println("Before Blogs added");

		super.onBeforeRemove(blogsModel);
	}

	@Override
	public void onAfterRemove(BlogsEntry blogsModel) throws ModelListenerException {

		log.info("in onAfter Blogs remove ");
		log.info("userModel : " + blogsModel);

		super.onAfterRemove(blogsModel);
	}
}