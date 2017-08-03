
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class IADToCellAssignment {
	private int id;
	private int IADid;
	private int cellID;
	private int areaID;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIADid() {
		return IADid;
	}
	public void setIADid(int iADid) {
		IADid = iADid;
	}
	public int getCellID() {
		return cellID;
	}
	public void setCellID(int cellID) {
		this.cellID = cellID;
	}
	public int getAreaID() {
		return areaID;
	}
	public void setAreaID(int areaID) {
		this.areaID = areaID;
	}
	
	
}
