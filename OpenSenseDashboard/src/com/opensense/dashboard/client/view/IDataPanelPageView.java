package com.opensense.dashboard.client.view;

import com.google.gwt.user.client.ui.Widget;

public interface IDataPanelPageView {
	
	Widget asWidget();
	boolean isNotInitialized();
	void setInitializedToTrue();
}
