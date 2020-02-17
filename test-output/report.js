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
  "duration": 14743490300,
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
  "duration": 6492578200,
  "status": "passed"
});
formatter.match({
  "location": "Dtat_Driven_Login.verify_title()"
});
formatter.result({
  "duration": 18205198200,
  "status": "passed"
});
formatter.match({
  "location": "Dtat_Driven_Login.close_the_driver()"
});
formatter.result({
  "duration": 3100808699,
  "status": "passed"
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
  "duration": 17878591699,
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
  "duration": 6214503300,
  "status": "passed"
});
formatter.match({
  "location": "Dtat_Driven_Login.verify_title()"
});
formatter.result({
  "duration": 20082098900,
  "status": "passed"
});
formatter.match({
  "location": "Dtat_Driven_Login.close_the_driver()"
});
formatter.result({
  "duration": 3071231001,
  "status": "passed"
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
  "duration": 11169601601,
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
  "duration": 6970127000,
  "status": "passed"
});
formatter.match({
  "location": "Dtat_Driven_Login.verify_title()"
});
formatter.result({
  "duration": 19822249900,
  "status": "passed"
});
formatter.match({
  "location": "Dtat_Driven_Login.close_the_driver()"
});
formatter.result({
  "duration": 3074332599,
  "status": "passed"
});
});