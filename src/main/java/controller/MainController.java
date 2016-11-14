package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Tsymbaliuk Serhii on 14.11.2016.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greeting(Model model) {
        model.addAttribute("string","Hello");
        return "index";
    }

    @RequestMapping(value = "/ajaxtest1", method = RequestMethod.GET)
    @ResponseBody
    public Set<String> ajaxTest() {
        Set<String> records = new HashSet<String>();
        records.add("Record #1");
        return records;
    }
    @RequestMapping(value = "/ajaxtest2", method = RequestMethod.GET)
    @ResponseBody
    public Set<String> ajaxTest2() {
        Set<String> records = new HashSet<String>();
        records.add("Record #2");
        return records;
    }
}
