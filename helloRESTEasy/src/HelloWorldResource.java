import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/MyRESTApplication")
public class HelloWorldResource {
	@GET
	@Produces("text/plain")
	public String SayHello()
	{
	return "Hello World!";
	}
	
	@GET
	@Path("/hello/{name}")
	@Produces("text/plain")
	public String SayHello(@PathParam("name") String name)
	{
	return "Hello " + name + " !";
	}
	
	@GET
	@Path("/hello2")
	@Produces("text/plain")
	public String SayHello2(@QueryParam("name") String name)
	{
	return "Hello " + name + " !";
	}
}
