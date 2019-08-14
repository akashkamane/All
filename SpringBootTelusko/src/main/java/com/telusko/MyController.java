package com.telusko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("Index")
	public String bgu() {
		System.out.println("how are you");
		return("Index");
	}
}
