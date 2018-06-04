package com.example.demo;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

	@GetMapping("/test/{biaoji}")
	public String test(String biaoji) {
		Date d=new Date();
		System.out.println(d);
		try {
			//有—
			String[] str=biaoji.split("-");
			String a=str[0];
			switch (a) {
			case "0":
				System.out.println("0");
				break;
			case "1":
				System.out.println("1");
				break;
			case "2":
				System.out.println("2");
				break;
			case "3":
				System.out.println("3");
				break;
			case "4":
				System.out.println("5");
				break;
			default:
				System.out.println("0");
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "test";
	}
}
