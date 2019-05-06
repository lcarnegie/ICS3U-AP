package com.bayviewglen.zorkpractice;

public class Room {
	private String roomName; 
	private String roomDesc;
	
	public Room(String roomName, String roomDesc) {
		this.roomName = roomName; 
		this.roomDesc = roomDesc; 
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomDesc() {
		return roomDesc;
	}
	public void setRoomDesc(String roomDesc) {
		this.roomDesc = roomDesc;
	}
	public String toString() {
		return "Room:" + roomName + ", " + roomDesc;
	} 
	
}
