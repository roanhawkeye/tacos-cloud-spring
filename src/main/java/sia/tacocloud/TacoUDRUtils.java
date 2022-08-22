package sia.tacocloud;


public class TacoUDRUtils {

  public static IngredientUDT toIngredientUDT(Ingredient ingredient){
    return new IngredientUDT(ingredient.getName(), ingredient.getType());
  }

  public static TacoUDT tacoUDT(Taco taco){
    return new TacoUDT(taco.getName(), taco.getIngredients());
  }
  
}
