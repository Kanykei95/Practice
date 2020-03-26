$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/api/studentsListByAPI.feature");
formatter.feature({
  "name": "Student List API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Student creation with API E2E scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@createStudent"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user creates student with following data \"/student/create\"",
  "rows": [
    {
      "cells": [
        "firstName",
        "Lionelio"
      ]
    },
    {
      "cells": [
        "lastName",
        "Messi"
      ]
    },
    {
      "cells": [
        "emailAddress",
        "messi@gmail.com"
      ]
    },
    {
      "cells": [
        "joinDate",
        "01/01/2010"
      ]
    },
    {
      "cells": [
        "password",
        "123jbr"
      ]
    },
    {
      "cells": [
        "subject",
        "Math"
      ]
    },
    {
      "cells": [
        "phone",
        "3124756521"
      ]
    },
    {
      "cells": [
        "gender",
        "Male"
      ]
    },
    {
      "cells": [
        "admissionNo",
        "10"
      ]
    },
    {
      "cells": [
        "birthDate",
        "01/01/1990"
      ]
    },
    {
      "cells": [
        "major",
        "Football"
      ]
    },
    {
      "cells": [
        "batch",
        "10"
      ]
    },
    {
      "cells": [
        "section",
        "LaLigA"
      ]
    },
    {
      "cells": [
        "premanentAddress",
        "921 W Huron St."
      ]
    },
    {
      "cells": [
        "companyName",
        "Barcelona"
      ]
    },
    {
      "cells": [
        "title",
        "Goatie"
      ]
    },
    {
      "cells": [
        "startDate",
        "01/02/2010"
      ]
    },
    {
      "cells": [
        "city",
        "Barcelona"
      ]
    },
    {
      "cells": [
        "street",
        "13 Hurnon"
      ]
    },
    {
      "cells": [
        "zipCode",
        "60742"
      ]
    },
    {
      "cells": [
        "state",
        "IL"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "StudentsListAPI_step_defs.user_creates_student_with_following_data(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});