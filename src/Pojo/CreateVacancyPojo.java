package Pojo;

import java.util.Date;

public class CreateVacancyPojo {
	int vac_id;
	String vac_title,experiance,functional_area,education,specialization,location,email,telephone,job_ref_no,no_vacancy;
	Date creation_date,closing_date;
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

}
