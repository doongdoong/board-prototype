package com.ssafy.prj.board.ui;

import com.ssafy.prj.board.dao.BoardDAO;

public class DeleteBoardUI extends BaseUI {
	private BoardDAO dao;

	public DeleteBoardUI(BoardDAO dao) {
		this.dao = dao;
	}
	
	public void service() {
		dao.deleteBoard(getInt("삭제할 번호: "));
	}
}
