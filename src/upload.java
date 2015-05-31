import org.apache.struts2.interceptor.ServletRequestAware;

import com.controller.HibernateUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.inject.Context;


import Pojo.ResumePojo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class upload extends ActionSupport implements ServletRequestAware{
	
	private File resume;
	private String resumeContentType;
	private String resumeFileName;
	private List<ResumePojo>info;
	String l;
	
	private HttpServletRequest servletRequest;
	public String insert() throws Exception {

		try {
		String filePath = servletRequest.getRealPath("/") ;

		System.out.println("FILEPATH IS::::::"+filePath);
		System.out.println("ImageFileName:::"+resumeFileName);
		System.out.println("Content Type::::"+resumeContentType);

		File fileToCreate = new File(filePath, this.resumeFileName);
		FileUtils.copyFile(this.resume, fileToCreate);

		org.hibernate.Session session=HibernateUtils.getSession();
		Transaction tx=session.beginTransaction();

		ResumePojo u=new ResumePojo();
		u.setResumeFileName(resumeFileName);
		session.save(u);
		tx.commit();
		
		

		
		File outFile=new File("E:\\EclipseProjects\\Pruthvi\\MyProject\\WebContent\\resume\\"+this.resumeFileName);

		
		InputStream inStrm = new FileInputStream(getResume());
		OutputStream outStrm = new FileOutputStream(outFile);

		
		
		System.out.println("FILESIZE IS::"+fileToCreate.length());
		byte[] buf = new byte[100000];

		int len;
		while ((len = inStrm.read(buf)) > 0) {
		outStrm.write(buf, 0, len);
		}


		inStrm.close();
		outStrm.close();

		} catch (Exception e) {

		e.printStackTrace();
		addActionError(e.getMessage());
		return INPUT;
		}
		
		System.out.println(" *************************inside image upload*******************");
		return SUCCESS;
		}
	public File getResume() {
		return resume;
	}
	public void setResume(File resume) {
		this.resume = resume;
	}
	public String getResumeContentType() {
		return resumeContentType;
	}
	public void setResumeContentType(String resumeContentType) {
		this.resumeContentType = resumeContentType;
	}
	public String getResumeFileName() {
		return resumeFileName;
	}
	public void setResumeFileName(String resumeFileName) {
		this.resumeFileName = resumeFileName;
	}
	
	public List<ResumePojo> getInfo() {
		return info;
	}
	public void setInfo(List<ResumePojo> info) {
		this.info = info;
	}
	public String getL() {
		return l;
	}
	public void setL(String l) {
		this.l = l;
	}
	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}


	public String gridview(){
		
		Session session=HibernateUtils.getSession();
		Transaction tx=session.beginTransaction();
		
		info=session.createQuery("from ResumePojo p").list();
		System.out.println(info.get(0).getResume_id());
		System.out.println(info.get(0).getResumeFileName());
		
	
		
		return SUCCESS;
	}



	

	
	
	
	
	

	

}
