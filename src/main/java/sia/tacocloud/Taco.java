package sia.tacocloud;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.Data;

@Data
@Entity
@RestResource(rel = "tacos", path = "tacos")
public class Taco {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private Date createdAt = new Date();
  
  @NotNull
  @Size(min = 5, message = "Name must be at least 5 characters long")
  private String name;

  
  @Size(min = 1, message = "You must choose at least 1 ingredient")
  @ManyToMany
  private List<Ingredient> ingredients;

}
