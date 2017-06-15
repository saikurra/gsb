package com.saikurra.gsb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.saikurra.gsb.model.EngineeringDetails;
import com.saikurra.gsb.model.UnivDetails;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {

		/* logger.info("Welcome home! The client locale is {}.", locale); */
		ModelAndView mv = new ModelAndView();
		mv.addObject("univDetails", new UnivDetails());
		mv.addObject("enggDetails", new EngineeringDetails());
		mv.setViewName("adduniv");
		return mv;
	}

	@RequestMapping(value = "/submitUnivDetails", method = RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("univDetails") UnivDetails univDetails) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("univDetails", univDetails);
		mv.addObject("enggDetails", new EngineeringDetails());
		mv.setViewName("adduniv");
		return mv;
	}

	@RequestMapping(value = "/submitEnggDetails", method = RequestMethod.POST)
	public ModelAndView addEnggDetails(@ModelAttribute("enggDetails") EngineeringDetails enggDetails) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("univDetails", new UnivDetails());
		mv.addObject("enggDetails", enggDetails);
		mv.setViewName("adduniv");
		return mv;
	}

}
