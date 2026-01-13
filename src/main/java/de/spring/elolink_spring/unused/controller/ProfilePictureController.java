package de.spring.elolink_spring.controller;

import de.spring.elolink_spring.entity.ProfilePictureRecord;
import de.spring.elolink_spring.entity.UuidEntity;
import de.spring.elolink_spring.service.ProfilePictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfilePictureController {

    @Autowired
    private ProfilePictureService profilePictureService;

//    @RequestMapping(value = "/elolink/get/profilePicture", method = RequestMethod.GET)
//    public String getProfilePicture(@RequestBody U){
//        return profilePictureService.getProfilePicture(uuidEntity);
//    }

//    @RequestMapping(value = "/elolink/post/profilePicture", method = RequestMethod.POST)
//    public String postProfilePicture(@RequestBody UuidEntity uuidEntity){
//        return profilePictureService.postProfilePicture(uuidEntity);
//    }
}
