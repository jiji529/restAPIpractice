package com.dahami.www;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dahami.www.service.BoardService;

@RestController
@RequestMapping("/board")
public class BoardController {
	
	@Autowired 
	private BoardService boardService;
	
	@GetMapping("/{boardId}")
	public BoardVO boardOne(@PathVariable String boardId) { //url로 받은 글 번호
		
		System.out.println("머야? : " + boardId);
		
		BoardVO board = boardService.boardOne(boardId);
		
		return board;
	}
		
}
		


	


