import java.util.Date;
import java.util.Objects;

public class LogEntry {
	private String name;
	private Date dateLogin;
	public LogEntry(String name, Date dateLogin) {
		this.name = name;
		this.dateLogin = dateLogin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateLogin() {
		return dateLogin;
	}
	public void setDateLogin(Date dateLogin) {
		this.dateLogin = dateLogin;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(name, other.name);
	}
	
	
}	
