package com.myweb.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.board.model.BoardDAO;
import com.myweb.board.model.BoardVO;

public class UpdateServiceImpl implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		/*
		 * 1.UpdateServiceImpl을 생성
		 * 2. 서비스 영역에서 num, title,content을 받아서 update() 메서드를 실행
		 * 3. DAO update() 에서는 update구문으로 데이터를 수정
		 * 4.페이지 이름을 상세보기화면으로 연결(단, 필요한 값을 전달해야함)
		 * 
		 * sql = "update board set title =?, content=?, where num=?"
		 * */
		String num = request.getParameter("num");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		BoardDAO dao = BoardDAO.getInstance();
		dao.update(num, title, content);
		
	}

}
