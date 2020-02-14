package com.ssafy.prj.board.ui;

import com.ssafy.prj.board.dao.BoardDAO;
import com.ssafy.prj.board.vo.Board;

public class WriteBoardUI extends BaseUI {
	private BoardDAO dao;
	
	public WriteBoardUI(BoardDAO dao) {
		this.dao = dao;
	}
	
	public void service() {
		//Chaining
		dao.insertBoard(new Board()
				.setTitle(getString("제목: "))
				.setWriter(getString("작성자: "))
				.setContent(getString("내용: "))
				);
		
		System.out.println("게시글이 등록되었습니다.");
	}
}
