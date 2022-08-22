package sia.tacocloud;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Ingredient implements Persistable<String>{
  
  @Id
  private final String id;
  private final String name;
  private final Type type;

   public enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
   }

  @Override
  public boolean isNew() {
    return false;
  }

}
