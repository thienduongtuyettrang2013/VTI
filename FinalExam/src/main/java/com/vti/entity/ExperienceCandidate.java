package com.vti.entity;

public class ExperienceCandidate extends Candidate {
    private int ExpInYear;
    private String ProSkill;


    public ExperienceCandidate(int id, String fullName, String phone, String email, String password, String role, int expInYear, String proSkill) {
        super(id, fullName, phone, email, password, role);
        ExpInYear = expInYear;
        ProSkill = proSkill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }



    @Override
    public String toString() {
        return "com.vti.entity.ExperienceCandidate{" +
                "ExpInYear=" + ExpInYear +
                ", ProSkill='" + ProSkill + '\'' +
                '}';
    }
}