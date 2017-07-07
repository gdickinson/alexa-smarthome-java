#!/usr/bin/env bash

if [ "$TRAVIS_BRANCH" = 'master' ] && [ "$TRAVIS_PULL_REQUEST" == 'false' ]; then
    gpg --fast-import deployscripts/codesigning.asc
    mvn deploy -P sign,build-extras --settings deployscripts/mvnsettings.xml
fi