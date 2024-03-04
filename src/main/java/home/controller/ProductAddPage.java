package home.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mybatis.dao.MybatisProductDao;
import mybatis.dto.ProductDto;

public class ProductAddPage implements Controller  {
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String pcode = request.getParameter("pcode");
		String category = request.getParameter("category");
		String pname = request.getParameter("pname");
		int price = Integer.parseInt(request.getParameter("price"));
		
		MybatisProductDao dao = new MybatisProductDao();
		int result = dao.insert(new ProductDto(
				pcode,category,pname,price
				));
		if (result == 1) {
			response.sendRedirect("searchlist");
		}
	}

}
