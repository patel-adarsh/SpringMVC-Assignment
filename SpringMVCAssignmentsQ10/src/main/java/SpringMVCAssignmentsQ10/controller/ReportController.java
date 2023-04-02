package SpringMVCAssignmentsQ10.controller;

import java.util.ArrayList;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import SpringMVCAssignmentsQ10.model.User;
import SpringMVCAssignmentsQ10.view.ExcelUserListReportView;


@Controller
@RequestMapping(value="/")
public class ReportController {
 
 @RequestMapping(value="/report", method=RequestMethod.GET)
 public ModelAndView userListReport(HttpServletRequest req, HttpServletResponse res){
  
  String typeReport = req.getParameter("type");
  
  List<User> list = new ArrayList<User>();
  System.out.println(list);
  list.add(new User(1, "Username 1   ", "Gourav ", "Singh"));
  list.add(new User(2, "Username 2   ", "Rahul", "Aryan"));
  list.add(new User(3, "Username 3   ", "Aditya", "Vatts"));
  list.add(new User(4, "Username 4   ", "Anand", "Rajput"));
  list.add(new User(5, "Username 5   ", "Pushpak", "Rajput"));
  list.add(new User(6, "Username 6   ", "Rohit" , "Kumar"));
  System.out.println(list);
  
  if(typeReport != null && typeReport.equals("xls")){
   return new ModelAndView(new ExcelUserListReportView(), "userList", list);
  } 
  
  return new ModelAndView("userListReport", "userList", list);
 }
}

