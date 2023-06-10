package org.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringMVCController {

    @RequestMapping("/")
    public String display(Model model)
    {
        AccountInfo accountInfo = new AccountInfo();
        accountInfo.setName("Ajay");
        model.addAttribute("name", accountInfo.getName());
        return "login";
    }
}
