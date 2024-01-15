package com.dahami.www;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dahami.www.service.BoardService;

@RestController //java 객체를 반환해서 json으로 변환 -> pom.xml에서 jacson 라이브러리 등록해야함.
@RequestMapping("/board")
public class BoardController {
	
	@Autowired 
	private BoardService boardService;
	
	@GetMapping("/")
	public List<BoardVO> boardList() {
		
		try {
			List<BoardVO> boards = boardService.boardList();		
			return boards;
			
		} catch (NullPointerException e) {
			System.out.println(e);
			return null;
		}
		
	}
	
	@GetMapping("/{boardId}")
	public BoardVO boardOne(@PathVariable Integer boardId) { //url로 받은 글 번호
		
		try {
			BoardVO board = boardService.boardOne(boardId);		
			return board;
			
		} catch (NullPointerException e) {
			System.out.println(e);
			return null;
		}
	}
	
	@PostMapping("/")
	public void postBoard(@RequestBody BoardVO boardVo) { //json요청을 java객체로 변환
		
		boardVo.setBoardUseYn("Y");
		
		boardService.postBoard(boardVo);	
	}
	
	@PatchMapping("/{boardId}")
	public void updateBoardPart(@PathVariable Integer boardId, @RequestBody BoardVO boardVo) {
		
		boardVo.setBoardId(boardId);
		
		boardService.updateBoardPart(boardVo);
	}
	
	@DeleteMapping("/{boardId}")
	public void deleteBoard(@PathVariable Integer boardId) {
		
		boardService.deleteBoard(boardId);
	}		
}