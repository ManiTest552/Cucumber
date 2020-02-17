package com.testRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

 
 
@RunWith(Cucumber.class)

@CucumberOptions (
		
		features = {"src\\test\\java\\com\\features\\LoginDatadriven.feature"}, //the path of the feature files
		glue={"com.StepDefinitions"}, //the path of the step definition files
		
 		 format = {
		                "pretty",
		                "html:test-output",
		               "json:target/cucumber-reports/Cucumber.json",
		                 "junit:junit_xml/cucumber.xml"}, 
	  
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step def file
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}		
		
		//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
		//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
		
		)

public class Runner       {

	private TestNGCucumberRunner testngCucumberrunner;
	 
	 @BeforeClass(alwaysRun= true)
	 public void setUPclass() throws Exception
	 {
		 
		 testngCucumberrunner = new TestNGCucumberRunner(this.getClass());
		  	
	 }	 
	
	 @Test(groups ="cuucmber", description ="Runs Cucumber Feature" , dataProvider= "features")
	 public void feature(CucumberFeatureWrapper cucumberfeature) {
		 
		 testngCucumberrunner.runCucumber(cucumberfeature.getCucumberFeature());
	 }
	 
	 @DataProvider
	 public Object [][]features(){
		 return testngCucumberrunner.provideFeatures();
	 }
	 
	 @AfterClass(alwaysRun=true)
	 public void tearDownClss() throws Exception {
		 
		 testngCucumberrunner.finish();
	 }
	 
}