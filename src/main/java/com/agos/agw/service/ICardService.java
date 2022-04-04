package com.agos.agw.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.agos.agw.model.CardVO;

@Service
public interface ICardService {
	public ArrayList<CardVO> getCardList(int card_type); 	// ī�� ��� ��������
	public int checkCardIndex(String index); 				// ī�� ���� �ߺ� üũ
	public void insertCard(CardVO cardVO);					// ī�� ���� �߰�
	CardVO getCardInfo(String card_idx);					// ī�� ���� ��������
}
