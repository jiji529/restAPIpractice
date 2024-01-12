package com.dahami.www;

import java.util.Date;

public class BoardVO {
	private int boardId;
	private String boardSj;
	private String boardCn;
	private String userNm;
	private Date frstRegistPnttm;
	private String boardUseYn;
	
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getBoardSj() {
		return boardSj;
	}
	public void setBoardSj(String boardSj) {
		this.boardSj = boardSj;
	}
	public String getBoardCn() {
		return boardCn;
	}
	public void setBoardCn(String boardCn) {
		this.boardCn = boardCn;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public Date getFrstRegistPnttm() {
		return frstRegistPnttm;
	}
	public void setFrstRegistPnttm(Date frstRegistPnttm) {
		this.frstRegistPnttm = frstRegistPnttm;
	}
	public String getBoardUseYn() {
		return boardUseYn;
	}
	public void setBoardUseYn(String boardUseYn) {
		this.boardUseYn = boardUseYn;
	}
	
}
