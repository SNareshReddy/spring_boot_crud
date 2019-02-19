package com.naresh.example.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.hibernate.sql.ordering.antlr.GeneratedOrderByFragmentParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naresh.example.entities.Location;
import com.naresh.example.repositories.LocationRepository;
import com.naresh.example.services.LocationService;
import com.naresh.example.util.ReportUtil;

@Controller
public class LocationController {
	
	@Autowired
	LocationService service;
	
	@Autowired
	LocationRepository repository;
	
	@Autowired
	ReportUtil reportUtil;
	
	@Autowired
	ServletContext sc;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		
		return "createLocation";
	}
	
	@RequestMapping("/saveLocation")
	public String saveLocation(@ModelAttribute("location") Location location,ModelMap modelMap) {
		
		Location locationSaved = service.saveLocation(location);
		String msg="Location saved with id:"+locationSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createLocation";
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		
		List<Location> locations=service.getAllLocations();
		modelMap.addAttribute("msg", locations);
		return "displayLocations";
	}

	@RequestMapping("/generateReport")
	public String generateReport() {
		
		String path = sc.getRealPath("/");
		List<Object[]> data = repository.findTypeAndCount();
		 reportUtil.generatePieChart(path, data);
		return "report";
	}
	
}
