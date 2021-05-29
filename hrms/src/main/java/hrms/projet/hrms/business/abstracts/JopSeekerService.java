package hrms.projet.hrms.business.abstracts;

import java.util.List;

import hrms.projet.hrms.core.utilities.result.Result;
import hrms.projet.hrms.entities.concrete.JopSeeker;

public interface JopSeekerService {
	
	Result register(JopSeeker jopSeeker);
	

}
