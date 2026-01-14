package de.spring.elolink_spring.unused;

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
