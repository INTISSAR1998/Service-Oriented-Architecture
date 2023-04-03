import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;

public class ClientHello {
	public static void main(String[] args) {
		ClientRequest request1 = new ClientRequest("http://localhost:8080/helloRESTEasy/MyRESTApplication");
		ClientRequest request2 = new ClientRequest("http://localhost:8080/ helloRESTEasy/MyRESTApplication/hello/{n}");
		request2.pathParameter("n", "foulen");
		ClientRequest request3 = new ClientRequest("http://localhost:8080/ helloRESTEasy/MyRESTApplication/hello2");
		request3.queryParameter("name", "foulen");
		ClientResponse<String> res1, res2, res3;
		try {
			res1 = request1.get(String.class);
			System.out.println(res1.getEntity());
			res2 = request2.get(String.class);
			System.out.println(res2.getEntity());
			res3 = request3.get(String.class);
			System.out.println(res3.getEntity());
		} catch (Exception e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}