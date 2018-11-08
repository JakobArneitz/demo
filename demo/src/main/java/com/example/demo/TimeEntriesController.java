package com.example.demo;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.TimeEntry;

@Controller
class TimeEntriesController {
	
	private List<TimeEntry> timeEntries = new LinkedList<>();
	
	public TimeEntriesController() {
	timeEntries.add(new TimeEntry(LocalDateTime.now()));
	}
	
	
	@GetMapping("/timeentries")
	ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("timeentries");
		modelAndView.addObject("title","Zeiteinteilung");
		modelAndView.addObject("timeEntries", timeEntries); 
		return modelAndView;
		}
	
	@GetMapping("/errorpage")
	ModelAndView errorpage() {
		ModelAndView modelAndView = new ModelAndView("errorpage");
		modelAndView.addObject("title","Zeiteinteilung"); 
		return modelAndView;
		}
	
	
	
}
