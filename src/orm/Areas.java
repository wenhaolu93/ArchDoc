
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Areas {
	private int id;
	private int parentID;
	private String orderNo;
	private int depthLevel;
	private int dimenID;
	private String areaName;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParentID() {
		return parentID;
	}
	public void setParentID(int parentID) {
		this.parentID = parentID;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public int getDepthLevel() {
		return depthLevel;
	}
	public void setDepthLevel(int depthLevel) {
		this.depthLevel = depthLevel;
	}
	public int getDimenID() {
		return dimenID;
	}
	public void setDimenID(int dimenID) {
		this.dimenID = dimenID;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	
}
