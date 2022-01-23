package oopWorkshop1;

public class Category {

	private int id;
	private String categoryName;
	private Course[] courses;
	
	public Category() {
		
	}
	
	public Category(int id, String categoryName) {
		super();
		this.id = id;
		this.categoryName = categoryName;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	
	
	
	
	
	
}
