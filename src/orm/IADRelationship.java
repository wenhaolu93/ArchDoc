
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class IADRelationship {
	private int id;
	private int fromIADid;
	private int toIADid;
	private int relationTypeID;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFromIADid() {
		return fromIADid;
	}
	public void setFromIADid(int fromIADid) {
		this.fromIADid = fromIADid;
	}
	public int getToIADid() {
		return toIADid;
	}
	public void setToIADid(int toIADid) {
		this.toIADid = toIADid;
	}
	public int getRelationTypeID() {
		return relationTypeID;
	}
	public void setRelationTypeID(int relationTypeID) {
		this.relationTypeID = relationTypeID;
	}	
}
