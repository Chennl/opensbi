package com.swirebev.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="cm_customer")
public class Customer implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private String outletNo;
	private String companyCode;
	private String accountGroup;
	private String salesOrganization;
	private String distributionChannel;
	private String division;
	private String title;
	private String nameE;
	private String addressE1;
	private String postalCode;
	private String country;
	private String region;
	private String transportationZone;
	private String basisOutletNo;
	private String townCode;
	private String cityCode;
	private String regionCode;
	private String suppressCode;
	private String healthLicenseNumber;
	private Date healthLicenseStart;
	private Date healthLicenseEnd;
	private String license;
	private Date licenseStart;
	private Date licenseEnd;
	private Date basisCreateDate;
	private Date sapCreateDate;
	private String deletionBlocks;
	private Date createDate;
	private String createBy;
	private Date updateDate;
	private String updateBy;
	private char pztCode;
	private CustomerGroup customerGroup;

	public CustomerGroup getCustomerGroup() {
		return customerGroup;
	}

	public void setCustomerGroup(CustomerGroup customerGroup) {
		this.customerGroup = customerGroup;
	}

	public Customer() {
	}

	public Customer(String outletNo, String companyCode, String postalCode, String transportationZone,
			Date createDate, String createBy, Date updateDate, String updateBy, char pztCode) {
		this.outletNo = outletNo;
		this.companyCode = companyCode;
		this.postalCode = postalCode;
		this.transportationZone = transportationZone;
		this.createDate = createDate;
		this.createBy = createBy;
		this.updateDate = updateDate;
		this.updateBy = updateBy;
		this.pztCode = pztCode;
	}

	public Customer(String outletNo, String companyCode, String accountGroup, String salesOrganization,
			String distributionChannel, String division, String title, String nameE, String addressE1,
			String postalCode, String country, String region, String transportationZone, String basisOutletNo,
			String townCode, String cityCode, String regionCode, String suppressCode, String healthLicenseNumber,
			Date healthLicenseStart, Date healthLicenseEnd, String license, Date licenseStart, Date licenseEnd,
			Date basisCreateDate, Date sapCreateDate, String deletionBlocks, Date createDate, String createBy,
			Date updateDate, String updateBy, char pztCode) {
		this.outletNo = outletNo;
		this.companyCode = companyCode;
		this.accountGroup = accountGroup;
		this.salesOrganization = salesOrganization;
		this.distributionChannel = distributionChannel;
		this.division = division;
		this.title = title;
		this.nameE = nameE;
		this.addressE1 = addressE1;
		this.postalCode = postalCode;
		this.country = country;
		this.region = region;
		this.transportationZone = transportationZone;
		this.basisOutletNo = basisOutletNo;
		this.townCode = townCode;
		this.cityCode = cityCode;
		this.regionCode = regionCode;
		this.suppressCode = suppressCode;
		this.healthLicenseNumber = healthLicenseNumber;
		this.healthLicenseStart = healthLicenseStart;
		this.healthLicenseEnd = healthLicenseEnd;
		this.license = license;
		this.licenseStart = licenseStart;
		this.licenseEnd = licenseEnd;
		this.basisCreateDate = basisCreateDate;
		this.sapCreateDate = sapCreateDate;
		this.deletionBlocks = deletionBlocks;
		this.createDate = createDate;
		this.createBy = createBy;
		this.updateDate = updateDate;
		this.updateBy = updateBy;
		this.pztCode = pztCode;
	}

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
	public String getOutletNo() {
		return this.outletNo;
	}

	public void setOutletNo(String outletNo) {
		this.outletNo = outletNo;
	}
	@Column(name="company_code")   
	public String getCompanyCode() {
		return this.companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getAccountGroup() {
		return this.accountGroup;
	}

	public void setAccountGroup(String accountGroup) {
		this.accountGroup = accountGroup;
	}

	public String getSalesOrganization() {
		return this.salesOrganization;
	}

	public void setSalesOrganization(String salesOrganization) {
		this.salesOrganization = salesOrganization;
	}

	public String getDistributionChannel() {
		return this.distributionChannel;
	}

	public void setDistributionChannel(String distributionChannel) {
		this.distributionChannel = distributionChannel;
	}

	public String getDivision() {
		return this.division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	@Column(name = "name_e")
	public String getNameE() {
		return this.nameE;
	}

	public void setNameE(String nameE) {
		this.nameE = nameE;
	}

	public String getAddressE1() {
		return this.addressE1;
	}

	public void setAddressE1(String addressE1) {
		this.addressE1 = addressE1;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getTransportationZone() {
		return this.transportationZone;
	}

	public void setTransportationZone(String transportationZone) {
		this.transportationZone = transportationZone;
	}

	public String getBasisOutletNo() {
		return this.basisOutletNo;
	}

	public void setBasisOutletNo(String basisOutletNo) {
		this.basisOutletNo = basisOutletNo;
	}

	public String getTownCode() {
		return this.townCode;
	}

	public void setTownCode(String townCode) {
		this.townCode = townCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getRegionCode() {
		return this.regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getSuppressCode() {
		return this.suppressCode;
	}

	public void setSuppressCode(String suppressCode) {
		this.suppressCode = suppressCode;
	}

	public String getHealthLicenseNumber() {
		return this.healthLicenseNumber;
	}

	public void setHealthLicenseNumber(String healthLicenseNumber) {
		this.healthLicenseNumber = healthLicenseNumber;
	}

	public Date getHealthLicenseStart() {
		return this.healthLicenseStart;
	}

	public void setHealthLicenseStart(Date healthLicenseStart) {
		this.healthLicenseStart = healthLicenseStart;
	}

	public Date getHealthLicenseEnd() {
		return this.healthLicenseEnd;
	}

	public void setHealthLicenseEnd(Date healthLicenseEnd) {
		this.healthLicenseEnd = healthLicenseEnd;
	}

	public String getLicense() {
		return this.license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public Date getLicenseStart() {
		return this.licenseStart;
	}

	public void setLicenseStart(Date licenseStart) {
		this.licenseStart = licenseStart;
	}

	public Date getLicenseEnd() {
		return this.licenseEnd;
	}

	public void setLicenseEnd(Date licenseEnd) {
		this.licenseEnd = licenseEnd;
	}

	public Date getBasisCreateDate() {
		return this.basisCreateDate;
	}

	public void setBasisCreateDate(Date basisCreateDate) {
		this.basisCreateDate = basisCreateDate;
	}

	public Date getSapCreateDate() {
		return this.sapCreateDate;
	}

	public void setSapCreateDate(Date sapCreateDate) {
		this.sapCreateDate = sapCreateDate;
	}

	public String getDeletionBlocks() {
		return this.deletionBlocks;
	}

	public void setDeletionBlocks(String deletionBlocks) {
		this.deletionBlocks = deletionBlocks;
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

	public char getPztCode() {
		return this.pztCode;
	}

	public void setPztCode(char pztCode) {
		this.pztCode = pztCode;
	}

}

