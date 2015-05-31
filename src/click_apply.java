import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.controller.HibernateUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;


public class click_apply extends ActionSupport implements  ServletRequestAware
{

	int apply_id,usre_id,vac_id;
	public int getApply_id() {
		return apply_id;
	}


	public void setApply_id(int applyId) {
		apply_id = applyId;
	}


	public int getUsre_id() {
		return usre_id;
	}


	public void setUsre_id(int usreId) {
		usre_id = usreId;
	}


	public int getVac_id() {
		return vac_id;
	}


	public void setVac_id(int vacId) {
		vac_id = vacId;
	}
   public String applyjob() throws Exception{
	   

	org.hibernate.Session session= HibernateUtils.getSession();
	Transaction tx= session.beginTransaction();
	return SUCCESS;
   }
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		
	}

}
