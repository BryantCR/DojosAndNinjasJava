package com.dojoninjas.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dojoninjas.model.Dojo;
import com.dojoninjas.model.Ninja;
import com.dojoninjas.services.*;


@Controller
public class NinjaController {

	private final NinjaService ninjaService;
	
	private final DojoService dojoService;
	
	public NinjaController( DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}
	
	@RequestMapping( value = "/ninja", method = RequestMethod.GET )
	public String displayninjas( @ModelAttribute("dojo") Dojo dojo, Model model) {
		List<Dojo> dojoList = dojoService.getAllDojos();
		System.out.println("RR"+ dojoList);
		
		model.addAttribute( "DojoList", dojoList );
		return "ninjahome.jsp";
	}
	
	@RequestMapping( value = "/ninja/add", method = RequestMethod.POST )
	public String createNinja( 
			 				   @RequestParam( value = "first_name" ) String first_name,
	 						   @RequestParam( value = "last_name" ) String last_name,
	 						   @RequestParam( value = "age" ) int age,
	 						   @RequestParam( value = "dojos_id" ) Long dojos_id, 
	 						   RedirectAttributes redirectAttributes, Model model ) {
		
		Dojo dojoinfo = ninjaService.getDojoId(dojos_id);
		// => NinjaService
		
		Ninja ninjaM = new Ninja (first_name, last_name, age, dojoinfo );
		System.out.println("VV"+ ninjaM);
		System.out.println("UU"+ dojos_id);
		System.out.println("UU"+ dojoinfo);
		model.addAttribute( "DDDD", dojoinfo );
		ninjaService.createNinja(ninjaM);
		
		return "redirect:/dojo";
	}
	
	/*@RequestMapping("/dojos/{id}")
	public String Show(@PathVariable("dojos_id")Long dojos_id, Model model) {
		Dojo dojoList = dojoService.findDojo(dojos_id);
		model.addAttribute("DojoList", dojoList);
		System.out.println(dojoList.getDojos_name());
		return "showview.jsp";
	}*/
	
}
