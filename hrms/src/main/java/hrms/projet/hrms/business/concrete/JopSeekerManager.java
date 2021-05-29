package hrms.projet.hrms.business.concrete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.projet.hrms.business.abstracts.JopSeekerService;
import hrms.projet.hrms.core.mailservice.GMailService;
import hrms.projet.hrms.core.mernis.MernisService;
import hrms.projet.hrms.core.utilities.result.Result;
import hrms.projet.hrms.core.utilities.result.SuccessResult;
import hrms.projet.hrms.dataAccess.abstracts.JopSeekerDao;
import hrms.projet.hrms.entities.concrete.JopSeeker;

@Service
public class JopSeekerManager implements JopSeekerService{
	private JopSeekerDao jopSeekerDao;
	 MernisService mernisService =new MernisService();
	GMailService gmailService=new GMailService();
	@Autowired
	public JopSeekerManager(JopSeekerDao jopSeekerDao) {
		super();
		this.jopSeekerDao=jopSeekerDao;
		
	}
	
	@Override
	public Result register(JopSeeker jopSeeker) {
		
		if (this.gmailService.gmailCheckService() &&
				this.mernisService.mernisCheckService() &&
			requiredField(jopSeeker) &&
			mail_Kontrol(jopSeeker.getMail())&&
			Tc_kontrol(jopSeeker.getTcNo())) {
			
			this.jopSeekerDao.save(jopSeeker);
			return new SuccessResult("başarı ile kayıt oldunuz");
		}
		return new SuccessResult("kayıt gercekleşemedi");

	}
	public boolean kontrol(List<String> resutls,String  result) {
		for (String a : resutls) {
			if(a==result) {
				return false;
			}
		}
		return true;
	}
	public boolean mail_Kontrol(String mail) {
		List<String> mails=new ArrayList<>();
		for(int i=0;i<jopSeekerDao.findAll().size();i++) {
			mails.add(jopSeekerDao.findAll().get(i).getMail());
		}
		return kontrol(mails,mail);
			
	}
	public boolean Tc_kontrol(String Tcno) {
		List<String> Tc_no=new ArrayList<>();
		for(int i=0;i<jopSeekerDao.findAll().size();i++) {
			Tc_no.add(jopSeekerDao.findAll().get(i).getTcNo());
		}
		return kontrol(Tc_no,Tcno);
	}
	
	public boolean requiredField(JopSeeker jopSeeker) {
		if (jopSeeker==null) {
			
			return false;
		}
		
		return true;
	}

	
	

}
