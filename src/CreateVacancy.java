import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Pojo.CreateVacancyPojo;

import com.controller.HibernateUtils;
import com.opensymphony.xwork2.ActionSupport;


public class CreateVacancy extends ActionSupport implements ServletRequestAware {
	
	int vac_id;
	String vac_title,experiance,functional_area,education,specialization,location,email,telephone,job_ref_no,no_vacancy;
	Date creation_date,closing_date;
	List<CreateVacancyPojo> l;
	HttpServletRequest request;
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public List<CreateVacancyPojo> getL() {
		return l;
	}
	public void setL(List<CreateVacancyPojo> l) {
		this.l = l;
	}
	public Date getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(Date creationDate) {
		creation_date = creationDate;
	}
	public Date getClosing_date() {
		return closing_date;
	}
	public void setClosing_date(Date closingDate) {
		closing_date = closingDate;
	}
	public int getVac_id() {
		return vac_id;
	}
	public String getNo_vacancy() {
		return no_vacancy;
	}
	public void setNo_vacancy(String noVacancy) {
		no_vacancy = noVacancy;
	}
	public void setVac_id(int vacId) {
		vac_id = vacId;
	}
	public String getVac_title() {
		return vac_title;
	}
	public void setVac_title(String vacTitle) {
		vac_title = vacTitle;
	}
	
	public String getExperiance() {
		return experiance;
	}
	public void setExperiance(String experiance) {
		this.experiance = experiance;
	}
	public String getFunctional_area() {
		return functional_area;
	}
	public void setFunctional_area(String functionalArea) {
		functional_area = functionalArea;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getJob_ref_no() {
		return job_ref_no;
	}
	public void setJob_ref_no(String jobRefNo) {
		job_ref_no = jobRefNo;
	}

	 public String insertdata() throws Exception
	 {
		 Session session=HibernateUtils.getSession();
			Transaction tx= session.beginTransaction();
			
			CreateVacancyPojo p=new CreateVacancyPojo();
			p.setVac_id(vac_id);
			p.setVac_title(vac_title);
			p.setCreation_date(creation_date);
			p.setClosing_date(closing_date);
			p.setExperiance(experiance);
			p.setFunctional_area(functional_area);
			p.setEducation(education);
			p.setSpecialization(specialization);
			p.setLocation(location);
			p.setEmail(email);
			p.setTelephone(telephone);
			p.setJob_ref_no(job_ref_no);
			p.setNo_vacancy(no_vacancy);
			
			
			
			session.save(p);
			tx.commit();
			
		 
		 return(SUCCESS);
	 }
	List<CreateVacancyPojo> info;
	 public List<CreateVacancyPojo> getInfo() {
		return info;
	}
	public void setInfo(List<CreateVacancyPojo> info) {
		this.info = info;
	}
	public String gridview(){
			
			Session session=HibernateUtils.getSession();
			Transaction tx=session.beginTransaction();
			
			info=session.createQuery("from CreateVacancyPojo p").list();
			System.out.println(info.get(0).getVac_id());
			System.out.println(info.get(0).getVac_title());
			System.out.println(info.get(0).getCreation_date());
			System.out.println(info.get(0).getClosing_date());
			System.out.println(info.get(0).getExperiance());
			System.out.println(info.get(0).getFunctional_area());
			System.out.println(info.get(0).getNo_vacancy());
			System.out.println(info.get(0).getEducation());
			System.out.println(info.get(0).getSpecialization());
			System.out.println(info.get(0).getLocation());
			System.out.println(info.get(0).getTelephone());
			System.out.println(info.get(0).getJob_ref_no());
		
			
			return SUCCESS;
		}
	
	 public String showdata() throws Exception{
			
			Session session=HibernateUtils.getSession();
			Transaction tx=session.beginTransaction();
			
			/*HttpSession sess=request.getSession();*/
			
			
			
			l=session.createQuery("from CreateVacancyPojo p").list();
			
			for(int i=0;i<l.size();i++){
				System.out.println(l.get(i).getVac_title());
				System.out.println(l.get(i).getExperiance());
				System.out.println(l.get(i).getEducation());
				System.out.println(l.get(i).getSpecialization());
				System.out.println(l.get(i).getFunctional_area());
				System.out.println(l.get(i).getJob_ref_no());
				System.out.println(l.get(i).getNo_vacancy());
				System.out.println(l.get(i).getLocation());
				System.out.println(l.get(i).getClosing_date());
				System.out.println(l.get(i).getClosing_date());
				System.out.println(l.get(i).getVac_id());
				System.out.println(l.get(i).getTelephone());
			}
			
			request.setAttribute("list", l);	
			return SUCCESS;
		}
	 
	 public String deletedata(){
			
			Session session=HibernateUtils.getSession();
			Transaction tx=session.beginTransaction();
			
			session.createQuery("delete from CreateVacancyPojo p where p.vac_id="+vac_id).executeUpdate();
			tx.commit();
			return SUCCESS;
		}
	 
	 public String updatedata(){
			
			Session session=HibernateUtils.getSession();
			Transaction tx=session.beginTransaction();
			
			CreateVacancyPojo p=(CreateVacancyPojo)session.get(CreateVacancyPojo.class, vac_id);
			p.setVac_title(vac_title);
			p.setCreation_date(creation_date);
			p.setClosing_date(closing_date);
			p.setExperiance(experiance);
			p.setFunctional_area(functional_area);
			p.setNo_vacancy(no_vacancy);
			p.setEducation(education);
			p.setSpecialization(specialization);
			p.setLocation(location);
			p.setTelephone(telephone);
			p.setJob_ref_no(job_ref_no);
			session.update(p);
			tx.commit();
			
			return SUCCESS;
		}
	 public String execute()throws Exception
	 {
		return SUCCESS; 
	 }
	@Override
	public void setServletRequest(HttpServletRequest req) {
		// TODO Auto-generated method stub
		this.request=req;
	}

}
