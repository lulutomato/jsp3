package mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import mybatis.SqlSessionBean;
import mybatis.dto.mybatisCustomerDto;

public class MybatisCustomerDao {
	private SqlSessionFactory sessionFactory = SqlSessionBean.getSessionFactory();
	
	public List<mybatisCustomerDto> selectAll(){
		SqlSession sqlSession = sessionFactory.openSession();
		List<mybatisCustomerDto> list = sqlSession.selectList("tblcustomer.selectAll");
		sqlSession.close();
		return list;
	}
	public int insert(mybatisCustomerDto dto) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.insert("tblcustomer.insert",dto);
		sqlSession.commit();
		sqlSession.close();
		return result;		
	}
	public int update(mybatisCustomerDto dto) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.insert("tblcustomer.update",dto);
		sqlSession.commit();
		sqlSession.close();
		return result;		
	}
	public int delete(String customerId) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.delete("tblcustomer.delete",customerId);
		sqlSession.commit();
		sqlSession.close();
		return result;
		
		
	}
	
	
	
	
	
}
