package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public interface Action {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws SQLException;
}
