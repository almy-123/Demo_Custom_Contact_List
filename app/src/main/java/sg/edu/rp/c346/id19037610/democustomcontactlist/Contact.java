package sg.edu.rp.c346.id19037610.democustomcontactlist;

public class Contact {

    private String name;
    private int countryCode;
    private int phoneNum;
    private char gender;

    public Contact(String name, int countryCode, int phoneNum, char gender){
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNum = phoneNum;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public int getCountryCode(){
        return countryCode;
    }

    public int getPhoneNum(){
        return phoneNum;
    }

    public char getGender(){
        return gender;
    }

    public void setName(String n){
        name = n;
    }

    public void setCountryCode(int cc){
        countryCode = cc;
    }

    public void setPhoneNum(int pn){
        phoneNum = pn;
    }

    public void setGender(char g){
        gender = g;
    }
}
