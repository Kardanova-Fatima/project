package models;

import enums.StudyProfile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
public class Statistics {
    @XmlElement(name = "universityProfile")
    private StudyProfile profile;
    @XmlElement(name = "avgScore")
    private float avgExamScore;
    @XmlTransient
    private int numberOfStudents;
    @XmlTransient
    private int numberOfUniversities;
    @XmlTransient
    private String universityNames;


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

    public Statistics setProfile(StudyProfile profile) {

        this.profile = profile;
        return this;
    }

    public Statistics setAvgExamScore(float avgExamScore) {

        this.avgExamScore = avgExamScore;
        return this;
    }

    public Statistics setNumberOfStudents(int numberOfStudents) {

        this.numberOfStudents = numberOfStudents;
        return this;
    }

    public Statistics setNumberOfUniversities(int numberOfUniversities) {
        this.numberOfUniversities = numberOfUniversities;
        return this;
    }

    public Statistics setUniversityNames(String universityNames) {

        this.universityNames = universityNames;
        return this;
    }
}
