package kodlamaioSimulation;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student();
		student1.setId(1);
		student1.setName("Ayşe Yılmaz");
		student1.setEmail("ayse@gmail.com");
		student1.setPassword("123456789");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(100);
		instructor1.setName("Engin Demiroğ");
		instructor1.setEmail("engin@gmail.com");
		instructor1.setPassword("987654321");
		instructor1.setExperience("15 years");
		
		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.add(instructor1);
		
		System.out.println(student1.getName());
		
		RegisterManager registerManager = new RegisterManager();
		registerManager.activities(new InstructorManager());
		registerManager.activities(new StudentManager());
		


	}

}
