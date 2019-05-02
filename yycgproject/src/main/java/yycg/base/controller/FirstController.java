package yycg.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yycg.base.domain.Sysuser;
import yycg.base.service.SysuserService;

/**
 * Created with IDEA
 * author:bigStone
 * Date:2019/5/1
 **/
@Controller
public class FirstController {

    @Autowired
    private SysuserService sysuserService;

    @RequestMapping("/first")
    public String first(Model model) throws Exception{

        Sysuser sysuser = sysuserService.findSysuserById("189");

        model.addAttribute("sysuser", sysuser);

        return "/base/first";
    }



    @RequestMapping("/welcome")
    public String welcome() throws Exception{
        return "/base/welcome";
    }

}
