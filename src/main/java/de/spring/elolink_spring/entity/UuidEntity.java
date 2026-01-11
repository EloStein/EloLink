package de.spring.elolink_spring.entity;

public class UuidEntity {

    private String uuid;

    public UuidEntity() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "ProfilePictureEntity{" +
                "uuid='" + uuid + '\'' +
                '}';
    }
}
