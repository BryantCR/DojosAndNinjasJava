package com.dojoninjas.controllers;

import java.util.List;

/*import java.util.List;*/

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
/*import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dojoninjas.model.Dojo;
import com.dojoninjas.model.Ninja;
import com.dojoninjas.services.DojoService;

@Controller
public class DojoController {
	
	private final DojoService dojoService;
	
	public DojoController( DojoService dojoService ) {
		this.dojoService = dojoService;
	}
	
	@RequestMapping( value = "/dojo", method = RequestMethod.GET )
	public String displaydojos( @ModelAttribute("dojo") Dojo dojo, Model model) {
		List<Dojo> dojoList = dojoService.getAllDojos();
		//List<Ninja> ninjaList = ninjaService.getAllNinjas();
		
		model.addAttribute( "DojoList", dojoList );
		System.out.println("EE"+ dojoList);
		return "dojohome.jsp";
	}
	
	@RequestMapping( value = "/dojo/add", method = RequestMethod.POST )
	public String createDojo( @RequestParam( value = "dojos_name" ) String dojos_name, 
							  //@RequestParam( value = "dojos_id" ) String dojos_id,
							   RedirectAttributes redirectAttributes ) {
		//Dojo dojoinfo = dojoService.getDojoId(dojos_id);
		Dojo dojoM = new Dojo (dojos_name);
		System.out.println("BB"+ dojoM);
		dojoService.createDojo(dojoM);
		
		return "redirect:/dojo";
	}
	
	@RequestMapping("/dojos/{dojos_id}")
	public String Show(@PathVariable("dojos_id")Long dojos_id, Model model) {
		Dojo dojoList = dojoService.findDojo(dojos_id);
		model.addAttribute("DojoList", dojoList);
		System.out.println(dojoList.getDojos_name());
		return "showview.jsp";
	}
	
}
