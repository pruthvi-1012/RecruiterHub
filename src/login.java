import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transaction;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;
import org.hibernate.classic.Session;
import org.omg.CORBA.Request;

import Pojo.AppRegPojo;
import Pojo.loginpojo;

import com.controller.HibernateUtils;
import com.opensymphony.xwork2.ActionSupport;


public class login extends ActionSupport implements ServletRequestAware,SessionAware,ServletResponseAware,ServletContextAware
{
	HttpServletRequest request;
	HttpServletResponse response;
	
	int age,pincode,mark,contact;
	String name,address,username,password,gender,city,country,branch,college,degree,state,email;
	Date dob;
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
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	List<loginpojo> l;
	List<AppRegPojo> a;
	public List<AppRegPojo> getA() {
		return a;
	}
	public void setA(List<AppRegPojo> a) {
		this.a = a;
	}
	
	ServletContext context;
	private Map sessionMap;
	public Map getSessionMap() {
		return sessionMap;
	}
	public void setSessionMap(Map sessionMap) {
		this.sessionMap = sessionMap;
	}
	public HttpServletResponse getResponse() {
		return response;
	}
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	public ServletContext getContext() {
		return context;
	}
	public void setContext(ServletContext context) {
		this.context = context;
	}
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public List<loginpojo> getL() {
		return l;
	}
	public void setL(List<loginpojo> l) {
		this.l = l;
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


	 

	
/*	public String execute() throws Exception{
		
		org.hibernate.Session Session= HibernateUtils.getSession();
		org.hibernate.Transaction tx=Session.beginTransaction();
		
		l= Session.createQuery("from loginpojo l where l.username='"+username+"' and l.password='"+password+"'").list();
		System.out.println(l.size());
		
		if(l.size()>0)

	{ 
			return("SUCCESS");
			
	}
		else {
			return("Error");
		}
	}*/
	
	public String insertdata() throws Exception{
		org.hibernate.Session Session= HibernateUtils.getSession();
		org.hibernate.Transaction tx=Session.beginTransaction();
		
		loginpojo lo=new loginpojo();
		
		lo.setUsername(username);
		lo.setPassword(password);
		
		Session.save(lo);
		tx.commit();
		
		return(SUCCESS);
		
		
		
		
	}
	
	
	
	
	

	
	
	
	public String insertdata1() throws Exception
	 {
		 org.hibernate.Session session=HibernateUtils.getSession();
			org.hibernate.Transaction tx= session.beginTransaction();
			
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
		public String name() throws Exception{
			
			org.hibernate.Session sess=HibernateUtils.getSession();
			org.hibernate.Transaction tx=sess.beginTransaction();
			a =sess.createQuery("from AppRegPojo").list();
			HttpSession session=request.getSession();
			session.setAttribute(name, l.get(0));
			
			return SUCCESS;
			
		}
		
		public String login() throws Exception {
			org.hibernate.Session Session= HibernateUtils.getSession();
			org.hibernate.Transaction tx=Session.beginTransaction();
			
			
			
			
			
			String referrer = request.getHeader("referer");
			
			if (referrer != null && username.length() > 0 && password.length() > 0)
			{
				int onlineUserCount = 0;
				synchronized (context)
				{ 
					try 
					{
						onlineUserCount = (Integer) context .getAttribute("onlineUserCount");
						l= Session.createQuery("from loginpojo l where l.username='"+username+"' and l.password='"+password+"'").list();
						System.out.println(l.size());
						
						if(l.size()>0)

					{ 
							return SUCCESS;
							
						
					}
						else if(username.equals("admin") && password.equals("admin"))
								{
							return ("admin");
						}
						else if(username.equals("hr1") && password.equals("hr1"))
						{
							return ("hr");
						}
						else if(username.equals("hr2")&& password.equals("hr2"))
						{
							return ("hr");
						}
						else if(username.equals("tech1") && password.equals("tech1"))
						{
							return("tech");
						}
						else if(username.equals("tech2") && password.equals("tech2"))
						{
							return("tech");
						}
						else
						{
							return ERROR;
						}
						}
					catch (Exception e) 
					{
						
					}
					
					context.setAttribute("onlineUserCount", onlineUserCount + 1); 
					}
				return "success";
			}
			else{
				return ERROR;
			}
		
		
		
		}	
		
		
		
		
		
		
		
		
	@Override
	public void setServletRequest(HttpServletRequest req) {
		// TODO Auto-generated method stub
		this.request=req;
	}
	@Override
	public void setSession(Map map) {
		// TODO Auto-generated method stub
	this.sessionMap=map;
	}
	@Override
	public void setServletResponse(HttpServletResponse res) {
		// TODO Auto-generated method stub
		this.response=res;
	}
	@Override
	public void setServletContext(ServletContext cxt) {
		// TODO Auto-generated method stub
		this.context=cxt;
		
	}
	
	}

