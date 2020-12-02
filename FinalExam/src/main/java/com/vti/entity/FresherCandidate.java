package com.vti.entity;

public class FresherCandidate extends Candidate {

    private String GraduationRank;

    public FresherCandidate(int id, String fullName, String phone, String email, String password, String role, String graduationRank) {
        super(id, fullName, phone, email, password, role);
        GraduationRank = graduationRank;
    }

    public String getGraduationRank() {
        return GraduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        GraduationRank = graduationRank;
    }

    @Override
    public String toString() {
        return "com.vti.entity.FresherCandidate{" +
                "GraduationRank='" + GraduationRank + '\'' +
                '}';
    }
}