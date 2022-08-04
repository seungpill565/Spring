package com.ezen.springmvc.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.springmvc.model.Coffee;
import com.ezen.springmvc.model.Shop;

import lombok.extern.log4j.Log4j2;

/**
 * Handles requests for the application home page.
 */
@Log4j2
@Controller
public class HomeController {
	
//	private Logger log = Logger.getLogger(this.getClass());
	
	
	@Autowired
	Coffee coffee;
	
	@Autowired
	Shop shop;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		log.error("This is error message.");
		log.debug("I am debug message");
		log.info("information.");
		log.trace("trace message.");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("coffee",coffee);
		
		return "home";
	}
	
}
