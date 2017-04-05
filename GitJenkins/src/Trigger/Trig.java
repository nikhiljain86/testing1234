package Trigger;

import java.util.ArrayList;

import org.eclipse.jdt.internal.*;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;


public class Trig {

	public static void main(String[] args) {
		
		XmlSuite suite1 = new XmlSuite();
		suite1.setName("suite1");
		
		XmlTest test1 = new XmlTest(suite1);
		test1.setName("test1");
		
		XmlClass c1 = new XmlClass("TestCase.TC_001");
		XmlClass c2 = new XmlClass("TestCase.TC_002");
		
		ArrayList<XmlClass> ac = new ArrayList<XmlClass>();
		ac.add(c1);
		ac.add(c2);
		
		test1.setXmlClasses(ac);
		
		ArrayList<XmlTest> at = new ArrayList<XmlTest>();
		at.add(test1);
		
		suite1.setTests(at);
		
		ArrayList<XmlSuite> as = new ArrayList<XmlSuite>();
		as.add(suite1);
		
		TestNG tn = new TestNG();
	    tn.setXmlSuites(as);
        tn.run();
	}

}
