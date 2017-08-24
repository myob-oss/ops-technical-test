# Platform Enablement Technical Test

We would like you to write an application in a language of your choice
which covers a few points of interest. It will be evaluated holistically,
so take this as an opportunity to show the breadth of your skills or knowledge.

## Application Details

Your application should be a simple, small, operable web-style API or service
provider. It should implement the following:

- a simple root endpoint which responds in a simple manner; "hello world" or some such
- a health endpoint which returns an appropriate response code
- a metadata endpoint which returns basic information about your application; example:

```json
"myapplication": [
  {
    "version": "1.0",
    "description" : "pre-interview technical test",
    "lastcommitsha": "abc57858585"
  }
]
```

- tests or a test suite; the type of testing is up to you

## Fit and Finish

Once the application has been written, follow up with the following additions:

- provide a means of packaging your application as a single deployable artifact which encapsulates its dependencies
- create a pipeline that builds your application on each commit; Travis or similar, for example
- write a clear and understandable `README` which explains your application and its deployment steps
