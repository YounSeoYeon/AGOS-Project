package com.agos.agw.dao;

import java.util.ArrayList;

import com.agos.agw.model.CardVO;

public interface ICardDAO {
	public ArrayList<CardVO> getCardList();		// ī�� ��� ��������
	public int checkCardIndex(String index); 	// ī�� ���� �ߺ� üũ
	public void insertCard(CardVO cardVO);		// ī�� ���� �߰�
}
