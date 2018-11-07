package com.opensense.dashboard.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public enum ResultType implements IsSerializable{
	SENSOR_LIST, SINGLE_SENSOR, UNIT_MAP, VALUE_LIST, MEASURAND_MAP; //kannst gerne alle hinzuf�gen von den du glaubst, dass wir sie brauchen
	
	private ResultType() {
	}
}
