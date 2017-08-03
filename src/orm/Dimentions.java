
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Dimentions {
	private int dimenID;
	private String name;
	private int domainID;
	
	@Id
	public int getDimenID() {
		return dimenID;
	}

	public void setDimenID(int dimenID) {
		this.dimenID = dimenID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDomainID() {
		return domainID;
	}

	public void setDomainID(int domainID) {
		this.domainID = domainID;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
