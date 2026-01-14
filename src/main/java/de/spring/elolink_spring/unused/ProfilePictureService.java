package de.spring.elolink_spring.unused;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ProfilePictureService {

    @Transactional
    public String getProfilePicture(UuidEntity uuidEntity) {
        try {
            //String pfp = ProfilePictureClient.getPfP(uuidEntity.getUuid());
            System.out.println("#Received Profile Picture of Uuid " + uuidEntity.getUuid() + " from Main Server");
            return "pfp";
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public String postProfilePicture(ProfilePictureRecord pfpRecord) {
        try {
            //HttpStatusCode response = ProfilePictureClient.postPfP(pfpRecord.uuid(), pfpRecord.pfp());
            System.out.println("#Server Response: " + "response");
            return "response".toString();
        } catch (Exception e) {
            throw e;
        }
    }
}
