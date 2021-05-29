package hrms.projet.hrms.entities.concrete;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="JopSeeker")
public class JopSeeker {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Sorname")
	private String sorName;
	@Column(name="Tc_no")
	private String TcNo;
	@Column(name="mail")
	private  Date birthday;
	@Column(name="Password")
	private String mail;
	@Column(name="Birthday")
	private String password;
	
	
	public JopSeeker(int id, String name, String sorName, String tcNo, Date birthday, String mail, String password) {
		super();
		this.id = id;
		this.name = name;
		this.sorName = sorName;
		TcNo = tcNo;
		this.birthday = birthday;
		this.mail = mail;
		this.password = password;
	}

	public JopSeeker() {
		
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSorName() {
		return sorName;
	}

	public void setSorName(String sorName) {
		this.sorName = sorName;
	}

	public String getTcNo() {
		return TcNo;
	}

	public void setTcNo(String tcNo) {
		TcNo = tcNo;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
