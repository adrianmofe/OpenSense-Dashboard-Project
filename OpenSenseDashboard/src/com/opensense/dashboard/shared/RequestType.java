package com.opensense.dashboard.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public enum RequestType implements IsSerializable{
	SENSOR, UNIT, VALUE, MEASURAND; //kannst gerne alle hinzuf�gen von den du glaubst, dass wir sie brauchen
}
