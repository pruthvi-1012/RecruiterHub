package Pojo;

import java.util.Date;

public class InterviewDetailsPojo {
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
}
