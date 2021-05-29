package hrms.projet.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import hrms.projet.hrms.entities.concrete.Work;

public interface WorkDao extends JpaRepository<Work,Integer>{
	
}
