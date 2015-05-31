import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Pojo.InterviewDetailsPojo;
import Pojo.PlacementDetailsPojo;

import com.controller.HibernateUtils;
import com.opensymphony.xwork2.ActionSupport;


public class InterviewDetails extends ActionSupport

{
int vac_id;
String interviewer_name,interview_time,interview_place,interview_department;
Date interview_date;
public Date getInterview_date() {
	return interview_date;
}
public void setInterview_date(Date interviewDate) {
	interview_date = interviewDate;
}
public int getVac_id() {
	return vac_id;
}
public void setVac_id(int vacId) {
	vac_id = vacId;
}
public String getInterviewer_name() {
	return interviewer_name;
}
public void setInterviewer_name(String interviewerName) {
	interviewer_name = interviewerName;
}

public String getInterview_time() {
	return interview_time;
}
public void setInterview_time(String interviewTime) {
	interview_time = interviewTime;
}
public String getInterview_place() {
	return interview_place;
}
public void setInterview_place(String interviewPlace) {
	interview_place = interviewPlace;
}
public String getInterview_department() {
	return interview_department;
}
public void setInterview_department(String interviewDepartment) {
	interview_department = interviewDepartment;
}
	public String insertdata() throws Exception
	{
		 Session session=HibernateUtils.getSession();
			Transaction tx= session.beginTransaction();
			
			InterviewDetailsPojo p=new InterviewDetailsPojo();
			
			p.setVac_id(vac_id);
			p.setInterview_date(interview_date);
			p.setInterview_time(interview_time);
			p.setInterview_place(interview_place);
			p.setInterview_department(interview_department);
			p.setInterviewer_name(interviewer_name);
			
			session.save(p);
			tx.commit();
			
		 
		 return(SUCCESS);
	}
	
	List<InterviewDetailsPojo> info;
	public String gridview(){
		
		Session session=HibernateUtils.getSession();
		Transaction tx=session.beginTransaction();
		
		info=session.createQuery("from InterviewDetailsPojo p").list();
		System.out.println(info.get(0).getVac_id());
		System.out.println(info.get(0).getInterview_date());
		System.out.println(info.get(0).getInterview_time());
		System.out.println(info.get(0).getInterview_place());
		System.out.println(info.get(0).getInterview_department());
		System.out.println(info.get(0).getInterviewer_name());
		
		
	    return SUCCESS;
	}
	public String deletedata(){
		
		Session session=HibernateUtils.getSession();
		Transaction tx=session.beginTransaction();
		
		session.createQuery("delete from InterviewDetailsPojo p where p.vac_id="+vac_id).executeUpdate();
		tx.commit();
		return SUCCESS;
	}
	public String exexute(){
		return SUCCESS;
	}

}

