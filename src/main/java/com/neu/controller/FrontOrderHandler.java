package com.neu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neu.po.OrderVO;
import com.neu.service.FrontOrderService;

@Controller
public class FrontOrderHandler
{
	  @Autowired
	  FrontOrderService frontorderService;
	  
	  @RequestMapping(value = "/front/ajaxallorder")
	  @ResponseBody
	  public List<OrderVO> findAllorder()
	  {
		  System.out.println("....servlet....findAllorder()......");
		  return frontorderService.findAllorder();
      }
	  

}
