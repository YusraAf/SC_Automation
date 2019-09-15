package org.practice.webtest.regression;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:reports/cucumber","json:reports/cucumber.json" }
, features = {"features/regression/bankTransfer.investment.feature"}
, glue = {""})
public class RegressionTestRunner {

}
