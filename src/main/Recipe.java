package main;

public class Recipe {
	private int RecipeID;
	private String RecipeName;
	private String Description;
	private Recipe NextRecipeName;
	private int count;
	private Product ProductList;
	
	public Recipe(int id, String name) {
		setRecipeID(id);
		setRecipeName(name);
		setDescription(null);
		setNextRecipeName(null);
		setCount(0);
		
	}
	
	public int getRecipeID() {
		return RecipeID;
	}
	public void setRecipeID(int recipeID) {
		RecipeID = recipeID;
	}
	public String getRecipeName() {
		return RecipeName;
	}
	public void setRecipeName(String recipeName) {
		RecipeName = recipeName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Recipe getNextRecipeName() {
		return NextRecipeName;
	}
	public void setNextRecipeName(Recipe nextRecipeName) {
		NextRecipeName = nextRecipeName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

}
