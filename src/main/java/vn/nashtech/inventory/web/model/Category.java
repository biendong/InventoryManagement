package vn.nashtech.inventory.web.model;

import java.util.Date;
import lombok.Data;

@Data
public class Category {
  private Long id;
  private String categoryCode;
  private String categoryName;
  private String categoryDescription;
  private Date createDate;
  private Date modifyDate;
  
  public Category() {
    
  }
  
  public String getCategoryCode() {
    return categoryCode;
  }
  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }
  public String getCategoryName() {
    return categoryName;
  }
  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }
  public String getCategoryDescription() {
    return categoryDescription;
  }
  public void setCategoryDescription(String categoryDescription) {
    this.categoryDescription = categoryDescription;
  }

  
  
}
