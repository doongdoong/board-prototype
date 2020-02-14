package com.ssafy.prj.util;

import java.util.Arrays;

import com.ssafy.prj.board.vo.Board;

public class ArrayList extends List {
	private Object[] list = new Object[2];
	private int pos = 0;
	
	// 데이터 추출 메서드
	public Object get(int index) {
		return list[index];
	}
	
	// 데이터 입력 메서드
	public void add(Object obj) {
//		if(list.length == pos) {
//			list = Arrays.copyOf(list, pos * 2);
//		}
//		list[pos++] = obj;
		add(pos, obj);
	}
	
	public void add(int index, Object obj) {
		if(list.length == pos) {
			list = Arrays.copyOf(list, pos * 2);
		}
		
		int moveCnt = pos - index;
		
		if(moveCnt > 0) {
			System.arraycopy(list, index, list, index + 1, moveCnt);
		}
		
		list[index] = obj;
		pos++;
	}
	
	// 전체 데이터 삭제
	public void clear() {
		for(int i = 0 ; i < pos; i++) {
			list[i] = null;
		}
		
		pos = 0;
	}
	
	// [..., ..., ...]
	public String toString() {
		if(pos == 0) return "[]";
		
		StringBuilder sb = new StringBuilder("[" + list[0]);
		
		for(int i = 1; i < pos; i++) {
			sb.append(", " + list[i]);
		}
		
		sb.append("]");
		
		return sb.toString();
	}
	
	// 크기
	public int size() {return pos;}
	
	// 데이터 삭제
	public Object remove(int index) {
		Object prevObj = list[index];
		int moveCnt = pos - (index + 1);
		
		if(moveCnt > 0) {
			System.arraycopy(list, index + 1, list, index, moveCnt);
		}
		list[--pos] = null;
		
		return prevObj;
	}
	
	/* equals()를 재정의해서 처리해야 함.
	public void remove(Object obj) {
		
	}
	*/
	
	// 데이터 존재 여부
	public boolean isEmpty() {
		return pos == 0;
	}
}
