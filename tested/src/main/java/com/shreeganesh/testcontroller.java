package com.shreeganesh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testcontroller {

	@ResponseBody
	@RequestMapping("/tested")
	public String getCricketBat() {
		return "Yeh le bat ...... par first batting meri"; 
	}
}
