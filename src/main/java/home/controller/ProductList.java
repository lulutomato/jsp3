package home.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mybatis.dao.MybatisProductDao;
import mybatis.dto.CateDto;
import mybatis.dto.ProductDto;



public class ProductList implements Controller {
   @Override
   public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String category = request.getParameter("category");
      String pname = request.getParameter("pname");
      String from = request.getParameter("from");
      String to = request.getParameter("to");
      String column = request.getParameter("column");
      ;
      Map<String, Object> map = new HashMap<>();
      if (category != null && category.isEmpty() == false) {
         map.put("category", category);
         request.setAttribute("category", category);
      }
      if (pname != null && pname.isEmpty() == false) {
         map.put("pname", pname);
         request.setAttribute("pname", pname);
      }
      if (
         from != null && from.isEmpty() == false &&
         to != null && !to.isEmpty()
      ) {
         map.put("from", from);
         map.put("to", to);
      }
      if (column != null && column.isEmpty() == false) {
         map.put("column", column);

         String desc = request.getParameter("desc");
         if (desc != null && desc.equals("true")) {
            map.put("desc", desc);
         }
      }
      
        MybatisProductDao dao = new MybatisProductDao();
       List<ProductDto> list = dao.search(map);
       request.setAttribute("list", list);
      
//      List<CateDto> categoryList = dao.selectByCategory();
//      request.setAttribute("categoryList", categoryList);

      RequestDispatcher dispatcher = request.getRequestDispatcher("searchlist.jsp");
      dispatcher.forward(request, response);
   }
}