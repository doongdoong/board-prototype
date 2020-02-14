package com.ssafy.prj.board.ui;

import java.util.Scanner;

import com.ssafy.prj.board.dao.BoardDAO;
import com.ssafy.prj.util.PrintUtil;

public class BoardUI {
	private Scanner sc = new Scanner(System.in);
	private BoardDAO dao = new BoardDAO();
	
	public void service() {
		System.out.println("게시판 관리 프로그램");
		
		while(true) {
			BaseUI ui = null;
			switch(menu()) {
			case 1: ui = new ListBoardUI(dao); break;
			case 2: ui = new DetailBoardUI(dao); break;
			case 3: ui = new WriteBoardUI(dao); break;
			case 4: ui = new UpdateBoardUI(dao); break;
			case 5: ui = new DeleteBoardUI(dao); break;
			case 0:
				exitBoard();
				break;
			}
			
			if(ui != null) {
				ui.service();
			}
		}
	}

	private int menu() {
		PrintUtil.print();
		System.out.println("1. 전체 조회");
		System.out.println("2. 글번호 조회");
		System.out.println("3. 등록");
		System.out.println("4. 수정");
		System.out.println("5. 삭제");
		System.out.println("0. 종료");
		PrintUtil.print();
		System.out.print("메뉴 : ");
		
		return Integer.parseInt(sc.nextLine());
	}
	
	private void exitBoard() {
		System.out.println("게시글 관리 프로그램을 종료합니다.");
		System.exit(0);
	}
}
