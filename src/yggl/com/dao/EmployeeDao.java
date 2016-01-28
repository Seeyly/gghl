package yggl.com.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import yggl.com.model.EmployeeModel;
import yggl.com.utils.CommonUtils;


@Repository
public class EmployeeDao {

	private static Map<String,EmployeeModel> param = null;
	private static List<EmployeeModel> paramList = null;
	static{
		
		param = new HashMap<String,EmployeeModel>();
		paramList = new ArrayList<EmployeeModel>();
		try {
			param.put("1",new EmployeeModel("01","小名","男","13956979293","3411251889895","打球",new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-20")));
			param.put("2",new EmployeeModel("02","小花","男","13956979293","3411251889894","玩水",new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-21")));
			param.put("3",new EmployeeModel("03","小鸟","男","13956979293","3411251889893","吃喝",new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-22")));
			param.put("4",new EmployeeModel("04","小未","男","13956979293","3411251889892","上网",new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-23")));
			param.put("5",new EmployeeModel("05","张三","女","1395690000","34112518898911","化妆",new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-24")));
			param.put("6",new EmployeeModel("06","李四","男","13956979293","3411251889895","唱歌",new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-25")));
			param.put("7",new EmployeeModel("07","网易","男","13956979293","3411251889896","跳舞",new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-26")));
		
		
		
			
			paramList.add(new EmployeeModel("01","小名","男","13956979293","3411251889895","打球",new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-20")));
			paramList.add(new EmployeeModel("01","小名","男","13956979293","3411251889895","打球",new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-20")));
			paramList.add(new EmployeeModel("01","小名","男","13956979293","3411251889895","打球",new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-20")));
			paramList.add(new EmployeeModel("01","小名","男","13956979293","3411251889895","打球",new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-20")));
			paramList.add(new EmployeeModel("01","小名","男","13956979293","3411251889895","打球",new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-20")));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public List<EmployeeModel> findAllEmployees() {
		
		return paramList;
		//return (List<EmployeeModel>)param.values();
	}

	@Transactional(readOnly=false,propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
	public Integer save(EmployeeModel model) {
		
		paramList.add(model);
	//	param.put(CommonUtils.UUIDGenerator(), model);
		return 1;
	}
	@Transactional(readOnly=false,propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
	public void delete(String id){
		EmployeeModel model=null;
		for(int i=0;i<paramList.size();i++){
			model = paramList.get(i);
			if(model!=null&&model.getId().equals(id)){
				paramList.remove(i);
				
			}
		}
	}
	@Transactional(readOnly=false,propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
	public void update(String id, EmployeeModel mode){
		EmployeeModel Emplyeemodel=null;
		for(int i =0;i<paramList.size();i++){
			Emplyeemodel = paramList.get(i);
			if(Emplyeemodel!=null&&Emplyeemodel.getId().equals(id)){
				Emplyeemodel = mode;
			}
		}
	}
	 
	private EmployeeModel findById(String id){
		EmployeeModel model = null;
		for(int i =0;i<paramList.size();i++){
			model = paramList.get(i);
			if(model!=null&&model.getId().equals(id)){
				return model;
				
			}
		}
		return model;
	}
	

}
