package enums;
public enum StudyProfile {
    MEDICINE("Медицина"),
    COMPUTER_SCIENCE("Информатика"),
    MATHEMATICS("Математика"),
    PHYSICS("Физика");

    private final String profileName;

    private StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }
}

