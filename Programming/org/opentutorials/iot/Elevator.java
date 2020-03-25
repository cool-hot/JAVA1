package org.opentutorials.iot;

public class Elevator {
	String _id;
	public Elevator(String id) {
		this._id = id;
	}

	public Boolean callForUp(int stopFloor) {
		System.out.println(this._id+" ¡æ Elevator callForUp stopFloor : "+stopFloor);
		return true;
	}
	
	public Boolean callForDown(int stopFloor) {
		System.out.println(this._id+" ¡æ Elevator callForDown : "+stopFloor);
		return true;
	}
}