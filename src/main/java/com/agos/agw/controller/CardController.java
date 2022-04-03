package com.agos.agw.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.agos.agw.model.CardVO;
import com.agos.agw.service.CardService;

@Controller
public class CardController {
	@Autowired
	CardService service;
	
	// ī�� ��� ������
	@RequestMapping("/")
	public String cardInfo(Model model) {
		ArrayList<CardVO> cardList = service.getCardList();
		
		model.addAttribute("cardList", cardList);
		return "cardInfo";
	}
	
	// ī�� ���� ��� ������ 
	@RequestMapping("/insertCardView")
	public String insertCardView() {
		return "insertCard";
	}
	
	// ī�� ���� �ߺ� üũ
	@ResponseBody
	@RequestMapping("/checkCardIndex")
	public int checkCardIndex(@RequestParam("data") String index) {
		int result = service.checkCardIndex(index);		
		return result;
	}
	
	// ī�� ���� ���
	@ResponseBody
	@RequestMapping("/insertCard")
	public String insertCard(CardVO cardVO) {
		service.insertCard(cardVO);
		
		String card_idx = cardVO.getCard_idx();
		return card_idx;
	}
}
