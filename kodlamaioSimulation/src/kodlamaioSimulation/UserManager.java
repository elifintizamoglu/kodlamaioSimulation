package kodlamaioSimulation;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getName() + " adlý kullanýcý eklendi.");
	}
	public void delete(User user) {
		System.out.println(user.getName() + " adlý kullanýcý silindi.");
	}
	public void update(User user) {
		System.out.println(user.getName() + " adlý kullanýcý güncellendi.");
	}
	public void singIn(User user) {
		System.out.println(user.getName() + " adlý kullanýcý giriþ yaptý.");
	}
	public void singOut(User user) {
		System.out.println(user.getName() + " adlý kullanýcý çýkýþ yaptý.");
	}
	public void courseActivities() {
		System.out.println("Kullanýcý kursa katýldý.");
	}
}
