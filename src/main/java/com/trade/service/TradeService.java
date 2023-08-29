package com.trade.service;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trade.entity.Trade;
import com.trade.repo.TradeRepo;

@Service
public class TradeService {

	@Autowired
	TradeRepo repo;
	
	public Trade processXMLFile(File xmlFile) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Trade.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Trade trade = (Trade) unmarshaller.unmarshal(xmlFile);

            return repo.save(trade);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
