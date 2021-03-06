package hbclass;
// Generated Jan 11, 2017 1:51:25 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;

/**
 * CmCustomerterms generated by hbm2java
 */
public class CmCustomerterms implements java.io.Serializable {

	private String outletNo;
	private String companyCode;
	private String taxRegCode;
	private String bankKey;
	private String bankAccount;
	private String accountHolder;
	private String reconAccount;
	private String sortKey;
	private String paymentMethods;
	private String priceListNo;
	private String invoiceTitleCode;
	private String tradeName;
	private String costCenter;
	private String checkIndicator;
	private String paymentDate;
	private String billingDate;
	private String countingDate;
	private String printBilling;
	private String invoicePrint;
	private String invoiceType;
	private String rebateMethods;
	private Date createDate;
	private String createBy;
	private Date updateDate;
	private String updateBy;

	public CmCustomerterms() {
	}

	public CmCustomerterms(String outletNo, String companyCode, String tradeName, Date createDate, String createBy,
			Date updateDate, String updateBy) {
		this.outletNo = outletNo;
		this.companyCode = companyCode;
		this.tradeName = tradeName;
		this.createDate = createDate;
		this.createBy = createBy;
		this.updateDate = updateDate;
		this.updateBy = updateBy;
	}

	public CmCustomerterms(String outletNo, String companyCode, String taxRegCode, String bankKey, String bankAccount,
			String accountHolder, String reconAccount, String sortKey, String paymentMethods, String priceListNo,
			String invoiceTitleCode, String tradeName, String costCenter, String checkIndicator, String paymentDate,
			String billingDate, String countingDate, String printBilling, String invoicePrint, String invoiceType,
			String rebateMethods, Date createDate, String createBy, Date updateDate, String updateBy) {
		this.outletNo = outletNo;
		this.companyCode = companyCode;
		this.taxRegCode = taxRegCode;
		this.bankKey = bankKey;
		this.bankAccount = bankAccount;
		this.accountHolder = accountHolder;
		this.reconAccount = reconAccount;
		this.sortKey = sortKey;
		this.paymentMethods = paymentMethods;
		this.priceListNo = priceListNo;
		this.invoiceTitleCode = invoiceTitleCode;
		this.tradeName = tradeName;
		this.costCenter = costCenter;
		this.checkIndicator = checkIndicator;
		this.paymentDate = paymentDate;
		this.billingDate = billingDate;
		this.countingDate = countingDate;
		this.printBilling = printBilling;
		this.invoicePrint = invoicePrint;
		this.invoiceType = invoiceType;
		this.rebateMethods = rebateMethods;
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

	public String getTaxRegCode() {
		return this.taxRegCode;
	}

	public void setTaxRegCode(String taxRegCode) {
		this.taxRegCode = taxRegCode;
	}

	public String getBankKey() {
		return this.bankKey;
	}

	public void setBankKey(String bankKey) {
		this.bankKey = bankKey;
	}

	public String getBankAccount() {
		return this.bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getAccountHolder() {
		return this.accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getReconAccount() {
		return this.reconAccount;
	}

	public void setReconAccount(String reconAccount) {
		this.reconAccount = reconAccount;
	}

	public String getSortKey() {
		return this.sortKey;
	}

	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
	}

	public String getPaymentMethods() {
		return this.paymentMethods;
	}

	public void setPaymentMethods(String paymentMethods) {
		this.paymentMethods = paymentMethods;
	}

	public String getPriceListNo() {
		return this.priceListNo;
	}

	public void setPriceListNo(String priceListNo) {
		this.priceListNo = priceListNo;
	}

	public String getInvoiceTitleCode() {
		return this.invoiceTitleCode;
	}

	public void setInvoiceTitleCode(String invoiceTitleCode) {
		this.invoiceTitleCode = invoiceTitleCode;
	}

	public String getTradeName() {
		return this.tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getCostCenter() {
		return this.costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	public String getCheckIndicator() {
		return this.checkIndicator;
	}

	public void setCheckIndicator(String checkIndicator) {
		this.checkIndicator = checkIndicator;
	}

	public String getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getBillingDate() {
		return this.billingDate;
	}

	public void setBillingDate(String billingDate) {
		this.billingDate = billingDate;
	}

	public String getCountingDate() {
		return this.countingDate;
	}

	public void setCountingDate(String countingDate) {
		this.countingDate = countingDate;
	}

	public String getPrintBilling() {
		return this.printBilling;
	}

	public void setPrintBilling(String printBilling) {
		this.printBilling = printBilling;
	}

	public String getInvoicePrint() {
		return this.invoicePrint;
	}

	public void setInvoicePrint(String invoicePrint) {
		this.invoicePrint = invoicePrint;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getRebateMethods() {
		return this.rebateMethods;
	}

	public void setRebateMethods(String rebateMethods) {
		this.rebateMethods = rebateMethods;
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
