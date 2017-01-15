package com.swirebev.pojo.simple;

public class ArticleMasterSimple implements java.io.Serializable {

		private static final long serialVersionUID = 1L;
		public String getArticleNo() {
			return articleNo;
		}
		public void setArticleNo(String articleNo) {
			this.articleNo = articleNo;
		}
		public String getCategoryCode() {
			return categoryCode;
		}
		public void setCategoryCode(String categoryCode) {
			this.categoryCode = categoryCode;
		}
		public String getBrandCode() {
			return brandCode;
		}
		public void setBrandCode(String brandCode) {
			this.brandCode = brandCode;
		}
		public String getPackageCode() {
			return packageCode;
		}
		public void setPackageCode(String packageCode) {
			this.packageCode = packageCode;
		}
		public String getFlavor_code() {
			return flavor_code;
		}
		public void setFlavor_code(String flavor_code) {
			this.flavor_code = flavor_code;
		}
		public String getNameC() {
			return nameC;
		}
		public void setNameC(String nameC) {
			this.nameC = nameC;
		}
		private String articleNo;
		private String categoryCode;
		private String brandCode;
		private String packageCode;
		private String flavor_code;
		private String nameC;
}
