package yhj_java.product;

import java.sql.Date;

public class ProductVo {
	private int productNo;
	private String productName;
	private String publeYear;
	private String publisher;
	private String cateCode;
	private String cateName;
	private int productPrice;
	private int ProductStock;
	private double productDiscount;
	private String productIntro;
	private String productContents;
	private Date regDate;
	private Date updateDate;
	
	
	public ProductVo(int productNo, String productName, String publeYear, String publisher, String cateCode,
			String cateName, int productPrice, int productStock, double productDiscount, String productIntro,
			String productContents, Date regDate, Date updateDate) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.publeYear = publeYear;
		this.publisher = publisher;
		this.cateCode = cateCode;
		this.cateName = cateName;
		this.productPrice = productPrice;
		ProductStock = productStock;
		this.productDiscount = productDiscount;
		this.productIntro = productIntro;
		this.productContents = productContents;
		this.regDate = regDate;
		this.updateDate = updateDate;
	}
	public ProductVo() {
		// TODO Auto-generated constructor stub
	}
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPubleYear() {
		return publeYear;
	}
	public void setPubleYear(String publeYear) {
		this.publeYear = publeYear;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getCateCode() {
		return cateCode;
	}
	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductStock() {
		return ProductStock;
	}
	public void setProductStock(int productStock) {
		ProductStock = productStock;
	}
	public double getProductDiscount() {
		return productDiscount;
	}
	public void setProductDiscount(double productDiscount) {
		this.productDiscount = productDiscount;
	}
	public String getProductIntro() {
		return productIntro;
	}
	public void setProductIntro(String productIntro) {
		this.productIntro = productIntro;
	}
	public String getProductContents() {
		return productContents;
	}
	public void setProductContents(String productContents) {
		this.productContents = productContents;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "ProductVo [productNo=" + productNo + ", productName=" + productName + ", publeYear=" + publeYear
				+ ", publisher=" + publisher + ", cateCode=" + cateCode + ", cateName=" + cateName + ", productPrice="
				+ productPrice + ", ProductStock=" + ProductStock + ", productDiscount=" + productDiscount
				+ ", productIntro=" + productIntro + ", productContents=" + productContents + ", regDate=" + regDate
				+ ", updateDate=" + updateDate + "]";
	}
	
	
	
}
