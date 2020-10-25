package com.dg.tms.model;

import java.util.List;

import lombok.Data;

@Data
public class TodoGroup {

	private String groupId;
	
	private String groupName;
	
	private List<String> groupList;
	
	private String createdOn;
	
	private String udpatedOn;
	
	private String userId;
}
