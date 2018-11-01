package com.opensense.dashboard.client.gui;

import org.vectomatic.dom.svg.ui.SVGResource;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface GUIImageBundle extends ClientBundle {
	
	public static final GUIImageBundle INSTANCE =  GWT.create(GUIImageBundle.class);
	
	@Source("icons/home.png")
	ImageResource homeIcon();
	
	@Source("icons/home.svg")
	SVGResource homeIconSvg();
 	
	@Source("icons/search.png")
	ImageResource searchIcon();
	
	@Source("icons/search.svg")
	SVGResource searchIconSvg();
 	
	@Source("icons/diagram.png")
	ImageResource diagramIcon();
	
	@Source("icons/diagram.svg")
	SVGResource diagramIconSvg();
 	
	@Source("icons/list.png")
	ImageResource listIcon();
	
	@Source("icons/list.svg")
	SVGResource listIconSvg();
 	
	@Source("icons/user.png")
	ImageResource userIcon();
	
	@Source("icons/user.svg")
	SVGResource userIconSvg();
 	
	@Source("icons/map.png")
	ImageResource mapIcon();
	
	@Source("icons/map.svg")
	SVGResource mapIconSvg();
}
