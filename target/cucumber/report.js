$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AddNewAccount.feature");
formatter.feature({
  "line": 2,
  "name": "Add new account on bank and cash page",
  "description": "",
  "id": "add-new-account-on-bank-and-cash-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AddNewAccount"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "User should able to login with valid credentials",
  "description": "",
  "id": "add-new-account-on-bank-and-cash-page;user-should-able-to-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "User enters \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should able to land on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks on bank and cash",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks on new account",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User fill up the form entering \"\u003caccountTitle\u003e\" and \"\u003cdescription\u003e\" and \"\u003cinitialBalance\u003e\" and \"\u003caccountNumber\u003e\" and \"\u003ccontactPerson\u003e\" and \"\u003cphone\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User clicks on submit button",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "add-new-account-on-bank-and-cash-page;user-should-able-to-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone"
      ],
      "line": 17,
      "id": "add-new-account-on-bank-and-cash-page;user-should-able-to-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "NewMoney",
        "My personal Account",
        "$500",
        "450631",
        "Md Ripon",
        "646500"
      ],
      "line": 18,
      "id": "add-new-account-on-bank-and-cash-page;user-should-able-to-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5468041200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is  on the Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsDefinition.user_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 1620811300,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User should able to login with valid credentials",
  "description": "",
  "id": "add-new-account-on-bank-and-cash-page;user-should-able-to-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@AddNewAccount"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User enters \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should able to land on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks on bank and cash",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks on new account",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User fill up the form entering \"NewMoney\" and \"My personal Account\" and \"$500\" and \"450631\" and \"Md Ripon\" and \"646500\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User clicks on submit button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 13
    },
    {
      "val": "abc123",
      "offset": 37
    }
  ],
  "location": "StepsDefinition.user_enters_and(String,String)"
});
formatter.result({
  "duration": 228954900,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 4933573700,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.user_should_able_to_land_on_dashboard_page()"
});
formatter.result({
  "duration": 8491800,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.user_clicks_on_bank_and_cash()"
});
formatter.result({
  "duration": 446308400,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.user_clicks_on_new_account()"
});
formatter.result({
  "duration": 854520200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NewMoney",
      "offset": 32
    },
    {
      "val": "My personal Account",
      "offset": 47
    },
    {
      "val": "$500",
      "offset": 73
    },
    {
      "val": "450631",
      "offset": 84
    },
    {
      "val": "Md Ripon",
      "offset": 97
    },
    {
      "val": "646500",
      "offset": 112
    }
  ],
  "location": "StepsDefinition.user_fill_up_the_form_entering_and_and_and_and_and(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 632234200,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.user_clicks_on_submit_button()"
});
formatter.result({
  "duration": 1452022000,
  "status": "passed"
});
formatter.after({
  "duration": 961645800,
  "status": "passed"
});
});