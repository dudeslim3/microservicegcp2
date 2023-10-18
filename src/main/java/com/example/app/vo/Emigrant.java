/*
 * package com.example.app.vo;
 * 
 * import java.io.Serializable; import java.sql.Date;
 * 
 * import javax.persistence.CascadeType; import javax.persistence.Column; import
 * javax.persistence.Entity; import javax.persistence.GeneratedValue; import
 * javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.JoinColumn; import javax.persistence.OneToOne;
 * 
 * public class Emigrant implements Serializable {
 * 
 * @Column(name = "id") private int id;
 * 
 * @Column(name = "first_name") private String firstName;
 * 
 * @Column(name = "middel_name") private String middelName;
 * 
 * @Column(name = "last_name") private String lastName;
 * 
 * @Column(name = "profession") private String profession;
 * 
 * @Column(name = "edu_qualification") private String education;
 * 
 * @Column(name = "address") private String address;
 * 
 * @Column(name = "DOB") private Date Date_of_Birth;
 * 
 * @Column(name = "gender") private String gender;
 * 
 * @Column(name = "contact_no") private String contact_no;
 * 
 * @Column(name = "email") private String email;
 * 
 * @OneToOne(cascade = CascadeType.ALL)
 * 
 * @JoinColumn(name = "passportno") private Passport passport;
 * 
 * @OneToOne(cascade = CascadeType.ALL)
 * 
 * @JoinColumn(name = "Visano") private Visa visa;
 * 
 * @Override public String toString() { return "Emigrant [id=" + id +
 * ", firstName=" + firstName + ", middelName=" + middelName + ", lastName=" +
 * lastName + ", profession=" + profession + ", education=" + education +
 * ", address=" + address + ", Date_of_Birth=" + Date_of_Birth + ", gender=" +
 * gender + ", contact_no=" + contact_no + ", email=" + email + ", passport=" +
 * passport + ", visa=" + visa + "]"; }
 * 
 * public int getId() { return id; }
 * 
 * public void setId(int id) { this.id = id; }
 * 
 * public String getFirstName() { return firstName; }
 * 
 * public void setFirstName(String firstName) { this.firstName = firstName; }
 * 
 * public String getMiddelName() { return middelName; }
 * 
 * public void setMiddelName(String middelName) { this.middelName = middelName;
 * }
 * 
 * public String getLastName() { return lastName; }
 * 
 * public void setLastName(String lastName) { this.lastName = lastName; }
 * 
 * public String getProfession() { return profession; }
 * 
 * public void setProfession(String profession) { this.profession = profession;
 * }
 * 
 * public String getEducation() { return education; }
 * 
 * public void setEducation(String education) { this.education = education; }
 * 
 * public String getAddress() { return address; }
 * 
 * public void setAddress(String address) { this.address = address; }
 * 
 * public Date getDate_of_Birth() { return Date_of_Birth; }
 * 
 * public void setDate_of_Birth(Date date_of_Birth) { Date_of_Birth =
 * date_of_Birth; }
 * 
 * public String getGender() { return gender; }
 * 
 * public void setGender(String gender) { this.gender = gender; }
 * 
 * public String getContact_no() { return contact_no; }
 * 
 * public void setContact_no(String contact_no) { this.contact_no = contact_no;
 * }
 * 
 * public String getEmail() { return email; }
 * 
 * public void setEmail(String email) { this.email = email; }
 * 
 * public Passport getPassport() { return passport; }
 * 
 * public void setPassport(Passport passport) { this.passport = passport; }
 * 
 * public Visa getVisa() { return visa; }
 * 
 * public void setVisa(Visa visa) { this.visa = visa; }
 * 
 * 
 * 
 * 
 * }
 */