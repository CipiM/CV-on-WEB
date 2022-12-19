package ro.digitalnation.myspringapi;

public class Person {
    private long id;
    private String firstName;
    private String lasttName;
    private String email;
    private String phoneNumber;
    private int note;
    private String company;
    private String gender;


    public Person() {
        this.id = id;
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.note = note;
        this.company = company;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getNote() {
        return note;
    }

    public String getCompany() {
        return company;
    }

    public String getGender() {
        return gender;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}



