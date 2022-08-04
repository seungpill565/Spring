package com.ezen.springmvc.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.springmvc.model.Coffee;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RequestMapping(value = {"/hello","/hi","/welcome"})
@Controller
public class HelloController {
	
	@RequestMapping(value = {"/news"},
			method = {RequestMethod.GET,RequestMethod.POST})
	public String news() {
		log.info("���� ��Ʈ�ѷ����� �� ������");
		
		//�������� ����ڿ��� �������� �� view�� �̸��� ���ڿ��� �����Ѵ�.
		//������ ���ڿ� �տ��� /WEB-INF/views/ �� �ٰ�
		//�ڿ��� .jsp�� �پ ���� ���� ��θ� �ϼ��Ѵ�
		return "hello/news";
	}
	
	@GetMapping("/blog")
	public String blog() {
		return "hello/blog";
		
	}
	
	
	@GetMapping("/coffee/add")
	public String coffeeAddForm() {
		return "coffee/addMenu";
	}
	
	@PostMapping("/coffee/add1")
	public String coffeeAdd1(HttpServletRequest request,
				HttpServletResponse resp)
			throws UnsupportedEncodingException {
		request.setCharacterEncoding("EUC-KR");
		log.info("coffee add1(�ڵ����� ���ε��� ������� ����)");
		
		log.info("coffee name:" + request.getParameter("name"));
		log.info("coffee price:" + request.getParameter("price"));
		log.info("coffee hot:" + request.getParameter("hot"));
		
		request.setAttribute("coffee", new Coffee(
					request.getParameter("name"),
				Integer.parseInt(request.getParameter("price")),
				Boolean.parseBoolean(request.getParameter("hot"))
				));
		return "home";
	}
	
	@PostMapping("/coffee/add2")
	public String coffeeAdd2(Coffee coffee)
			throws UnsupportedEncodingException {
		log.info("coffee �����Ͱ� �����ϴ°�");
		log.info(coffee);
		
		if(coffee.isHot()) {
			log.info("�߰ſ� Ŀ�ǰ� �߰��Ǿ����ϴ�.");
		}else {
			log.info("������ Ŀ�ǰ� �߰��Ǿ����ϴ�.");
		}

		return "home";
	}
	
	@PostMapping("/coffee/add3")
	public String coffeeAdd3(
			@ModelAttribute("name") String name,
			@ModelAttribute("price") Integer price,
			@ModelAttribute("hot") Boolean hot) {
		
		log.info("name"+ name);
		log.info("price: "+ price);
		log.info("hot:"+hot);
		
		return "home";
	}
	
	@RequestMapping(value = "/garden",method = RequestMethod.GET)
	public void  garden() {
		log.info("garden controller");
	}
	
	@GetMapping(value= "/redirect")
	public String redirect() {
		return "redirect:/hello/coffee/add";
		
	}

}
