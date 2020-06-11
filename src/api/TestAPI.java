package api;

import constructor.House;
import encapsulation.Student;
import staticvariable.DriveWay;

public class TestAPI {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setStName("Joy");
		st1.setStId(103);
		st1.setStDOB("09-05-1990");
		System.out.println(st1.getStName()+ " "+st1.getStId()+" "+st1.getStDOB());
		
		DriveWay driveWay = new DriveWay();
		driveWay.setDriveWaySize(8);
		System.out.println(driveWay.getDriveWaySize());
		
		House house = new House();
		house.kitchen();

	}

}
