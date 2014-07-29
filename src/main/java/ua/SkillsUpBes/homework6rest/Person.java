/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.SkillsUpBes.homework6rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Andr
 */
@Path("/persone")
public class Person {

    private String name ,
	           address ,
	           phone ;


    public Person() {
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
    
    public String getAdress() {
	return address;
    }

    /**
     * @param adress the address to set
     */
    public void setAdress(String adress) {
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
    
    // call the path "/persone/show" 
    @GET
    @Path("/show")
    @Produces(MediaType.TEXT_PLAIN)
    public String show(){
         return (getAdress()+"\n"+ getName()+"\n"+ getPhone() + "\n");
    }
    
    //call the default path "/persone"
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String show2(){
         return show();
    }
    
    //return json type 
    @GET
    @Path("/getP")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(){
	Person p;
	p = this;
	//p = new Person("Вася Пупкин", "New-York", "102");
        return p;  
    }
}
