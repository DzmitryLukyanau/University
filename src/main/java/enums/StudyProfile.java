package enums;
public enum StudyProfile {
    MEDICINE("��������"),
    COMPUTER_SCIENCE("�����������"),
    LINGUISTICS("�����������"),
    MATHEMATICS("����������"),
    PHYSICS("������");

    private final String profileName;

    private StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }
}

