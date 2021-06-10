# Platform Enablement Technical Test

We would like you to write an application in a language of your choice
which covers a few points of interest. It will be evaluated holistically,
so take this as an opportunity to demonstrate your skills.

## Application Details

Your application should be a simple, small, operable web-style API or service
provider. It should implement the following:

- a simple root endpoint which responds in a simple manner; "hello world".
- a health endpoint which returns an appropriate response code
- a metadata endpoint which returns basic information about your application, including version and associated git hash:
e.g.
```json
"myapplication": [
  {
    "version": "1.0",
    "description" : "pre-interview technical test",
    "lastcommitsha": "abc57858585"
  }
]
```

- tests or a test suite

## Fit and Finish

Once the application has been written, continue with the following additions:

- provide a means of packaging your application as a single deployable artifact which encapsulates its dependencies
- create a pipeline that builds your application on each commit; Travis, Github Actions, or similar
- describe or demonstrate any risks associated with your application/deployment
- write a clear and understandable `README` which explains your application, its packaging steps, how to run it, and how it aligns with the listed requirements
