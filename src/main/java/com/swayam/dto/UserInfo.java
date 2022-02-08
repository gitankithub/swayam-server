package com.swayam.dto;

import java.util.List;

import lombok.Data;

@Data
public class UserInfo {
	private String firstName;
	private String lastName;
	private String gender;
	private Long age;
	private String occupation;
	private String wakeUpTime;
	private Long exerciseFrequency;
	private List<String> energeticTime;
	private boolean meditate;
	private String happinessText;
	private boolean healthIssues;
	private String healthIssueDetail;
	private boolean smoke;
	private boolean drink;
}
