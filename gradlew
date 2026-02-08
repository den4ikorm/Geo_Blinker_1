#!/bin/sh
# Gradle startup script for POSIX
exec sh -c 'java -jar gradle/wrapper/gradle-wrapper.jar "$@"'
