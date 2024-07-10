package com.learn.javacollection;
import java.util.*;

public class CollectionHolder {
	private List<String> myList;
	private Set<String> mySet;
	private Map<String, String> myMap;
	private List<Player> myPlayers;
	
	private Properties properties; // check this utility out, seems interesting
	
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	public List<String> getMyList() {
		return myList;
	}
	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	public Set<String> getMySet() {
		return mySet;
	}
	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}
	public Map<String, String> getMyMap() {
		return myMap;
	}
	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}
	public List<Player> getMyPlayers() {
		return myPlayers;
	}
	public void setMyPlayers(List<Player> myPlayers) {
		this.myPlayers = myPlayers;
	}
	
	
}
