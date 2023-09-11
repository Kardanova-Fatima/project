package enum_package;

public enum StudyProfile {
    MATHEMATICS("Математика"),
    LITERATURE("Литература"),
    PHYSICS("Физика"),
    CHEMISTRY("Химия");

    private final String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}
