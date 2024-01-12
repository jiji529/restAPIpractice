package com.dahami.www.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dahami.www.BoardVO;
import com.dahami.www.dao.BoardDao;

@Service
public class BoardService {
	
	@Autowired
	private BoardDao boardDao;

	public BoardVO boardOne(String boardId) {
		
		System.out.println("service : " + boardId);

		return boardDao.getBoardById(boardId);
	}

}
