package com.DevRohit.SpringSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
	
	@GetMapping("/myNotices")
	public String getNoticeDetails() {
		return "Here are the Notice details from DB";
	}


}
