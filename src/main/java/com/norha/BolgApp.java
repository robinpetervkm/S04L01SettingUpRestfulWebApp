package com.norha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BolgApp {

	public static void main(String[] args) {
		SpringApplication.run(BolgApp.class, args);
	}

}


/******************************************************************************
Web Service
******************************************************************************
A service on Web, for machine consumption
A web service can have multiple micro services
Other Application will use your web services
If web service has structural change other services may crash
Rules are importent


Structure : Posts Services
Blog App


Resourse ------> Posts 

					View all
					View specific
					Add
					Update
					Delete
					
	Posts
	
operations 		Method			Url Pattren

View all		Get				/posts
View specific 	Get				/posts/id
Add				Post			/posts
Update			Put				/posts
Delete 			Delete			/posts
****************************************************************************
****************************************************************************/
/******************************************************************************
Multiple ways to create maven project
******************************************************************************

POM File Explained

1 we have 2 trees --> Parant and dependancies. 

2 in parent version will determines the versions of the dependancy packages.

3 when we use the spring stater project internaly make use of 
spring project intializer amother project from spring team.
****************************************************************************
****************************************************************************/


