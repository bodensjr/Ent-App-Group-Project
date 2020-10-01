package com.volunteerSite.enterprise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class volunteerDatabase {

  @RequestMapping("/")
  public String index() {
    return "start";
  }


}
