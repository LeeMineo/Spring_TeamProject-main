package com.spring.animal;

import java.util.Date;

public class AnimalVO {
	private int animalId;
	private String animalName;
	private int age;
	private String gender;
	private String information;
	private String phonenumber;
	private String address;
	private Date regdate;
	private String photo;
	private int cnt;

	public int getAnimalId() {return animalId;}
	public void setAnimalId(int animalId) {this.animalId = animalId;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public String getGender() {return gender;}
	public void setGender(String gender) {this.gender = gender;}
	public String getAnimalName() {return animalName;}
	public void setAnimalName(String animalName) {this.animalName = animalName;}
	public String getInformation() {return information;}
	public String getPhonenumber() {return phonenumber;}
	public void setPhonenumber(String phonenumber) {this.phonenumber = phonenumber;}
	public void setInformation(String information) {this.information = information;}
	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}
	public String getPhoto() {return photo;}
	public void setPhoto(String photo) {this.photo = photo;}
	public int getCnt() {return cnt;}
	public void setCnt(int cnt) {this.cnt = cnt;}
	public Date getRegdate() {return regdate;}
	public void setRegdate(Date regdate) {this.regdate = regdate;}


}
