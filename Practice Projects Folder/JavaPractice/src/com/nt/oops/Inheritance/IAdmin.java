package com.nt.oops.Inheritance;


//multiple Inheritance can be possible by interface not by class
//interface to interface-->extends
//class to class-->extends
//class to interface-->implements
public interface IAdmin extends IGuest,IDeveloper{
	public void manage();
}
