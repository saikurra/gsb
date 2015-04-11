package com.saikurra.gsb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.saikurra.gsb.model.UnivDetails;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	  @RequestMapping(value = "/", method = RequestMethod.GET)
	  public ModelAndView home() {
		
			/*logger.info("Welcome home! The client locale is {}.", locale);*/
			ModelAndView mv= new ModelAndView();
			mv.addObject("univDetails", new UnivDetails());
			mv.setViewName("adduniv");
			return mv;
	   }
	
	  @RequestMapping(value="/submitUnivDetails", method = RequestMethod.POST)
	   public ModelAndView addStudent(@ModelAttribute("univDetails") UnivDetails univDetails) {
		  logger.debug("University Details Submitted");
		  ModelAndView mv= new ModelAndView();
		  mv.addObject("univDetails", univDetails);
		  mv.setViewName("adduniv");
	      return mv;
	   }
	
}
