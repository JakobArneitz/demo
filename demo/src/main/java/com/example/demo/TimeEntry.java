package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;


@Data
public class TimeEntry {
	
	
	private Long id; 
	
	private final LocalDateTime start;
	
	private LocalDate stop;
	
	private String description;
	
}
