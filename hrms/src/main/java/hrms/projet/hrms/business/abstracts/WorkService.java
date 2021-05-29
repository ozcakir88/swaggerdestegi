package hrms.projet.hrms.business.abstracts;

import java.util.List;

import hrms.projet.hrms.entities.concrete.Work;

public interface WorkService {
	List<Work> getAll();
	void add(Work work);

}
