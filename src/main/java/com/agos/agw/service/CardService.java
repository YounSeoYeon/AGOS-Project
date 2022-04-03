package com.agos.agw.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agos.agw.dao.ICardDAO;
import com.agos.agw.model.CardVO;

@Service
public class CardService implements ICardService {
	@Autowired
	ICardDAO dao;
	
	// ī�� ��� ��������	
	@Override
	public ArrayList<CardVO> getCardList() {
		return dao.getCardList();
	}
	
	// ī�� ���� �ߺ� üũ
	@Override
	public int checkCardIndex(String index) {
		return dao.checkCardIndex(index);
	}

	// ī�� ���� ���
	@Override
	public void insertCard(CardVO cardVO) {
		dao.insertCard(cardVO);
	}

}
