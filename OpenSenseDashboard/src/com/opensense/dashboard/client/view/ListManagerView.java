package com.opensense.dashboard.client.view;

import java.util.List;
import java.util.Map;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.Widget;
import com.opensense.dashboard.client.utils.BasicSensorItemCard;
import com.opensense.dashboard.client.utils.ListManager;
import com.opensense.dashboard.shared.MinimalSensor;
import com.opensense.dashboard.shared.UserList;

public interface ListManagerView {

	public interface Presenter {
		void deleteList(int listId);
		void deleteSensorsInList(int listId, List<Integer> sensorCardId);
		HandlerManager getEventBus();
		ListManager getController();
		void changeListName(int listId, String listName);
	}

	public Widget asWidget();
	public void removeListItem(int listId);
	public void setPresenter(Presenter listManagerPresenter);
	public void initDefaultLists(Runnable object);
	public void showMySensorListsItem(boolean b);
	public void showSelectedSensorListsItem(boolean b);
	public void clearUserLists();
	public void addNewUserListItem(UserList result);
	public void selectAllSensorsInList(int listId);
	public void setCollapsibleListItemSelected(int listId);
	public void setSensorsInList(int listId, List<MinimalSensor> sensors);
	public Map<Integer, BasicSensorItemCard> getSensorCardMap(int listId);
}
