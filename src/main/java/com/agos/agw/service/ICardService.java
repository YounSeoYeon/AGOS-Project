package com.agos.agw.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.agos.agw.model.CardVO;

@Service
public interface ICardService {
	public ArrayList<CardVO> getCardList(int card_type); 	// 카드 목록 가져오기
	public int checkCardIndex(String index); 				// 카드 계정 중복 체크
	public void insertCard(CardVO cardVO);					// 카드 계정 추가
	CardVO getCardInfo(String card_idx);					// 카드 정보 기져오기
}
