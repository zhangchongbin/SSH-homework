package com.zhbit.bbs.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.apache.struts2.views.velocity.components.SelectDirective;
import org.springframework.web.servlet.HttpServletBean;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.bbs.domain.Stu;
import com.zhbit.bbs.services.StuService;
public class CheckAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private Stu student;
	public StuService getStudentService() {
		return StudentService;
	}
	public void setStudentService(StuService studentService) {
		StudentService = studentService;
	}

	@Resource
	private StuService StudentService;
	public Stu getStudent() {
		return student;
	}
	public void setStudent(Stu student) {
		this.student = student;
	}
	@Override
	public String execute() throws Exception {
			Map session = ActionContext.getContext().getSession();
			Object a=session.get("login");
			System.out.print(a);
			if("".equals(a)||a==null){
				return Action.LOGIN;
			}else{
				return SUCCESS;
			}
	}
	
	public String select(){
		List<Stu> list=new ArrayList<Stu>();
		list=StudentService.searchUser();
		ActionContext.getContext().put("list", list);
		System.out.println(StudentService);
		System.out.println(list);
		return "SELECT";
	}
	public String add(){
		return "ADD";
	}
	public String delete(){
		return "DELETE";
	}
	public String update(){
		return "UPDATE";
	}
	/***************************************/
	public String insert(){
		StudentService.insertUser(student);
		return SUCCESS;
	}
	public void validateinsert() {
		// TODO Auto-generated method stub
		if(!Pattern.compile("^[\u4e00-\u9fa5]{2,4}$").matcher(student.getName().trim()).matches()){		//只能输入2-4个汉字
			this.addFieldError("name", "姓名只能输入2-4个汉字！");
		}
		if(!student.getSex().equals("男")&&!student.getSex().equals("女")){
			this.addFieldError("sex", "性别只能为“男”或“女”！");
		}
	}
	public String updateinfo(){
		StudentService.updateUser(student);
		return SUCCESS;
	}
	public void validateupdateinfo(){
		if(!Pattern.compile("^[\u4e00-\u9fa5]{2,4}$").matcher(student.getName().trim()).matches()){		//只能输入2-4个汉字
			this.addFieldError("name", "姓名只能输入2-4个汉字！");
		}
		if(!student.getSex().equals("男")&&!student.getSex().equals("女")){
			this.addFieldError("sex", "性别只能为“男”或“女”！");
		}
	}
	public String deleteinfo(){
		StudentService.deleteUser(student);
		return SUCCESS;
	}
	public void validatedeleteinfo(){
		if(!Pattern.compile("^[\u4e00-\u9fa5]{2,4}$").matcher(student.getName().trim()).matches()){		//只能输入2-4个汉字
			this.addFieldError("name", "姓名只能输入2-4个汉字！");
		}
	}


	
	
}
