package com.myob.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myob.component.ResponseCode;


@RestController
public class MyobController {

	@Autowired
	private ResponseCode response;
	
	@Autowired
	BuildProperties buildProperties;
	
	

	@RequestMapping("/hello")
    public String hello() 
    {
		String name = "Hello Myob world";
		return name;
    }
	
	@RequestMapping("/response")
	public Health checkHealth() {
		return response.health();
	}
	
	@RequestMapping("/metadata")
	public Map<String,String> getMyobMetaData() {
		Map<String,String> metadata = new HashMap<String,String>();
		metadata.put("Name", buildProperties.getName());
		metadata.put("Version", buildProperties.getVersion());
		metadata.put("Time", buildProperties.getTime()+"");
		metadata.put("Artifact", buildProperties.getArtifact());
		metadata.put("Group", buildProperties.getGroup());
		
		return metadata;
	}
	
	
	
}
