package yggl.com.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import yggl.com.dao.EmployeeDao;
import yggl.com.model.EmployeeModel;


@Controller
@RequestMapping("/employee")
public class EmployeeAction {

	
	@Autowired
	private EmployeeDao dao;
	
	
	@RequestMapping("/getAll")
	public String getAllList(Map<String,Object> result){
		List<EmployeeModel> list = dao.findAllEmployees();
		result.put("list",list);
		return "/list";
	}
	
	@RequestMapping("/save")
	public String  sava(@ModelAttribute EmployeeModel mode){
		if(dao.save(mode)>0){
			return "redirct:/employee/getAll.html";
		}
		return "error.jsp";
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam("id") String id,@ModelAttribute EmployeeModel mode){
		if(id!=null){
			dao.update(id,mode);
			return "redirct:/employee/getAll.html";
		}
		return "error.jsp";
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") String id){
		dao.delete(id);
		return "redirct:/employee/getAll.html";
	}
}
