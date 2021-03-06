package com.opensense.dashboard.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.opensense.dashboard.shared.ActionResult;

public interface AuthenticationServiceAsync {
	
	void userLoginRequest(String userName, String password, AsyncCallback<ActionResult> asyncCallback);
	void createUserInSession(AsyncCallback<Boolean> asyncCallback);
	void userLoggedOut(AsyncCallback<ActionResult> asyncCallback);
}
