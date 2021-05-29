package hrms.projet.hrms.entities.concrete;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Works")
public class Work {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="Id")
		private int id;
	
		@Column(name="Jop_position_id")
		private int Jop_position_Id;
		
		@Column(name="Employer_id")
		private int Employer_Id;
		
		@Column(name="Explanation")
		private String Explanation;
		
		@Column(name="Salary")
		private double Salary;
		
		@Column(name="Create_date")
		private  Date Create_Date;
		
		@Column(name="Active")
		private boolean Active;
		
		public Work(int id, int jop_position_Id, int employer_Id, String explanation, double salary, Date create_Date,
				boolean active) {
			super();
			this.id = id;
			this.Jop_position_Id = jop_position_Id;
			this.Employer_Id = employer_Id;
			this.Explanation = explanation;
			this.Salary = salary;
			this.Create_Date = create_Date;
			this.Active = active;
		}

		public  Work() {
			
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getJop_position_Id() {
			return Jop_position_Id;
		}

		public void setJop_position_Id(int jop_position_Id) {
			this.Jop_position_Id = jop_position_Id;
		}

		public int getEmployer_Id() {
			return Employer_Id;
		}

		public void setEmployer_Id(int employer_Id) {
			this.Employer_Id = employer_Id;
		}

		public String getExplanation() {
			return Explanation;
		}

		public void setExplanation(String explanation) {
			this.Explanation = explanation;
		}

		public double getSalary() {
			return Salary;
		}

		public void setSalary(double salary) {
			this.Salary = salary;
		}

		public Date getCreate_Date() {
			return Create_Date;
		}

		public void setCreate_Date(Date create_Date) {
			this.Create_Date = create_Date;
		}

		public boolean isActive() {
			return Active;
		}

		public void setActive(boolean active) {
			this.Active = active;
		}

		

}
