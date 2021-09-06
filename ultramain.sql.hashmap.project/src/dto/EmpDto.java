package dto;

public class EmpDto {
	private int Id;
	private String Fname;
	private String Lname;
	private String Mail;

	public EmpDto(int id, String fname, String lname, String mail) {
		this.Id = id;
		this.Fname = fname;
		this.Lname = lname;
		this.Mail = mail;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

}
