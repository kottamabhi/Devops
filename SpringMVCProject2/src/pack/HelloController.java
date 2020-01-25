package pack;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
@RequestMapping("/hello")
public class HelloController { 
   @RequestMapping(method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "hello";
   }
}

