package com.opensense.dashboard.server.logic;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.opensense.dashboard.client.services.GeneralService;
import com.opensense.dashboard.server.util.RequestSender;
import com.opensense.dashboard.shared.Request;
import com.opensense.dashboard.shared.Response;
import com.opensense.dashboard.shared.Sensor;

@SuppressWarnings("serial")
public class GeneralServlet extends RemoteServiceServlet implements GeneralService{

	private static RequestSender requestSender;
	
	@Override
	public Response getDataFromRequest(Request searchRequest) {
		requestSender = new RequestSender();
		requestSender.addParameter("maxSensors", "100");
		JSONArray sensorArray = requestSender.arrayRequest("https://www.opensense.network/beta/api/v1.0/sensors");
		LinkedList<String> sensorList = new LinkedList<>();
		for(Object o : sensorArray) {
			JSONObject sensorJSON = (JSONObject) o;
//			sensorList.add(new Sensor(sensorJSON).getId()+"");
		}
		return new Response();
	}
	
	
	/**
	 * @param query the parameters formatted in JSON
	 * e.g.: {
	 * 			"maxSensors":100,
	 * 			"maxAccuracy":10
	 * 		 }
	 * @return the list of sensors returned from opensense.network
	 */
	public List<Sensor> getSensors(JSONObject query) {
		requestSender = new RequestSender();
		for(String key : JSONObject.getNames(query)) {
			requestSender.addParameter(key, query.getString(key));
		}
		JSONArray sensorArray = requestSender.arrayRequest("https://www.opensense.network/progprak/beta/api/v1.0/sensors");
		LinkedList<Sensor> sensorList = new LinkedList<>();
		for(Object o : sensorArray) {
			JSONObject sensorJSON = (JSONObject) o;
//			sensorList.add(new Sensor(sensorJSON));
		}
		return sensorList;
	}


	@Override
	public Map<Integer, String> getMeasurands() {
		Map<Integer, String> units = new HashMap<>(); //remove this
		units.put(1, "Luft");
		units.put(2, "Dieser");
		units.put(3, "Hier");
		return units;
	}

}
