package com;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/UserService")
public class UserService {

	UserDao userDao=new UserDao();
	
	@GET
	@Path("/User")
	@Produces(MediaType.APPLICATION_XML)
	public List<User>getUserList()
	{
		return userDao.getAllUser();
	}
}
