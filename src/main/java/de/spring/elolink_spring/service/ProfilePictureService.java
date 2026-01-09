package de.spring.elolink_spring.service;

import de.spring.elolink_spring.entity.UuidEntity;
import de.spring.elolink_spring.http.ProfilePictureClient;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ProfilePictureService {

    @Transactional
    public String getProfilePicture(UuidEntity uuidEntity) {
        try {
            String base64 = ProfilePictureClient.getPfP(uuidEntity.getUuid());
            System.out.println("#Received Profile Picture of Uuid " + uuidEntity.getUuid() + " from Main Server");
            return base64;
        } catch (Exception e) {
            throw e;
        }
    }
}
