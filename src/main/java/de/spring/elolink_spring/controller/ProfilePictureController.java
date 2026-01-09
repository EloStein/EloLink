package de.spring.elolink_spring.controller;

import de.spring.elolink_spring.entity.UuidEntity;
import de.spring.elolink_spring.service.ProfilePictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfilePictureController {

    @Autowired
    private ProfilePictureService profilePictureService;

    @RequestMapping(value = "/elolink/http/getpfp", method = RequestMethod.GET)
    public String getProfilePicture(@RequestBody UuidEntity uuidEntity){
        return profilePictureService.getProfilePicture(uuidEntity);
    }
}
