package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ConvertController {
    @RequestMapping("/convert")
    public ModelAndView convert (HttpServletRequest req , HttpServletResponse resp){
        int i = Integer.parseInt(req.getParameter("usd"));
        int j = Integer.parseInt(req.getParameter("rate"));
        int z = j*i;

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result", z);
        return mv;

    }
}
