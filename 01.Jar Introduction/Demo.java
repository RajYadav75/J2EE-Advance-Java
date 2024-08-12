public class Demo{
	public static void main(String... args){
	User u = new User();
	System.out.println(u.hashCode());

	Student s = new Student();
	System.out.println(s.hashCode());
}
}