package sia.tacocloud;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Document(collection = "ingredients")
public class Ingredient{
  
  @Id
  private final String id;
  private final String name;
  private final Type type;

   public enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
   }

}
