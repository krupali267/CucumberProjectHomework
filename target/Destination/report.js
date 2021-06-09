$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "line": 3,
  "name": "Login Function",
  "description": "",
  "id": "login-function",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ll"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "user should not be able to login with invalid email-id and password",
  "description": "",
  "id": "login-function;user-should-not-be-able-to-login-with-invalid-email-id-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user type \"\u003cemailId\u003e\"and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should not be able to login",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user should get \"\u003cerrorMessage\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "login-function;user-should-not-be-able-to-login-with-invalid-email-id-and-password;",
  "rows": [
    {
      "cells": [
        "emailId",
        "password",
        "errorMessage"
      ],
      "line": 15,
      "id": "login-function;user-should-not-be-able-to-login-with-invalid-email-id-and-password;;1"
    },
    {
      "cells": [
        "krupali123@test.com",
        "",
        "Login was unsuccessful. Please correct the errors and try again. No customer account found"
      ],
      "line": 16,
      "id": "login-function;user-should-not-be-able-to-login-with-invalid-email-id-and-password;;2"
    },
    {
      "cells": [
        "",
        "test1235",
        "Please enter your email"
      ],
      "line": 17,
      "id": "login-function;user-should-not-be-able-to-login-with-invalid-email-id-and-password;;3"
    },
    {
      "cells": [
        "krup564@test.com",
        "delta123",
        "Login was unsuccessful. Please correct the errors and try again. No customer account found"
      ],
      "line": 18,
      "id": "login-function;user-should-not-be-able-to-login-with-invalid-email-id-and-password;;4"
    },
    {
      "cells": [
        "",
        "",
        "Please enter your email"
      ],
      "line": 19,
      "id": "login-function;user-should-not-be-able-to-login-with-invalid-email-id-and-password;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 12309674600,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "user should not be able to login with invalid email-id and password",
  "description": "",
  "id": "login-function;user-should-not-be-able-to-login-with-invalid-email-id-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ll"
    },
    {
      "line": 5,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user type \"krupali123@test.com\"and \"\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should not be able to login",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user should get \"Login was unsuccessful. Please correct the errors and try again. No customer account found\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDef.user_is_on_homepage()"
});
formatter.result({
  "duration": 16372050500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.userClicksOnLoginButton()"
});
formatter.result({
  "duration": 1536998000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "krupali123@test.com",
      "offset": 11
    },
    {
      "val": "",
      "offset": 36
    }
  ],
  "location": "MyStepDef.userTypeAnd(String,String)"
});
formatter.result({
  "duration": 863456100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.userClicksOnLoginButton()"
});
formatter.result({
  "duration": 1491190100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.userShouldNotBeAbleToLogin()"
});
formatter.result({
  "duration": 608247300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login was unsuccessful. Please correct the errors and try again. No customer account found",
      "offset": 17
    }
  ],
  "location": "MyStepDef.userShouldGet(String)"
});
formatter.result({
  "duration": 180856900,
  "status": "passed"
});
formatter.after({
  "duration": 846123900,
  "status": "passed"
});
formatter.before({
  "duration": 10030161200,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "user should not be able to login with invalid email-id and password",
  "description": "",
  "id": "login-function;user-should-not-be-able-to-login-with-invalid-email-id-and-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ll"
    },
    {
      "line": 5,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user type \"\"and \"test1235\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should not be able to login",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user should get \"Please enter your email\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDef.user_is_on_homepage()"
});
formatter.result({
  "duration": 15845211300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.userClicksOnLoginButton()"
});
formatter.result({
  "duration": 1546682600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 11
    },
    {
      "val": "test1235",
      "offset": 17
    }
  ],
  "location": "MyStepDef.userTypeAnd(String,String)"
});
formatter.result({
  "duration": 814243600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.userClicksOnLoginButton()"
});
formatter.result({
  "duration": 640506500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.userShouldNotBeAbleToLogin()"
});
formatter.result({
  "duration": 417097700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please enter your email",
      "offset": 17
    }
  ],
  "location": "MyStepDef.userShouldGet(String)"
});
formatter.result({
  "duration": 228571900,
  "status": "passed"
});
formatter.after({
  "duration": 741419400,
  "status": "passed"
});
formatter.before({
  "duration": 8318997600,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "user should not be able to login with invalid email-id and password",
  "description": "",
  "id": "login-function;user-should-not-be-able-to-login-with-invalid-email-id-and-password;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ll"
    },
    {
      "line": 5,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user type \"krup564@test.com\"and \"delta123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should not be able to login",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user should get \"Login was unsuccessful. Please correct the errors and try again. No customer account found\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDef.user_is_on_homepage()"
});
formatter.result({
  "duration": 15705942200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.userClicksOnLoginButton()"
});
formatter.result({
  "duration": 882601300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "krup564@test.com",
      "offset": 11
    },
    {
      "val": "delta123",
      "offset": 33
    }
  ],
  "location": "MyStepDef.userTypeAnd(String,String)"
});
formatter.result({
  "duration": 568351500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.userClicksOnLoginButton()"
});
formatter.result({
  "duration": 656405100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.userShouldNotBeAbleToLogin()"
});
formatter.result({
  "duration": 411080600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login was unsuccessful. Please correct the errors and try again. No customer account found",
      "offset": 17
    }
  ],
  "location": "MyStepDef.userShouldGet(String)"
});
formatter.result({
  "duration": 128335900,
  "status": "passed"
});
formatter.after({
  "duration": 930956600,
  "status": "passed"
});
formatter.before({
  "duration": 8955700600,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "user should not be able to login with invalid email-id and password",
  "description": "",
  "id": "login-function;user-should-not-be-able-to-login-with-invalid-email-id-and-password;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ll"
    },
    {
      "line": 5,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user type \"\"and \"\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should not be able to login",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user should get \"Please enter your email\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDef.user_is_on_homepage()"
});
formatter.result({
  "duration": 15785833200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.userClicksOnLoginButton()"
});
formatter.result({
  "duration": 1107952500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 11
    },
    {
      "val": "",
      "offset": 17
    }
  ],
  "location": "MyStepDef.userTypeAnd(String,String)"
});
formatter.result({
  "duration": 466969100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.userClicksOnLoginButton()"
});
formatter.result({
  "duration": 1992456800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.userShouldNotBeAbleToLogin()"
});
formatter.result({
  "duration": 353718700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please enter your email",
      "offset": 17
    }
  ],
  "location": "MyStepDef.userShouldGet(String)"
});
formatter.result({
  "duration": 118131200,
  "status": "passed"
});
formatter.after({
  "duration": 748968100,
  "status": "passed"
});
});