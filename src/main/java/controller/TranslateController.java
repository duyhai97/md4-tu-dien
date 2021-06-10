package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TranslateController {

@GetMapping("/view")
    public ModelAndView showForm(){
    return new ModelAndView("/view");
}
@PostMapping("/view")
    public ModelAndView translate(String search){
    ModelAndView modelAndView = new ModelAndView("/view");
     Map<String,String > dic = new HashMap<>();
    dic.put("hello", "Xin chào");
    dic.put("how", "Thế nào");
    dic.put("book", "Quyển vở");
    dic.put("computer", "Máy tính");
    String result = dic.get(search);
    String error = "Khong tim thay";
    if (result != null){
       return modelAndView.addObject("result", result);
    }
    else return modelAndView.addObject("result", error);
}

}
