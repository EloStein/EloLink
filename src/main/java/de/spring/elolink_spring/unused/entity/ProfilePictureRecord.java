package de.spring.elolink_spring.entity;

public record ProfilePictureRecord(
        String uuid,
        String pfp
) {
    @Override
    public String uuid() {
        return uuid;
    }

    @Override
    public String pfp() {
        return pfp;
    }
}
