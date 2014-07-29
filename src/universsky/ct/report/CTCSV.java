/**
 * CTCSV.java
 * universsky.ct.report
 * ReportServlet
 */
package universsky.ct.report;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import universsky.ct.dao.CSVDao;
import com.google.gson.Gson;

/**
 * @author �����¹⽣ 2014��5��22�� ����4:11:25
 * 
 */
public class CTCSV extends HttpServlet {
	private static final long serialVersionUID = -7184897828465935426L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		run_stamp = req.getParameter("run_stamp");
		callback = req.getParameter("callback");

		CSVDao dao = new CSVDao();
		Gson gson = new Gson();
		String json = gson.toJson(dao);
		// ��console�ϴ�ӡ��¼
		System.out.println(callback + "(" + json + ")");
		// set the content type & character encoding
		resp.setContentType("application/Json;UTF-8");
		resp.setCharacterEncoding("UTF-8");

		PrintWriter out = resp.getWriter();
		out.print(callback + "(" + json + ")");
		out.flush();
	}

	public String getRun_stamp() {
		return run_stamp;
	}

	public void setRun_stamp(String run_stamp) {
		CTCpuUsage.run_stamp = run_stamp;
	}

	static String run_stamp;
	static String callback;
}