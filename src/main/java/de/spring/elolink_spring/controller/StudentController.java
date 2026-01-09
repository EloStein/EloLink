package de.spring.elolink_spring.controller;

import de.spring.elolink_spring.entity.StudentEntity;
import de.spring.elolink_spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info(){
        return "Application is running";
    }


    @RequestMapping(value = "createstudent", method = RequestMethod.POST)
    public String createStudent(@RequestBody StudentEntity student){
        return studentService.createStudent(student);
    }

    @RequestMapping(value = "readstudents", method = RequestMethod.GET)
    public List<StudentEntity> readStudents(){
        return studentService.readStudents();
    }

    @RequestMapping(value = "updatestudent", method = RequestMethod.PUT)
    public String updateStudent(@RequestBody StudentEntity student){
        return studentService.updateStudent(student);
    }

    @RequestMapping(value = "deletestudent", method = RequestMethod.DELETE)
    public String deleteStudent(@RequestBody StudentEntity student){
        return studentService.deleteStudent(student);
    }
}
