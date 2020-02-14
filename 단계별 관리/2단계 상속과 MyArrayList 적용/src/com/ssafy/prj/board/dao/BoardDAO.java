package com.ssafy.prj.board.dao;

import com.ssafy.prj.board.vo.Board;
import com.ssafy.prj.util.ArrayList;
import com.ssafy.prj.util.List;

//Select, Insert, Update, Delete
public class BoardDAO {
	List list = new ArrayList();
	private int boardNo = 0;
	
	public List selectBoard() {
		return list;
	}
	
	public Board selectOneBoard(int no) {
		for(int i = 0; i < list.size(); i++) {
			Board board = (Board) list.get(i);
			
			if(board.getNo() == no) {
				board.setViewCnt(board.getViewCnt() + 1);
				return board;
			}
 		}
		
		return null;
	}
	
	public void insertBoard(Board board) {
		board.setNo(++boardNo);
		list.add(board);
	}
	
	public void updateBoard(Board board) {
		for(int i = 0 ; i < list.size(); i++) {
			Board b = (Board) list.get(i);
			
			if(b.getNo() == board.getNo()) {
				b.setTitle(board.getTitle());
				b.setContent(board.getContent());
				
				System.out.println("게시글이 수정되었습니다.");
				
				return;
			}
		}
		System.out.println(board.getNo() + "번 게시물은 없는 번호입니다.");
	}
	
	public void deleteBoard(int no) {
		for(int i = 0 ; i < list.size(); i++) {
			Board board = (Board) list.get(i);
			
			if(board.getNo() == no) {
				list.remove(i);
				
				System.out.println("게시글이 삭제되었습니다.");
				
				return;
			}
		}
		System.out.println(no + "번 게시물은 없는 번호입니다.");
	}
}
