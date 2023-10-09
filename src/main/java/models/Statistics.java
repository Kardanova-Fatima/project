package models;

import enums.StudyProfile;

public class Statistics {
    private StudyProfile profile;
    private float avgExamScore;
    private int numberOfStudents;
    private int numberOfUniversities;
    private String universityNames;

    public Statistics(StudyProfile profile, float avgExamScore, int numberOfStudents, int getNumberOfUniversities, String universityNames) {
        this.profile = profile;
        this.avgExamScore = avgExamScore;
        this.numberOfStudents = numberOfStudents;
        this.numberOfUniversities = getNumberOfUniversities;
        this.universityNames = universityNames;
    }

    public Statistics() {

    }

    public StudyProfile getProfile() {
        return profile;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public int getNumberOfUniversities() {
        return numberOfUniversities;
    }

    public String getUniversityNames() {
        return universityNames;
    }

    public void setProfile(StudyProfile profile) {
        this.profile = profile;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void setNumberOfUniversities(int numberOfUniversities) {
        this.numberOfUniversities = numberOfUniversities;
    }

    public void setUniversityNames(String universityNames) {
        this.universityNames = universityNames;
    }
}
