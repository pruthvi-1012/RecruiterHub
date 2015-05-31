import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;

import java.util.Date;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;

import Pojo.AppRegPojo;
import Pojo.loginpojo;

import com.controller.HibernateUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;


public class AppReg extends ActionSupport implements ServletRequestAware{
	private HttpServletRequest request;
	private HttpServletRequest response;
	
	
	int age,pincode,mark,contact;
	String name,address,username,password,gender,city,country,branch,college,degree,state,email;
	Date dob;
	
	
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
 public String insertdata() throws Exception
 {
	 Session session=HibernateUtils.getSession();
		Transaction tx= session.beginTransaction();
		
		AppRegPojo p=new AppRegPojo();
		
		p.setUsername(username);
		p.setPassword(password);
		p.setName(name);
		p.setGender(gender);
		p.setDob(dob);
		p.setAge(age);
		p.setAddress(address);
		p.setCity(city);
		p.setPincode(pincode);
		p.setState(state);
		p.setCountry(country);
		p.setBranch(branch);
		p.setCollege(college);
		p.setMark(mark);
		p.setDegree(degree);
	    p.setEmail(email);
		p.setContact(contact);
		
		loginpojo l= new loginpojo();
		
		l.setUsername(username);
		l.setPassword(password);
		session.save(l);
		session.save(p);
		tx.commit();
		
		
	 return(SUCCESS);
 }
 
 List<AppRegPojo> info;
 
 public List<AppRegPojo> getInfo() {
	return info;
}
public void setInfo(List<AppRegPojo> info) {
	this.info = info;
}
public String showdata(){
		
		Session session=HibernateUtils.getSession();
		Transaction tx=session.beginTransaction();
		
		info=session.createQuery("from AppRegPojo p").list();
		System.out.println(info.get(0).getAddress());
		System.out.println(info.get(0).getName());
		System.out.println(info.get(0).getGender());
		System.out.println(info.get(0).getAge());
		System.out.println(info.get(0).getAppno());
		System.out.println(info.get(0).getBranch());
		System.out.println(info.get(0).getCity());
		System.out.println(info.get(0).getCollege());
		System.out.println(info.get(0).getContact());
		System.out.println(info.get(0).getCountry());
		System.out.println(info.get(0).getDegree());
		System.out.println(info.get(0).getDob());
		System.out.println(info.get(0).getEmail());
		System.out.println(info.get(0).getPincode());
		System.out.println(info.get(0).getState());
	
		return SUCCESS;
	}
List<AppRegPojo> info1;

public List<AppRegPojo> getInfo1() {
	return info1;
}
public void setInfo1(List<AppRegPojo> info1) {
	this.info1 = info1;
}
/*public String display_apply() throws Exception{
	Session session=HibernateUtils.getSession();
	Transaction tx=session.beginTransaction();
	
	info1= (session.createQuery("from AppRegPojo p where p.name='"+name+"'").list());
	System.out.println(info1.get(0).getAppno());
	System.out.println(info1.get(0).getBranch());
	System.out.println(info1.get(0).getCity());
	System.out.println(info1.get(0).getName());
	session.save(info1);
	tx.commit();
	
	
return SUCCESS;	
}*/


@Override
public void setServletRequest(HttpServletRequest arg0) {
	// TODO Auto-generated method stub
	
}
}