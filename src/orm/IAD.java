
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class IAD {
	private int id;
	private String name;
	private String type;
	private int domainID;
	private int KADid;
	
	@Id
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDomainID() {
		return domainID;
	}
	public void setDomainID(int domainID) {
		this.domainID = domainID;
	}
	public int getKADid() {
		return KADid;
	}
	public void setKADid(int kADid) {
		KADid = kADid;
	}
	
	
}
