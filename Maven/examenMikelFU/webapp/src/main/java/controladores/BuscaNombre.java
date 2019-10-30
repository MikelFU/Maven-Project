package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.service.ServiceInterface;
import org.service.ServicePersonas;

@WebServlet("/buscar")
public class BuscaNombre extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServiceInterface service = new ServicePersonas("com.mysql.cj.jdbc.Driver",
				"jdbc:mysql://localhost:3307/taller?useSSL=false&serverTimezone=UTC", "root", "admin");

		String busqueda = request.getParameter("busqueda");
		String parametro = request.getParameter("opciones");

		if (parametro.equalsIgnoreCase("nombre")) {
			request.setAttribute("personas", service.getByNombre(busqueda));
		} else if (parametro.equalsIgnoreCase("email")) {
			request.setAttribute("personas", service.getByEmail(busqueda));
		} else if (parametro.equalsIgnoreCase("dni")){
			request.setAttribute("personas", service.getByDni(busqueda));
		}
		
		request.getRequestDispatcher("WEB-INF/vistas/buscadoNombre.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
