package customreporting;

import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.TestListenerAdapter;
import org.testng.xml.XmlSuite;

public class Reporter extends TestListenerAdapter implements IReporter {
	
	@Override
	public void generateReport(List<XmlSuite> arg0, List<ISuite> arg1,
			String arg2) {
		
		
	}

}
