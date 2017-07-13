# alexa-smarthome-java

_A framework for creating Alexa Smart Home Skills in Java_

[![Build Status](https://travis-ci.org/gdickinson/alexa-smarthome-java.svg?branch=master)](https://travis-ci.org/gdickinson/alexa-smarthome-java)

## About
The Amazon Echo products, and the Alexa Smart Home interface opens up all sorts of possibilities for controlling devices
around the home. Writing an Alexa skill, however, requires writing code for Amazon Lambda. Lambda provides support for
a strong array popular languages including Node.js, Python, and Java, but very few examples are given to 
Java in terms of Smart Home Skills, and there are no canonical Java object bindings for the request/response objects
that SmartHome passes to Lambda.

To complicate matters, Lambda's built-in serialization/deserialization for POJOs is of little help for the
request/response objects that SmartHome makes use of, because of the dynamically-typed payload field which require
special handling.

This software attempts to bridge that gap by providing a small framework to cut down on boilerplate and
scaffolding for authors of Amazon Lambda functions for Alexa Smart Home Skills. It has minimal dependencies, and all
business logic is left up to the user to implement, using whatever additional libraries they wish.

In short, it's tedious to write all this object serialization - I wrote all the boilerplate so you don't have to.

## Usage
Lambda's execution model of completely stateless application code means that you can't assume very much about where and
how things will run, how many times your code gets executed, and so on. From a scaling perspective that's appealing, but
as Java service developers, that's a bit of a pain because we're so used to writing applications which can take a
while to start up as long as they're quick for the rest of the time they're serving requests.

Since this is Lambda, we're constrained to either a zero-arg or default constructor for the class which implements the
method that Lambda will be calling:
     
     public final void handleRequest(InputStream inputStream, OutputStream outputStream, Context context)

This framework implements this for you in `SmartHomeDirectiveHandler`. Because this is the main entry point to the
code, this class is also required to have a zero-argument constructor.

Users of this framework configure their application by configuring and registering `RequestHandler`s for each `Request`
type that you expect to process. Be sure to always register a handler for the Device Discovery process. Each `Handler`
should provide the appropriate response; the `Request` objects carry the appropriate type parameters to ensure that
handlers obey this constraint. 

Your implementation should extend `SmartHomeDirectiveHandler` and initialize and register handlers by overriding the `init()` method.

Compiled code is available on [Maven Central](https://search.maven.org/#artifactdetails%7Cuk.co.gdickinson%7Calexa-smarthome-java%7C0.1%7Cjar). 

## Project State
I have used this myself in a personal project and it "works for me", as they say. I'm still working on adding more tests,
and implementing object types that I didn't happen to need.

This code is in pre-1.0 state and it probably shows. I anticipate making changes, especially optimizations in the
initialization phase which will probably be API-breaking.

## Contact
You can find me on Twitter at [@gdickinson](http://twitter.com/gdickinson).
