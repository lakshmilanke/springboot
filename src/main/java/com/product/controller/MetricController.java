package com.product.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Metric;
import com.product.service.MetricService;

@RestController
@RequestMapping("/api/metric")
@CrossOrigin
public class MetricController {

	Logger logger = LoggerFactory.getLogger(MetricController.class);
	
	@Autowired
	MetricService metricService;


	
	@PostMapping("/updateCount/{id}")
	public ResponseEntity<Metric> register(@PathVariable long id){
		
		return new ResponseEntity<Metric>(metricService.updateCount(id), HttpStatus.OK);
	}
	
}
