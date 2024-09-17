package simplejdbc;

public class Agent {

	long Agent_ID;
	String Agent_Name;
	String phone;
	String email;
	String Agent_Role;
	public Agent(long Agent_ID, String Agent_Name, String phone, String email, String Agent_Role) {
		super();
		this.Agent_ID = Agent_ID;
		this.Agent_Name = Agent_Name;
		this.phone = phone;
		this.email = email;
		this.Agent_Role = Agent_Role;
	}
	public Agent() {

	}
	public long getAgent_ID() {
		return Agent_ID;
	}
	public void setAgent_ID(long Agent_ID) {
		this.Agent_ID = Agent_ID;
	}
	public String getAgent_Name() {
		return Agent_Name;
	}
	public void setAgent_Name(String Agent_Name) {
		this.Agent_Name = Agent_Name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAgent_Role() {
		return Agent_Role;
	}
	public void setAgent_Role(String Agent_Role) {
		this.Agent_Role = Agent_Role;
	}
	@Override
	public String toString() {
		return "Agent [Agent_ID=" + Agent_ID + ", Agent_Name=" + Agent_Name + ", phone=" + phone
				+ ", email=" + email + ", Agent_Role=" + Agent_Role + "]";
	}

