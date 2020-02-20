$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/features/LoginDatadriven.feature");
formatter.feature({
  "line": 1,
  "name": "Checking Login with Data driven appraoch",
  "description": "",
  "id": "checking-login-with-data-driven-appraoch",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Checkm Login with Dynamic Data",
  "description": "",
  "id": "checking-login-with-data-driven-appraoch;checkm-login-with-dynamic-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "When user is at loginpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user entered \"demomu@TMobMicrowave.onmicrosoft.com\" and \"4u2change!\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Verify title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the driver",
  "keyword": "And "
});
formatter.match({
  "location": "Dtat_Driven_Login.when_user_is_at_loginpage()"
});
formatter.result({
  "duration": 12171986900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demomu@TMobMicrowave.onmicrosoft.com",
      "offset": 14
    },
    {
      "val": "4u2change!",
      "offset": 57
    }
  ],
  "location": "Dtat_Driven_Login.user_entered_username_and_password(String,String)"
});
formatter.result({
  "duration": 4764079800,
  "status": "passed"
});
formatter.match({
  "location": "Dtat_Driven_Login.verify_title()"
});
formatter.result({
  "duration": 7103151000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@value\u003d\u0027No\u0027]\"}\n  (Session info: chrome\u003d79.0.3945.130)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LAPTOP-MCQ0A46L\u0027, ip: \u0027192.168.200.63\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\INOVAR~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:54379}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d91fd18371cb025124167dabacbaa3d7\n*** Element info: {Using\u003dxpath, value\u003d//input[@value\u003d\u0027No\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat com.StepDefinitions.Dtat_Driven_Login.verify_title_aroundBody4(Dtat_Driven_Login.java:78)\r\n\tat com.StepDefinitions.Dtat_Driven_Login$AjcClosure5.run(Dtat_Driven_Login.java:1)\r\n\tat org.aspectj.runtime.reflect.JoinPointImpl.proceed(JoinPointImpl.java:149)\r\n\tat io.qameta.allure.aspects.StepsAspects.step(StepsAspects.java:51)\r\n\tat com.StepDefinitions.Dtat_Driven_Login.verify_title(Dtat_Driven_Login.java:74)\r\n\tat ✽.Then Verify title(src/test/java/com/features/LoginDatadriven.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Dtat_Driven_Login.close_the_driver()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Checkm Login with Dynamic Data",
  "description": "",
  "id": "checking-login-with-data-driven-appraoch;checkm-login-with-dynamic-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "When user is at loginpage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user entered \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Verify title",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "close the driver",
  "keyword": "And "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "checking-login-with-data-driven-appraoch;checkm-login-with-dynamic-data;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 21,
      "id": "checking-login-with-data-driven-appraoch;checkm-login-with-dynamic-data;;1"
    },
    {
      "cells": [
        "demomu@TMobMicrowave.onmicrosoft.com",
        "4u2change!"
      ],
      "line": 22,
      "id": "checking-login-with-data-driven-appraoch;checkm-login-with-dynamic-data;;2"
    },
    {
      "cells": [
        "demomu@TMobMicrowave.onmicrosoft.com",
        "4u2change!"
      ],
      "line": 23,
      "id": "checking-login-with-data-driven-appraoch;checkm-login-with-dynamic-data;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 22,
  "name": "Checkm Login with Dynamic Data",
  "description": "",
  "id": "checking-login-with-data-driven-appraoch;checkm-login-with-dynamic-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "When user is at loginpage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user entered \"demomu@TMobMicrowave.onmicrosoft.com\" and \"4u2change!\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Verify title",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "close the driver",
  "keyword": "And "
});
formatter.match({
  "location": "Dtat_Driven_Login.when_user_is_at_loginpage()"
});
formatter.result({
  "duration": 10278461800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demomu@TMobMicrowave.onmicrosoft.com",
      "offset": 14
    },
    {
      "val": "4u2change!",
      "offset": 57
    }
  ],
  "location": "Dtat_Driven_Login.user_entered_username_and_password(String,String)"
});
formatter.result({
  "duration": 6835566300,
  "status": "passed"
});
formatter.match({
  "location": "Dtat_Driven_Login.verify_title()"
});
formatter.result({
  "duration": 9392601000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@value\u003d\u0027No\u0027]\"}\n  (Session info: chrome\u003d79.0.3945.130)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LAPTOP-MCQ0A46L\u0027, ip: \u0027192.168.200.63\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\INOVAR~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:54417}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: bbf6c9987ce74dc85f238bcf9fe708f0\n*** Element info: {Using\u003dxpath, value\u003d//input[@value\u003d\u0027No\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat com.StepDefinitions.Dtat_Driven_Login.verify_title_aroundBody4(Dtat_Driven_Login.java:78)\r\n\tat com.StepDefinitions.Dtat_Driven_Login$AjcClosure5.run(Dtat_Driven_Login.java:1)\r\n\tat org.aspectj.runtime.reflect.JoinPointImpl.proceed(JoinPointImpl.java:149)\r\n\tat io.qameta.allure.aspects.StepsAspects.step(StepsAspects.java:51)\r\n\tat com.StepDefinitions.Dtat_Driven_Login.verify_title(Dtat_Driven_Login.java:74)\r\n\tat ✽.Then Verify title(src/test/java/com/features/LoginDatadriven.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Dtat_Driven_Login.close_the_driver()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 23,
  "name": "Checkm Login with Dynamic Data",
  "description": "",
  "id": "checking-login-with-data-driven-appraoch;checkm-login-with-dynamic-data;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "When user is at loginpage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user entered \"demomu@TMobMicrowave.onmicrosoft.com\" and \"4u2change!\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Verify title",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "close the driver",
  "keyword": "And "
});
formatter.match({
  "location": "Dtat_Driven_Login.when_user_is_at_loginpage()"
});
formatter.result({
  "duration": 10410738900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demomu@TMobMicrowave.onmicrosoft.com",
      "offset": 14
    },
    {
      "val": "4u2change!",
      "offset": 57
    }
  ],
  "location": "Dtat_Driven_Login.user_entered_username_and_password(String,String)"
});
formatter.result({
  "duration": 4637801600,
  "status": "passed"
});
formatter.match({
  "location": "Dtat_Driven_Login.verify_title()"
});
formatter.result({
  "duration": 7111263200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@value\u003d\u0027No\u0027]\"}\n  (Session info: chrome\u003d79.0.3945.130)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LAPTOP-MCQ0A46L\u0027, ip: \u0027192.168.200.63\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\INOVAR~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:54458}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: c90204790306cea3cbfee3bca2b50315\n*** Element info: {Using\u003dxpath, value\u003d//input[@value\u003d\u0027No\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat com.StepDefinitions.Dtat_Driven_Login.verify_title_aroundBody4(Dtat_Driven_Login.java:78)\r\n\tat com.StepDefinitions.Dtat_Driven_Login$AjcClosure5.run(Dtat_Driven_Login.java:1)\r\n\tat org.aspectj.runtime.reflect.JoinPointImpl.proceed(JoinPointImpl.java:149)\r\n\tat io.qameta.allure.aspects.StepsAspects.step(StepsAspects.java:51)\r\n\tat com.StepDefinitions.Dtat_Driven_Login.verify_title(Dtat_Driven_Login.java:74)\r\n\tat ✽.Then Verify title(src/test/java/com/features/LoginDatadriven.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Dtat_Driven_Login.close_the_driver()"
});
formatter.result({
  "status": "skipped"
});
});