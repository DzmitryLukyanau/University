package model;

import com.google.gson.annotations.SerializedName;
import enums.StudyProfile;

public class University {
    @SerializedName("universityId")
    private String id;
    @SerializedName("universityName")
    private String fullName;
    @SerializedName("universityShortName")
    private String shortName;
    @SerializedName("yearOfFoundation")
    private int yearOfFoundation;
    @SerializedName("profile")
    private StudyProfile mainProfile;

    public University setId(String id) {
        this.id = id;
        return this;
    }

    public University setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public University setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public University setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
        return this;
    }

    public University setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
        return this;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    @Override
    public String toString() {
        return String.format("Id: %s, FullName: %s, ShortName: %s, YearOfFoundation: %s, MainProfile: %s",
                this.id,
                this.fullName,
                this.shortName,
                this.yearOfFoundation,
                this.mainProfile);
    }
}
