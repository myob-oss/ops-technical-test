# Platform Enablement Technical Test


#### Write an application using your language of choice that does these three things :

- Make your application root endpoint as simple as possible i.e show a hello world message
- Create an `/health` endpoint which returns a valid response if your application is up and running
- Create an `/metadata` endpoint with basic information about your application , such metadata could return a json payload like this:

```
"Myapplication": [
  {
    "version": "1.0",
    "description" : "Pre-interview technical test",
    "lastcommitsha": "abc57858585"
  }
]
```

- Make sure you add unit and integration tests for your application

#### Once you are done the previous steps make sure you :

- Build a deployable artifact using your preferred isolation technique.
- Create a pipeline that builds your artifact on every commit, you can use a ci/cd tool like travis or alike
- Make sure  you write a clear readme file that explains how to run your application
