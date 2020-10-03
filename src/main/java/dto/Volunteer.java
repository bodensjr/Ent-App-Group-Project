package dto;


public
class Volunteer {


    private int volunteerID;
    private String volunteerEmail;
    private String volunteerUser;
    private String volunteerPass;
    public String testField;

    public Volunteer() {
    }

    public void setVolunteerID(int ID) {
        this.volunteerID = ID;
    }
    public void setVolunteerUser(String user) {
        this.volunteerUser = user;
    }
    public void setVolunteerPass(String pass) {
        this.volunteerPass = pass;
    }


}
