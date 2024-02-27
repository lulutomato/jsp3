package home.controller;

import java.util.HashMap;
import java.util.Map;



public class RequestControllerMapping {
//key 는 url, method 로 구성된 requestMap객체,value는 Controller
	
	
	private static final Map<RequestMap,Controller> mapping = new HashMap<>();
	
	public static void init() {
		mapping.put(new RequestMap("/member/list","GET"),new MemberList());
		mapping.put(new RequestMap("/member/register","GET"),new MemberRegister());
		mapping.put(new RequestMap("/product/searchlist","GET"),new ProductList());
		mapping.put(new RequestMap("/product/add","GET"),new ProductAdd());
		
	}
	public static Controller getController(RequestMap key) {
		return mapping.get(key);
	}
}
