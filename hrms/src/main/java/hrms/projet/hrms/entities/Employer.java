package hrms.projet.hrms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Employer")
public class Employer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	@Column(name="company_name")

	private String companyName;
	@Column(name="company_website")
	private String companyWebsite;
	@Column(name="mail")
	private String mail;
	@Column(name="tel")
	private String tel;
	@Column(name="password")
	private String password;


}
