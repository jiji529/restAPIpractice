package com.dahami.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dahami.www.BoardVO;
import com.dahami.www.dao.BoardDao;

@Service
public class BoardService {
	
	@Autowired
	private BoardDao boardDao;
	
	//게시글 목록 가져오기.
	public List<BoardVO> boardList() {

		return boardDao.getBoardList();
	}

	//상세 게시글 가져오기
	public BoardVO boardOne(Integer boardId) {

		return boardDao.getBoardById(boardId);
	}

	//게시글 올리기
	public void postBoard(BoardVO boardVo) {
		
		boardDao.postBoard(boardVo);
		
	}

	//게시글 수정하기(전체) -> put
	public void updateBoard(BoardVO boardVo) {
		
		boardDao.updateBoard(boardVo);
		
	}

	//게시글 수정하기(부분) -> patch
	public void updateBoardPart(BoardVO boardVo) {
		boardDao.updateBoardPart(boardVo);
		
	}

	//게시글 삭제하기
	public void deleteBoard(Integer boardId) {
		boardDao.deleteBoard(boardId);
		
	}

}
