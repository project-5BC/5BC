package com.cts.catalogueService.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class UserDetails {
	
	private Integer userId;
	
	
	private String userName;
	
	
	
	private String role;
	
	
	private Integer managerId;
	
	
	
	
}

