
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Cells {
	private int id;
	private int areaID;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAreaID() {
		return areaID;
	}
	public void setAreaID(int areaID) {
		this.areaID = areaID;
	}
	
	
}
