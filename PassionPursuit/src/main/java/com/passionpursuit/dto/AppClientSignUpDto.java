package com.passionpursuit.dto;

import com.passionpursuit.entities.enums.GenderEnum;

public class AppClientSignUpDto {
    private String username;
    private String fullName;
    private GenderEnum gender;
    private String email;
    private String password;

    public AppClientSignUpDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	@Override
	public String toString() {
		return "AppClientSignUpDto [username=" + username + ", fullName=" + fullName + ", gender=" + gender + ", email="
				+ email + ", password=" + password + "]";
	}


}
