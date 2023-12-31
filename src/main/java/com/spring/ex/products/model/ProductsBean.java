package com.spring.ex.products.model;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

public class ProductsBean {
	private int productsnum;
	
	@NotBlank(message = "구분을 선택하세요")
	private String kind;
	
	@NotBlank(message = "상품명을 입력하세요")
	private String name;
	
	@NotBlank(message = "상품설명을 입력하세요")
	private String info;
	
	@NotBlank(message = "가격을 입력하세요")
	private String price;
	
	@NotEmpty(message = "이미지는 한 개 이상 업로드 해야합니다.")
	private String image;
	private String seller;
	private String inputdate;
	private int state;
	private int readcount;
	
	//crewboardList에 댓글개수 출력하기 위해서
	private int comments;
	
	public int getComments() {
		return comments;
	}
	public void setComments(int comments) {
		this.comments = comments;
	}

	//////////
	private MultipartFile upload;
	
	public MultipartFile getUpload() {
		return upload;
	}
	public void setUpload(MultipartFile upload) {
		System.out.println("setUpload()");
		this.upload = upload;
		
		String fileName = upload.getOriginalFilename();
		System.out.println("fileName : "+fileName);
		
		this.image = fileName;
	}
	
	private String upload2; // 수정폼을 띄울때 기존이미지를 담을 변수
	
	public String getUpload2() {
		return upload2;
	}
	public void setUpload2(String upload2) {
		this.upload2 = upload2;
	}
	/////////
	
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getProductsnum() {
		return productsnum;
	}
	public void setProductsnum(int productsnum) {
		this.productsnum = productsnum;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public String getInputdate() {
		return inputdate;
	}
	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
}
