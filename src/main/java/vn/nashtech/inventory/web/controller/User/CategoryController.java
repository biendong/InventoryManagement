package vn.nashtech.inventory.web.controller.User;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import vn.nashtech.inventory.web.model.Category;
import vn.nashtech.inventory.web.model.FormCategory;
import vn.nashtech.inventory.web.model.FormInput;
import vn.nashtech.inventory.web.model.User;

@Controller
public class CategoryController {

  RestTemplate rest = new RestTemplate();
  ResponseEntity<?> response;
  String message;

  @PostMapping("/create")
  public String create(FormCategory form, ModelMap model) {

    if (isOK(form).equalsIgnoreCase("Success")) {
      return "redirect:/listcategory";
    } else {
      message = isOK(form);
      model.addAttribute("messagelog", message);
      return "redirect:/create?error=true";
    }
  }

  public String isOK(FormCategory form) {
    String msg;
    try {
      response = rest.postForEntity("http://localhost:8091/category/create", form, String.class);
      msg = response.getBody().toString();
      return msg;
    } catch (HttpClientErrorException e) {
      msg = e.getResponseBodyAsString();
      return msg;
    }
  }

  @DeleteMapping("/delete/{id}")
  public String deleteCategory(ModelMap model, @PathVariable("id") Long id) {
    String msg = "";
    try {
      rest.delete("http://localhost:8091/category/delete/" + id, Category.class);
      msg = response.getBody().toString();
    } catch (HttpClientErrorException e) {
      msg = e.getResponseBodyAsString();
    }
    if (msg.equalsIgnoreCase("Success")) {
      return "redirect:/listcategory";
    } else {
      model.addAttribute("messagelog", msg);
      return "redirect:/listcategory?error=true";
    }
  }
}
