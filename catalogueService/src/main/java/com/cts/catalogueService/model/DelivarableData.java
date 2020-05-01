package com.cts.catalogueService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DelivarableData {
	private Integer delivarableId;
	private Integer EmployeeId;
	private String projectname;
	private String remarks;
	private Integer rating;
	private String review;
}
