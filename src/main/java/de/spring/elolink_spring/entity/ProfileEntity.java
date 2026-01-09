package de.spring.elolink_spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProfileEntity {

    @Id
    private int id;
    private String uuid;
    private String username;
    private String publicKey;
    private String profilePicture;
    private String chatColor;
    private String timestamp;
    private String description;

    public ProfileEntity(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getChatColor() {
        return chatColor;
    }

    public void setChatColor(String chatColor) {
        this.chatColor = chatColor;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProfilEntity{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", username='" + username + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                ", chatColor='" + chatColor + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
