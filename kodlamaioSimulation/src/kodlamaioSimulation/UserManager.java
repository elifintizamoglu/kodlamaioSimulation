package kodlamaioSimulation;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getName() + " adl� kullan�c� eklendi.");
	}
	public void delete(User user) {
		System.out.println(user.getName() + " adl� kullan�c� silindi.");
	}
	public void update(User user) {
		System.out.println(user.getName() + " adl� kullan�c� g�ncellendi.");
	}
	public void singIn(User user) {
		System.out.println(user.getName() + " adl� kullan�c� giri� yapt�.");
	}
	public void singOut(User user) {
		System.out.println(user.getName() + " adl� kullan�c� ��k�� yapt�.");
	}
	public void courseActivities() {
		System.out.println("Kullan�c� kursa kat�ld�.");
	}
}
