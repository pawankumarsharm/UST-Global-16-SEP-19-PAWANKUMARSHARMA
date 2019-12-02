package com.ustglobal.retailermanagementsystemspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.retailermanagementsystemspringmvc.dto.OrderBean;
import com.ustglobal.retailermanagementsystemspringmvc.dto.ProductBean;
import com.ustglobal.retailermanagementsystemspringmvc.dto.RetailBean;
import com.ustglobal.retailermanagementsystemspringmvc.service.RetailService;

@Controller
public class RetailController {
	@Autowired
	private RetailService service;
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor=new CustomDateEditor(format,true);
		binder.registerCustomEditor(Date.class,editor);
	}
	@GetMapping("/createprofile")
	public String createProfile() {
		return "createprofile";
	}// end of login page
	
	@PostMapping("/createprofile")
	public String register(RetailBean bean, ModelMap map) {
		boolean check = service.createProfile(bean);
		if (check==true) {
			map.addAttribute("msg", "You are Registered and Id is" + check);
		} else {
			map.addAttribute("msg", "Email is Repeated");
		}
		return "login";
	}// end of register
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}// end of login page

	@PostMapping("/login")
	public String login(int id, String password, HttpServletRequest request) {
		RetailBean bean = service.login(id, password);
		if (bean == null) {
			request.setAttribute("msg", "Invalid Credential");
			return "login";
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}// end of login
	
	@GetMapping("/search")
	public String search(@RequestParam("pid") int id, ModelMap map) {
		OrderBean bean = service.searchProduct(id);
		if (bean == null) {
			map.addAttribute("msg", "Data Not Found");
		} else {
			map.addAttribute("bean", bean);
		}
		return "home";
	}// end of search()
	
	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest request) {
		HttpSession session=request.getSession(false);
		if(session!=null) {
		return "changepassword";
		}else {
			return "login";
		}
	}//end of changepassword()
	
	@PostMapping("/changepassword")
	public String changepassword(String password,String confirmpassword,
			@SessionAttribute(name="bean")RetailBean bean, ModelMap map) {
		if(password.equals(confirmpassword)) {
			service.updatePassword(bean.getRid(),password);
			map.addAttribute("msg", "password changed");
		}else {
			map.addAttribute("msg","password not matching");
		}
		return "home";
	}//end of changepassoword()
}
