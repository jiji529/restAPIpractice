package com.dahami.www.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dahami.www.BoardVO;

@Repository
public class BoardDao {
	
	@Autowired
	SqlSession sql;

	public List<BoardVO> getBoardList() {
		
		return sql.selectList("board.getList");
	}
	
	public BoardVO getBoardById(Integer boardId) {
		
		return sql.selectOne("board.getOne", boardId);
	}

	public int postBoard(BoardVO boardVo) {
		
		return sql.insert("board.postBoard", boardVo);
	}

	public int updateBoard(BoardVO boardVo) {

		return sql.update("board.updateBoard", boardVo);
	}

	public int updateBoardPart(BoardVO boardVo) {
		return sql.update("board.updateBoardPart", boardVo);
	}

	public int deleteBoard(Integer boardId) {
		return sql.delete("board.deleteBoard", boardId);
		
	}

}
