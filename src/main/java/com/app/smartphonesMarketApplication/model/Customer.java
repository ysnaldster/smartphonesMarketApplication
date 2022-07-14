package com.app.smartphonesMarketApplication.model;

public class Customer extends User{
    private String lastname;
    private String nickname;
    private String address;
    private int age;
    private String phone_number;

    public Customer(String name, String email) {
        super(name, email);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 80){
            System.out.println("You can't use SmartphonesApplication, because, You need to have a age equal to 18");
        }else{
            this.age = age;
        }
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        if(phone_number.length() < 10){
            System.out.println("Number is short, please insert a phone number equal to 10 characters");
        }else{
            this.phone_number = phone_number;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n Lastname " + lastname;
    }
}
