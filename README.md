# Surefire reuseForks bug demo
## Build
`mvn clean verify`

## Works
`<reuseForks>true</reuseForks>`

## Doesn't work
`<reuseForks>false</reuseForks>`

## Solution
The solution is to use `MAVEN_OPTS="--add-modules .. mvn clean verify"` because with reuseForks set to false, the tests will be run inside the same JVM as mvn. Since this JVM is already running, argLine won't have any effect.
