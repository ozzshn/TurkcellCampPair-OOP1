package oopWorkshop1;

public class Main {

	//oopworkshop1 projesi
	//4tane nesnesi olan
	//fields: kurslar, programlama dilleri, eðitmen
	//bir kursun birden fazla eðitmeni olabilir
	
	public static void main(String[] args) {
	
		Instructor instructor1=new Instructor(1,"Engin Demirog");
		Instructor instructor2=new Instructor(2,"Oznur Sahin");
	    
		Course course1=new Course(1," Java ");
		Course course2=new Course(2," C#");
		
		Category category1=new Category(1,"Yazýlým");
	
		Course[] courses={course1,course2};
		Instructor[] instructors= {instructor1,instructor2};
		course1.setCategory(category1);
		course2.setCategory(category1);
		course1.setInstructor(new Instructor[] {instructor1});
		course2.setInstructor(new Instructor[] {instructor1,instructor2});
		
		
		
		for(Course c :courses) {
			System.out.println("Kurs: "+ c.getName());
			for(Instructor i:c.getInstructor()) {
				System.out.println("Eðitmen: "+i.getName());
			}
			System.out.println("--------------------");
		}
	}
}
