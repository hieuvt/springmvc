package com.imipgroup.hieuvt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
@SessionAttributes("thought")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/allStudents", method = RequestMethod.GET)
    public String getAllStudents(ModelMap model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "allStudents";
    }

    @RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student(){
        return new ModelAndView("student", "command", new Student());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model){
        if (!model.containsAttribute("thought")){
            model.addAttribute("thought", student.getName());
        }
        model.addAttribute("name", student.getName());
        return "result";
    }


}