package model;

public class Staff {
    private int stafftId;
    private String FirstName;
    private String LastName;
    private char Gender;
    private String phoneNo;
    private String  Address;
    private String Username;
    private String Email;
    private String Password;
    private String Dob;

    public Staff(String FirstName, String LastName, char Gender, String phoneNo, String Address, String Username, String Email, String Password, String Dob) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.phoneNo = phoneNo;
        this.Address = Address;
        this.Username = Username;
        this.Email = Email;
        this.Password = Password;
        this.Dob = Dob;
    }

    public Staff(int stafftId, String FirstName, String LastName, char Gender, String phoneNo, String Address, String Username, String Email, String Password, String Dob) {
        this.stafftId = stafftId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.phoneNo = phoneNo;
        this.Address = Address;
        this.Username = Username;
        this.Email = Email;
        this.Password = Password;
        this.Dob = Dob;
    }
    
    public int getStafftId() {
        return stafftId;
    }

    public void setStafftId(int stafftId) {
        this.stafftId = stafftId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }
    public Staff(){
        
    }
}
