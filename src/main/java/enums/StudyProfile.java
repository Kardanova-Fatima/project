package enums;

public enum StudyProfile {
    MATHEMATICS("Математика"),
    LITERATURE("Литература"),
    PHYSICS("Физика"),
    LINGUISTICS("Лингвистика"),
    MEDICINE("Медицина");


    private final String profileName;

    private StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }
}
