package hbclass;
// Generated Jan 11, 2017 1:51:25 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;

/**
 * CmCustomerlogistics generated by hbm2java
 */
public class CmCustomerlogistics implements java.io.Serializable {

	private String outletNo;
	private String companyCode;
	private String floor;
	private String unloadingPoint;
	private String unloadingPointDefault;
	private Integer deliveryPriority;
	private String delDelayDay;
	private String roadShow;
	private String directIndicator;
	private String storeSpace;
	private String consignee;
	private String driverMsgcode;
	private String deliveryLimit;
	private String deliveryDocPrint;
	private String batchPrint;
	private String longtitude;
	private String latitude;
	private String canDirectCapability;
	private String loadStaff;
	private Date createDate;
	private String createBy;
	private Date updateDate;
	private String updateBy;

	public CmCustomerlogistics() {
	}

	public CmCustomerlogistics(String outletNo, String companyCode, String roadShow, String directIndicator,
			String deliveryDocPrint, Date createDate, String createBy, Date updateDate, String updateBy) {
		this.outletNo = outletNo;
		this.companyCode = companyCode;
		this.roadShow = roadShow;
		this.directIndicator = directIndicator;
		this.deliveryDocPrint = deliveryDocPrint;
		this.createDate = createDate;
		this.createBy = createBy;
		this.updateDate = updateDate;
		this.updateBy = updateBy;
	}

	public CmCustomerlogistics(String outletNo, String companyCode, String floor, String unloadingPoint,
			String unloadingPointDefault, Integer deliveryPriority, String delDelayDay, String roadShow,
			String directIndicator, String storeSpace, String consignee, String driverMsgcode, String deliveryLimit,
			String deliveryDocPrint, String batchPrint, String longtitude, String latitude, String canDirectCapability,
			String loadStaff, Date createDate, String createBy, Date updateDate, String updateBy) {
		this.outletNo = outletNo;
		this.companyCode = companyCode;
		this.floor = floor;
		this.unloadingPoint = unloadingPoint;
		this.unloadingPointDefault = unloadingPointDefault;
		this.deliveryPriority = deliveryPriority;
		this.delDelayDay = delDelayDay;
		this.roadShow = roadShow;
		this.directIndicator = directIndicator;
		this.storeSpace = storeSpace;
		this.consignee = consignee;
		this.driverMsgcode = driverMsgcode;
		this.deliveryLimit = deliveryLimit;
		this.deliveryDocPrint = deliveryDocPrint;
		this.batchPrint = batchPrint;
		this.longtitude = longtitude;
		this.latitude = latitude;
		this.canDirectCapability = canDirectCapability;
		this.loadStaff = loadStaff;
		this.createDate = createDate;
		this.createBy = createBy;
		this.updateDate = updateDate;
		this.updateBy = updateBy;
	}

	public String getOutletNo() {
		return this.outletNo;
	}

	public void setOutletNo(String outletNo) {
		this.outletNo = outletNo;
	}

	public String getCompanyCode() {
		return this.companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getFloor() {
		return this.floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getUnloadingPoint() {
		return this.unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getUnloadingPointDefault() {
		return this.unloadingPointDefault;
	}

	public void setUnloadingPointDefault(String unloadingPointDefault) {
		this.unloadingPointDefault = unloadingPointDefault;
	}

	public Integer getDeliveryPriority() {
		return this.deliveryPriority;
	}

	public void setDeliveryPriority(Integer deliveryPriority) {
		this.deliveryPriority = deliveryPriority;
	}

	public String getDelDelayDay() {
		return this.delDelayDay;
	}

	public void setDelDelayDay(String delDelayDay) {
		this.delDelayDay = delDelayDay;
	}

	public String getRoadShow() {
		return this.roadShow;
	}

	public void setRoadShow(String roadShow) {
		this.roadShow = roadShow;
	}

	public String getDirectIndicator() {
		return this.directIndicator;
	}

	public void setDirectIndicator(String directIndicator) {
		this.directIndicator = directIndicator;
	}

	public String getStoreSpace() {
		return this.storeSpace;
	}

	public void setStoreSpace(String storeSpace) {
		this.storeSpace = storeSpace;
	}

	public String getConsignee() {
		return this.consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getDriverMsgcode() {
		return this.driverMsgcode;
	}

	public void setDriverMsgcode(String driverMsgcode) {
		this.driverMsgcode = driverMsgcode;
	}

	public String getDeliveryLimit() {
		return this.deliveryLimit;
	}

	public void setDeliveryLimit(String deliveryLimit) {
		this.deliveryLimit = deliveryLimit;
	}

	public String getDeliveryDocPrint() {
		return this.deliveryDocPrint;
	}

	public void setDeliveryDocPrint(String deliveryDocPrint) {
		this.deliveryDocPrint = deliveryDocPrint;
	}

	public String getBatchPrint() {
		return this.batchPrint;
	}

	public void setBatchPrint(String batchPrint) {
		this.batchPrint = batchPrint;
	}

	public String getLongtitude() {
		return this.longtitude;
	}

	public void setLongtitude(String longtitude) {
		this.longtitude = longtitude;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getCanDirectCapability() {
		return this.canDirectCapability;
	}

	public void setCanDirectCapability(String canDirectCapability) {
		this.canDirectCapability = canDirectCapability;
	}

	public String getLoadStaff() {
		return this.loadStaff;
	}

	public void setLoadStaff(String loadStaff) {
		this.loadStaff = loadStaff;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

}
