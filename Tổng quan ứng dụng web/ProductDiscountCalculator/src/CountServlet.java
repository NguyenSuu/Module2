import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet",urlPatterns = "/display-discount")
public class CountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("Product Description");
        float listPrice = Float.parseFloat(request.getParameter("List Price"));
        float discountPercent = Float.parseFloat(request.getParameter("Discount Percent"));
        Double discountAmount = listPrice * discountPercent * 0.01;
        Double discountPrice = listPrice - discountAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<style>");
        writer.println("#main{");
        writer.println("width: 554px;");
        writer.println("border: 2px solid blue;");
        writer.println("height: 350px;");
        writer.println("padding: 10px;");
        writer.println("}");
        writer.println(".row {");
        writer.println("width: 100%;");
        writer.println("clear: both;");
        writer.println("}");
        writer.println(".left{");
        writer.println("width: 200px;");
        writer.println("float: left;");
        writer.println("}");
        writer.println(".right{");
        writer.println("width: 350px;");
        writer.println("height: 50px;");
        writer.println("float: right;");
        writer.println("display: flex;");
        writer.println("align-items: center;");
        writer.println("}");
        writer.println(" #top{");
        writer.println("text-align: center;");
        writer.println("}");
        writer.println("button {");
        writer.println("padding: 10px;");
        writer.println("}");
        writer.println("</style>");
        writer.println("<body>");
        writer.println(" <div id=\"main\">");
        writer.println("<div id=\"top\">");
        writer.println("<h2>Product Discount Calculator</h2>");
        writer.println(" </div>");
        writer.println("<div id=\"bottom\">");
        writer.println("<div class=\"row\">");
        writer.println("<div class=\"left\">");
        writer.println(" <p>Product Description:</p>");
        writer.println("</div>");
        writer.println("<div class=\"right\">");
        writer.println("<p>"+productDescription+"<p>");
        writer.println("</div>");
        writer.println("</div>");
        writer.println("<div class=\"row\">");
        writer.println("<div class=\"left\">");
        writer.println("<p>List Price:</p>");
        writer.println(" </div>");
        writer.println("<div class=\"right\">");
        writer.println("<p>"+listPrice+"<p>");
        writer.println(" </div>");
        writer.println(" </div>");
        writer.println("<div class=\"row\">");
        writer.println("<div class=\"left\">");
        writer.println("<p>Discount Percent:</p>");
        writer.println("</div>");
        writer.println("<div class=\"right\">");
        writer.println("<p>"+discountPercent+"<p>(%)");
        writer.println("</div>");
        writer.println(" </div>");
        writer.println("<div class=\"row\">");
        writer.println("<div class=\"left\">");
        writer.println("<p>Discount Amount</p>");
        writer.println(" </div>");
        writer.println("<div class=\"right\">");
        writer.println(" <p>"+discountAmount+"<p>");
        writer.println("</div>");
        writer.println("<div class=\"row\">");
        writer.println("<div class=\"left\">");
        writer.println("<p>Discount Price</p>");
        writer.println(" </div>");
        writer.println("<div class=\"right\">");
        writer.println(" <p>"+discountPrice+"<p>");
        writer.println("</div>");
        writer.println("</div>");
        writer.println("</div>");
        writer.println("</div>");
        writer.println(" </div>");
        writer.println("</body>");
        writer.println("</html>");

    }
}











