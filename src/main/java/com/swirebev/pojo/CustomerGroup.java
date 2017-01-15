package com.swirebev.pojo;
// Generated Dec 27, 2016 4:23:52 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;

/**
 * CmCustomergroup generated by hbm2java
 */
public class CustomerGroup implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String outletNo;
	private String companyCode;
	private String marketSegmentCode;
	private String businessTypeCode;
	private String businessTypeExtens;
	private String channelCode;
	private String subChannelCode;
	private String locationCode;
	private String currency;
	private String custPriceProc;
	private String delLocationCode;
	private String invoicingDates;
	private String invoicinglistDates;
	private String paymentTerms;
	private String accountAssignmentGroup;
	private String taxClassification;
	private String marketChannel;
	private String statusCode;
	private String tradeChannel;
	private String psRoute;
	private String serviceTrade;
	private String serviceIndicator;
	private String servicePrice;
	private String serviceZone;
	private String bottleCasePayment;
	private String bottleCaseMethods;
	private String topIndicator;
	private Date createDate;
	private String createBy;
	private Date updateDate;
	private String updateBy;
	private String actDelLocationCode;
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CustomerGroup() {
	}

	public CustomerGroup(String outletNo, String companyCode, String locationCode, String currency,
			String custPriceProc, String delLocationCode, String invoicingDates, String invoicinglistDates,
			String paymentTerms, String statusCode, String tradeChannel, String serviceTrade, Date createDate,
			String createBy, Date updateDate, String updateBy) {
		this.outletNo = outletNo;
		this.companyCode = companyCode;
		this.locationCode = locationCode;
		this.currency = currency;
		this.custPriceProc = custPriceProc;
		this.delLocationCode = delLocationCode;
		this.invoicingDates = invoicingDates;
		this.invoicinglistDates = invoicinglistDates;
		this.paymentTerms = paymentTerms;
		this.statusCode = statusCode;
		this.tradeChannel = tradeChannel;
		this.serviceTrade = serviceTrade;
		this.createDate = createDate;
		this.createBy = createBy;
		this.updateDate = updateDate;
		this.updateBy = updateBy;
	}

	public CustomerGroup(String outletNo, String companyCode, String marketSegmentCode, String businessTypeCode,
			String businessTypeExtens, String channelCode, String subChannelCode, String locationCode, String currency,
			String custPriceProc, String delLocationCode, String invoicingDates, String invoicinglistDates,
			String paymentTerms, String accountAssignmentGroup, String taxClassification, String marketChannel,
			String statusCode, String tradeChannel, String psRoute, String serviceTrade, String serviceIndicator,
			String servicePrice, String serviceZone, String bottleCasePayment, String bottleCaseMethods,
			String topIndicator, Date createDate, String createBy, Date updateDate, String updateBy,
			String actDelLocationCode) {
		this.outletNo = outletNo;
		this.companyCode = companyCode;
		this.marketSegmentCode = marketSegmentCode;
		this.businessTypeCode = businessTypeCode;
		this.businessTypeExtens = businessTypeExtens;
		this.channelCode = channelCode;
		this.subChannelCode = subChannelCode;
		this.locationCode = locationCode;
		this.currency = currency;
		this.custPriceProc = custPriceProc;
		this.delLocationCode = delLocationCode;
		this.invoicingDates = invoicingDates;
		this.invoicinglistDates = invoicinglistDates;
		this.paymentTerms = paymentTerms;
		this.accountAssignmentGroup = accountAssignmentGroup;
		this.taxClassification = taxClassification;
		this.marketChannel = marketChannel;
		this.statusCode = statusCode;
		this.tradeChannel = tradeChannel;
		this.psRoute = psRoute;
		this.serviceTrade = serviceTrade;
		this.serviceIndicator = serviceIndicator;
		this.servicePrice = servicePrice;
		this.serviceZone = serviceZone;
		this.bottleCasePayment = bottleCasePayment;
		this.bottleCaseMethods = bottleCaseMethods;
		this.topIndicator = topIndicator;
		this.createDate = createDate;
		this.createBy = createBy;
		this.updateDate = updateDate;
		this.updateBy = updateBy;
		this.actDelLocationCode = actDelLocationCode;
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

	public String getMarketSegmentCode() {
		return this.marketSegmentCode;
	}

	public void setMarketSegmentCode(String marketSegmentCode) {
		this.marketSegmentCode = marketSegmentCode;
	}

	public String getBusinessTypeCode() {
		return this.businessTypeCode;
	}

	public void setBusinessTypeCode(String businessTypeCode) {
		this.businessTypeCode = businessTypeCode;
	}

	public String getBusinessTypeExtens() {
		return this.businessTypeExtens;
	}

	public void setBusinessTypeExtens(String businessTypeExtens) {
		this.businessTypeExtens = businessTypeExtens;
	}

	public String getChannelCode() {
		return this.channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getSubChannelCode() {
		return this.subChannelCode;
	}

	public void setSubChannelCode(String subChannelCode) {
		this.subChannelCode = subChannelCode;
	}

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCustPriceProc() {
		return this.custPriceProc;
	}

	public void setCustPriceProc(String custPriceProc) {
		this.custPriceProc = custPriceProc;
	}

	public String getDelLocationCode() {
		return this.delLocationCode;
	}

	public void setDelLocationCode(String delLocationCode) {
		this.delLocationCode = delLocationCode;
	}

	public String getInvoicingDates() {
		return this.invoicingDates;
	}

	public void setInvoicingDates(String invoicingDates) {
		this.invoicingDates = invoicingDates;
	}

	public String getInvoicinglistDates() {
		return this.invoicinglistDates;
	}

	public void setInvoicinglistDates(String invoicinglistDates) {
		this.invoicinglistDates = invoicinglistDates;
	}

	public String getPaymentTerms() {
		return this.paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getAccountAssignmentGroup() {
		return this.accountAssignmentGroup;
	}

	public void setAccountAssignmentGroup(String accountAssignmentGroup) {
		this.accountAssignmentGroup = accountAssignmentGroup;
	}

	public String getTaxClassification() {
		return this.taxClassification;
	}

	public void setTaxClassification(String taxClassification) {
		this.taxClassification = taxClassification;
	}

	public String getMarketChannel() {
		return this.marketChannel;
	}

	public void setMarketChannel(String marketChannel) {
		this.marketChannel = marketChannel;
	}

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getTradeChannel() {
		return this.tradeChannel;
	}

	public void setTradeChannel(String tradeChannel) {
		this.tradeChannel = tradeChannel;
	}

	public String getPsRoute() {
		return this.psRoute;
	}

	public void setPsRoute(String psRoute) {
		this.psRoute = psRoute;
	}

	public String getServiceTrade() {
		return this.serviceTrade;
	}

	public void setServiceTrade(String serviceTrade) {
		this.serviceTrade = serviceTrade;
	}

	public String getServiceIndicator() {
		return this.serviceIndicator;
	}

	public void setServiceIndicator(String serviceIndicator) {
		this.serviceIndicator = serviceIndicator;
	}

	public String getServicePrice() {
		return this.servicePrice;
	}

	public void setServicePrice(String servicePrice) {
		this.servicePrice = servicePrice;
	}

	public String getServiceZone() {
		return this.serviceZone;
	}

	public void setServiceZone(String serviceZone) {
		this.serviceZone = serviceZone;
	}

	public String getBottleCasePayment() {
		return this.bottleCasePayment;
	}

	public void setBottleCasePayment(String bottleCasePayment) {
		this.bottleCasePayment = bottleCasePayment;
	}

	public String getBottleCaseMethods() {
		return this.bottleCaseMethods;
	}

	public void setBottleCaseMethods(String bottleCaseMethods) {
		this.bottleCaseMethods = bottleCaseMethods;
	}

	public String getTopIndicator() {
		return this.topIndicator;
	}

	public void setTopIndicator(String topIndicator) {
		this.topIndicator = topIndicator;
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

	public String getActDelLocationCode() {
		return this.actDelLocationCode;
	}

	public void setActDelLocationCode(String actDelLocationCode) {
		this.actDelLocationCode = actDelLocationCode;
	}

}
