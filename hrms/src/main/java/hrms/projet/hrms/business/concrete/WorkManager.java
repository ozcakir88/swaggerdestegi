package hrms.projet.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.projet.hrms.business.abstracts.WorkService;
import hrms.projet.hrms.dataAccess.abstracts.WorkDao;
import hrms.projet.hrms.entities.concrete.Work;

@Service
public class WorkManager implements WorkService{

	private WorkDao workDao;
	
	@Autowired
	public WorkManager(WorkDao workDao) {
		super();
		this.workDao=workDao;
	}
	
	@Override
	public List<Work> getAll() {
		// TODO Auto-generated method stub
		return this.workDao.findAll();
	}

	@Override
	public void add(Work work) {
		
		workDao.save(work);
		
	}

}
