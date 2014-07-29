/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.SkillsUpBes.homework6rest;

/**
 *
 * @author Andr
 */

public class Person {
    private static Person persone ;

    private String name ,
	           address ,
	           phone ;


    public  Person() {
	name = "Empty";
	address = "Empty";
        phone = "Empry";
	
    }
    public Person(String name ,String address,String phone) {
	this.name = name;
	this.address = address;
        this.phone = phone;
    }
    
    

    /**
     * @return the name
     */
    
    
    public String getName() {
	return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * @return the address
     */
    
    public String getAddress() {
	return address;
    }

    /**
     * @param adress the address to set
     */
    public void setAddress(String adress) {
	this.address = adress;
    }

    /**
     * @return the phone
     */
    
    public String getPhone() {
	return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
	this.phone = phone;
    }
    
  
}
