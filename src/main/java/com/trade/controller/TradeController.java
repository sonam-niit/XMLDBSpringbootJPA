package com.trade.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trade.entity.Trade;
import com.trade.service.TradeService;

@RestController
public class TradeController {

	@Autowired
	private TradeService service;
	
	@GetMapping("/savetrade")
	public String saveTrade() {
		Trade t=service.processXMLFile(new File("D:\\trade.xml"));
		if(t!=null){
			return "SUCCESS";
		}else
			return "ERROR";
	}
}
