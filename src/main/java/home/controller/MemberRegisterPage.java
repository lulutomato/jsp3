package home.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mybatis.dao.MybatisCustomerDao;
import mybatis.dto.mybatisCustomerDto;

public class MemberRegisterPage implements Controller {
   
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String customId = request.getParameter("userid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		
		MybatisCustomerDao dao = new MybatisCustomerDao();
		int result = dao.insert(new mybatisCustomerDto(
				customId,name,email,age,null
						));
		if (result == 1) {
			response.sendRedirect("list");
		}
		
	}
}
