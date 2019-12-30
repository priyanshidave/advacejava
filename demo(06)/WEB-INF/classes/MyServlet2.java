import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyServlet2 extends HttpServlet
{
	 public void doGet(HttpServletRequest request,
    	HttpServletResponse response)
    {
   		try
   			{
       			response.setContentType("text/html");
       			PrintWriter pwriter = response.getWriter();

       			Cookie c[]=request.getCookies();
       			pwriter.print("Name: "+c[1].getValue());
       			pwriter.print("Password: "+c[2].getValue());

       			pwriter.close();
    		}
    	catch(Exception exp)
    		{
       			System.out.println(exp);
     		}
	}
}