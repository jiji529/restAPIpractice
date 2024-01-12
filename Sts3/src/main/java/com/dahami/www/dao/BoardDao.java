package com.dahami.www.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dahami.www.BoardVO;

@Repository
public class BoardDao {
	
	@Autowired
	SqlSession sql;

	public BoardVO getBoardById(String boardId) {
		
		System.out.println("Dao : " + boardId);

		return sql.selectOne("board.getOne", boardId);
	}



}
