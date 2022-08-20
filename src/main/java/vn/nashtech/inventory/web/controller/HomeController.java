package vn.nashtech.inventory.web.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import vn.nashtech.inventory.web.model.Category;
import vn.nashtech.inventory.web.model.User;

@Controller
public class HomeController {
    ObjectMapper obj= new ObjectMapper();
    RestTemplate rest = new RestTemplate();
    ResponseEntity<?> response;
    @GetMapping(value= { "/", "/index" })
    public String index(Model model) {

        return "homePage";
    }
    @GetMapping ("/test")
    public String test (Model model){
        return  "test";
    }
    @GetMapping ("/signin")
    public String login (Model model){

      return  "signin";
    }


    @GetMapping ("/signup")
    public String register (Model model){
        return  "signup";
    }
    @GetMapping ("/403")
    public String forbiden (Model model){
        return  "403";
    }
    @GetMapping ("/profile")
    public String profile (Model model){
        return  "profile";
    }
    @GetMapping ("/listuser")
    public String listuser (Model model) throws JsonProcessingException {
        String rs;
        rs= rest.getForObject("http://localhost:8090/user/listUser", String.class);
        List<User> listUser = obj.readValue(rs, new TypeReference<List<User>>() {
            @Override public int compareTo(TypeReference<List<User>> o) {
                return super.compareTo(o);
            }
        });
        model.addAttribute("listofuser",listUser);
        return  "listuser";
    }

    @GetMapping ("/listcategory")
    public String listcategory (Model model) throws JsonProcessingException {
        String rs;
        rs= rest.getForObject("http://localhost:8091/category/listCategory", String.class);
        List<Category> listCategory = obj.readValue(rs, new TypeReference<List<Category>>() {
            @Override public int compareTo(TypeReference<List<Category>> o) {
                return super.compareTo(o);
            }
        });
        model.addAttribute("listofcategory",listCategory);
        return  "listcategory";
    }
    
    @GetMapping ("/create")
    public String updatecategory (Model model){
      return  "createcategory";
  }
    
    @GetMapping ("/delete/{id}")
    public String deletecategory (Model model){
      return  "listcategory";
  }
}
