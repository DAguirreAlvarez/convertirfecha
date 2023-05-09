package com.diego.convertirfecha.controllers;
  
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MainController {
	
	
	@RequestMapping("/hola")
	public String bienvenida() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String fecha(Model model) {
		
		/*
		Date fecha = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("EEEE, d 'de' MMMM, yyyy");
		String str = formato.format(fecha);
		model.addAttribute("fecha", str.substring(0, 1).toUpperCase() + str.substring(1));
		
		 * */
		Date fecha = new Date();
		SimpleDateFormat diaString = new SimpleDateFormat("EEEE", new Locale("en"));
		String diaStrings = diaString.format(fecha);
		diaStrings = upperString(diaStrings);
		
		SimpleDateFormat mesString = new SimpleDateFormat("MMMM", new Locale("en"));
		String mesStrings = mesString.format(fecha);
		mesStrings = upperString(mesStrings);
		
		SimpleDateFormat annoString = new SimpleDateFormat("yyyy");
		String annoStrings = annoString.format(fecha);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		int month = cal.get(Calendar.MONTH);
		
		String fechaFinal = diaStrings + ", the " +month+" of "+ mesStrings + ", " + annoStrings;
		model.addAttribute("fecha", fechaFinal);
		return "Date.jsp";
	}
	
	public String upperString(String fecha) {
		return fecha.substring(0,1).toUpperCase() + fecha.substring(1).toLowerCase();
	}
	
	
	
	@RequestMapping("/time")
	public String hora(Model modelo) {
		Date fecha = new Date();
		SimpleDateFormat horaString = new SimpleDateFormat("hh:mm aa");
		String horaStrings = horaString.format(fecha).replace(".", "").toUpperCase();
		modelo.addAttribute("hora", horaStrings);
		return "Time.jsp";
	}
	
	
	@RequestMapping("/index")
    public String index() {
        return "index.jsp";
    }
	
}
