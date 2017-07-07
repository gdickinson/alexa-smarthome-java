# alexa-smarthome-java

_A framework for creating Alexa Smart Home Skills in Java_

[![Build Status](https://travis-ci.org/travis-ci/travis-web.svg?branch=master)](https://travis-ci.org/travis-ci/travis-web)

## About
The Amazon Echo products, and the Alexa SmartHome interface opens up all sorts of possibilities for controlling devices
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

## Project State
I have used this myself in a personal project and it "works for me", as they say. I'm still working on adding more tests,
and implementing object types that I didn't happen to need.

## Contact
You can find me on Twitter at [@gdickinson](http://twitter.com/gdickinson).
