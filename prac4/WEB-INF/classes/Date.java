import java.io.*;
import java.util.*;
import javax.servlet.*;
public class Date extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)  throws IOException,ServletException
	{
		res.setContentType("text/html");
		printWriter out=res.getWriten();
		out.print("<html><body>");
		out.print("<b> abcd </b>");
		out.print("<b> abcd </b>");
		out.print("</body></html>");
		Date d;
		d.toString();
	}

}