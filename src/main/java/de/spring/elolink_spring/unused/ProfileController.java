package de.spring.elolink_spring.unused;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @RequestMapping(value = "/elolink/db/profile/addprofile", method = RequestMethod.POST)
    public String createStudent(@RequestBody ProfileEntity profileEntity){
        return profileService.addProfile(profileEntity);
    }

    @RequestMapping(value = "/elolink/db/profile/getprofiles", method = RequestMethod.GET)
    public List<ProfileEntity> readStudents(){
        return profileService.getProfiles();
    }
//
//    @RequestMapping(value = "updatestudent", method = RequestMethod.PUT)
//    public String updateStudent(@RequestBody StudentEntity student){
//        return studentService.updateStudent(student);
//    }
//
//    @RequestMapping(value = "deletestudent", method = RequestMethod.DELETE)
//    public String deleteStudent(@RequestBody StudentEntity student){
//        return studentService.deleteStudent(student);
//    }
}
