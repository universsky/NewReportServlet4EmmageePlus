/**
 * CSVDao.java
 * universsky.ct.dao
 * ReportServlet
 */
package universsky.ct.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import universsky.ct.report.CTCSV;
import universsky.ct.result.CSVFileIO;

/**
 * @author �����¹⽣ 2014��5��22�� ����4:10:52
 * 
 */
public class CSVDao {

	private String run_stamp = (new CTCSV()).getRun_stamp();
	List<HashMap<String, ArrayList<String>>> result = (new CSVFileIO())
			.query(run_stamp);

}
