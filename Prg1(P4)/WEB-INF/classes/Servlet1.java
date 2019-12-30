import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

 class Servlet1 extends HttpServlet {


  public void doGet(HttpServletRequest request,HttpServletResponse response)
  throws ServletException, IOException
  {
	  try{

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

	  		String u = request.getParameter("unm");
	  		String p = request.getParameter("pas");
	  		out.println(" hello Username : "+u);

		}
		catch(Exception e){
			System.out.println(e);
			}
 }

  public void doPost(HttpServletRequest request,HttpServletResponse response)
  throws ServletException, IOException
  {
     doGet(request, response);

  }

}