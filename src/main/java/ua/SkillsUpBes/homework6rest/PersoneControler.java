/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.SkillsUpBes.homework6rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Andr
 */
@Path("/persone")
public class PersoneControler {

    private Person person;

    public PersoneControler() {
	person = new Person();
    }

    // call the path "/persone/show" 
    @GET
    @Path("/show")
    @Produces(MediaType.TEXT_PLAIN)
    public String show() {
	return (person.getAddress() + "\n" + person.getName() + "\n" + person.getPhone() + "\n");
    }

    //call the default path "/persone"
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String show2() {
	return show();
    }

    //return json type 
    @GET
    @Path("/getP")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson() {

	//p = persone;
	person = new Person("Вася Пупкин", "New-York", "102");
	return person;
    }

    @GET
    @Path("/getArray")
    @Produces(MediaType.APPLICATION_JSON)
    public String[] getArray() {

	String[] array = {"Вася Пупкин", "New-York", "102"};
	return array;
    }
    
    @POST
    @Path("savePerson")
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response saveNewPerson(Person person){
           return Response.status(Response.Status.OK).
		   entity("<b>Server receive: </b>" + person.getName()).build();
    } 

}
