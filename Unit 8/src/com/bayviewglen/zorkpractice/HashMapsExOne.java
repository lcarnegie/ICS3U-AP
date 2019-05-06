package com.bayviewglen.zorkpractice;

import java.util.HashMap;

public class HashMapsExOne {

	public static void main(String[] args) {
		HashMap<String, Room> roomMap = new HashMap(); 
		
		roomMap.put("ROOM 106", new Room("Room 106", "AP Computer Science Classroom")); 
		roomMap.put("ROOM 109", new Room("Room 109", "A messy robotics lab"));
		
		Room r = roomMap.get("ROOM 106"); 
		System.out.println(r);
		
		for(String key : roomMap.keySet()) {
			System.out.println(roomMap.get(key)); // will repeat Room 106
		}
		
		

	}

}
