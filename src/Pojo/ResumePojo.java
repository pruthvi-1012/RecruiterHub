package Pojo;

import java.io.Serializable;

public class ResumePojo implements Serializable{
	
	
int resume_id;
String resumeFileName;
public int getResume_id() {
	return resume_id;
}
public void setResume_id(int resumeId) {
	resume_id = resumeId;
}
public String getResumeFileName() {
	return resumeFileName;
}
public void setResumeFileName(String resumeFileName) {
	this.resumeFileName = resumeFileName;
}
}
