package model;

import com.google.gson.annotations.SerializedName;
import enums.StudyProfile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
public class University {
    @SerializedName("universityId")
    @XmlElement(name = "universityId")
    private String id;
    @SerializedName("universityName")
    @XmlElement(name = "universityName")
    private String fullName;
    @SerializedName("universityShortName")
    @XmlTransient
    private String shortName;
    @SerializedName("yearOfFoundation")
    @XmlTransient
    private int yearOfFoundation;
    @SerializedName("profile")
    @XmlElement(name = "universityProfile")
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
