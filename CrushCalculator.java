package jsp.edu.CrushCalculator;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CrushCalculator extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String crushname=req.getParameter("crushname");
		
		
		int percentage=Math.abs((name+crushname).hashCode()) %101;
		String message=" ";
		if(percentage <=20) {
			message="Bro...Focus on your carrer 📖";
		}
		else if(percentage<=50) {
			message="Friendzone Loading...👫";
		}
		else if(percentage<=70) {
			message="Something Something....💌🤟🏻";
		}
		else if(percentage<=90) {
			message="Getting Married Soon...👰‍♀️💘";
		}
		else if(percentage<=100) {
			message=" ❤️ You are the best Couples  ❤️ ....Soon Reached Social Media 🎥";
		}
		
		res.setContentType("text/html");
		PrintWriter w1= res.getWriter();
		w1.println("<html><head><style>");
		w1.println("body {"+
                           "background: radial-gradient(circle, #ff4d6d, #800f2f); "+
                            "color: white; height: 100vh; display: flex; "+
                           "flex-direction: column; justify-content: center; align-items: center;"+
                            "font-family: Arial, sans-serif; margin: 0; }");
		w1.println(".circle {"+
				"border: 8px solid rgba(255,255,255,0.3); "+
				"border-radius: 50%; width: 200px; height: 200px;"+
				"display: flex; justify-content: center; align-items: center; "+
				" font-size: 3rem; font-weight: bold; margin-bottom: 20px; }");
		w1.println("</style></head><body>");
		w1.println("<h1>Love Calculator</h1>");
		w1.println("<div class='circle'>" + percentage + "%</div>");
		w1.println("<h2>" + message + "</h2>");
		w1.println("<br><a href='crush.html' style='color:white;'>Try Again</a>");
		w1.println("</body></html>");
	}
	
}
