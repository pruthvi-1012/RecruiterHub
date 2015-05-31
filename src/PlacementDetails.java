import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Pojo.PlacementDetailsPojo;

import com.controller.HibernateUtils;
import com.opensymphony.xwork2.ActionSupport;



public class PlacementDetails extends ActionSupport {
	String clj_name,clj_address,placement_date,placement_time,contact_tpo,interview_department,interviewer_name;
int placement_id;

	public int getPlacement_id() {
	return placement_id;
}

public void setPlacement_id(int placementId) {
	placement_id = placementId;
}

public List<PlacementDetailsPojo> getInfo() {
	return info;
}

public void setInfo(List<PlacementDetailsPojo> info) {
	this.info = info;
}

	public String getClj_name() {
		return clj_name;
	}

	public void setClj_name(String cljName) {
		clj_name = cljName;
	}

	public String getClj_address() {
		return clj_address;
	}

	public void setClj_address(String cljAddress) {
		clj_address = cljAddress;
	}

	public String getPlacement_date() {
		return placement_date;
	}

	public void setPlacement_date(String placementDate) {
		placement_date = placementDate;
	}

	public String getPlacement_time() {
		return placement_time;
	}

	public void setPlacement_time(String placementTime) {
		placement_time = placementTime;
	}

	public String getContact_tpo() {
		return contact_tpo;
	}

	public void setContact_tpo(String contactTpo) {
		contact_tpo = contactTpo;
	}

	public String getInterview_department() {
		return interview_department;
	}

	public void setInterview_department(String interviewDepartment) {
		interview_department = interviewDepartment;
	}

	public String getInterviewer_name() {
		return interviewer_name;
	}

	public void setInterviewer_name(String interviewerName) {
		interviewer_name = interviewerName;
	}
public String insertdata() throws Exception{
	Session session=HibernateUtils.getSession();
	Transaction tx= session.beginTransaction();
	
	PlacementDetailsPojo p=new PlacementDetailsPojo();
	
     p.setClj_name(clj_name);
     p.setClj_address(clj_address);
     p.setPlacement_date(placement_date);
     p.setPlacement_time(placement_time);
     p.setContact_tpo(contact_tpo);
     p.setInterview_department(interview_department);
     p.setInterviewer_name(interviewer_name);
	 session.save(p);
	 tx.commit();
	 return(SUCCESS);
}
List<PlacementDetailsPojo> info;
public String gridview(){
	
	Session session=HibernateUtils.getSession();
	Transaction tx=session.beginTransaction();
	
	info=session.createQuery("from PlacementDetailsPojo p").list();
	System.out.println(info.get(0).getPlacement_id());
	System.out.println(info.get(0).getClj_name());
	System.out.println(info.get(0).getClj_address());
	System.out.println(info.get(0).getPlacement_date());
	System.out.println(info.get(0).getPlacement_time());
	System.out.println(info.get(0).getContact_tpo());
	System.out.println(info.get(0).getInterview_department());
	System.out.println(info.get(0).getInterviewer_name());
    return SUCCESS;
}
public String deletedata(){
	
	Session session=HibernateUtils.getSession();
	Transaction tx=session.beginTransaction();
	
	session.createQuery("delete from PlacementDetailsPojo p where p.placement_id="+placement_id).executeUpdate();
	tx.commit();
	return SUCCESS;
}

public String execute(){
	
	return SUCCESS;
}

}
