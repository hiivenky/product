package com.cg.springmvcdemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvcdemo.dto.Product;
import com.cg.springmvcdemo.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String homePage() {
		return "home";
	}
	@RequestMapping(value="/addpage",method=RequestMethod.GET)
	public String addProduct(@ModelAttribute("myForm") Product pro,
			Map<String,Object> model){
		
		List<String> types = new ArrayList<String>();
		types.add("SELECT");
		types.add("ELEC");
		types.add("Grocery");
		types.add("Home app");
		model.put("dataitem",types);
		return "AddProduct";
	}
	@RequestMapping(value="/pagesubmit",method=RequestMethod.POST)
	public String addData(@Valid@ModelAttribute("myForm") Product pro,
			BindingResult result,Map<String,Object> model) {
		if(result.hasErrors()) {
			List<String> types = new ArrayList<String>();
			types.add("SELECT");
			types.add("ELEC");
			types.add("Grocery");
			types.add("Home app");
			model.put("dataitem",types);
			return "AddProduct";
		}
		service.addProduct(pro);
		System.out.println(service.showProducts());
		return "home";
	}
	@RequestMapping(value="/showall",method=RequestMethod.GET)
	public ModelAndView getAllData() {
		
		List<Product> myList = service.showProducts();
		return new ModelAndView("showProduct","data",myList);
	}
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String deletePage() {
		return "DeleteProduct";
	}
	@RequestMapping(value="/deletedata",method=RequestMethod.POST)
	public String deleteData(@RequestParam("pid") int prodId) {
		service.remove(prodId);
		return "redirect:/showall";
	}
	@RequestMapping(value="/search",method=RequestMethod.GET)
	public String searchPage() {
		return"/searchData";
	}
	@RequestMapping(value="/searchproduct",method=RequestMethod.POST)
	public ModelAndView searchProduct(@RequestParam("pid") int prodId) {
		Product product=service.searchProduct(prodId);
		List<Product> products = new ArrayList<Product>();
		products.add(product);
		return new ModelAndView("showProduct","data",products);
	}
	

}
