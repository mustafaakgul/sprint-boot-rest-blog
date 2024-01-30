package org.project.springbootblog.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;
import java.util.Map;

@Entity
@Table(name = "settings")
public class Settings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String siteName;

    private String siteSlogan;

    private String description;

    private String logo;

//    private List<Map<String, Object>> configList;

    public Settings() {
    }

    public Settings(long id, String siteName, String siteSlogan, String description, String logo) {
        this.id = id;
        this.siteName = siteName;
        this.siteSlogan = siteSlogan;
        this.description = description;
        this.logo = logo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteSlogan() {
        return siteSlogan;
    }

    public void setSiteSlogan(String siteSlogan) {
        this.siteSlogan = siteSlogan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "id=" + id +
                ", siteName='" + siteName + '\'' +
                ", siteSlogan='" + siteSlogan + '\'' +
                ", description='" + description + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
