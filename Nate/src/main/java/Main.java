import org.hibernate.SessionFactory;

public class Main {
	
	public static void main(String arg[]) {
		SessionFactory session = HibernateUtil.getSessionFactory();
	}
}
