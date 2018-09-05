### Curl Commands
`curl -iX POST http://[Cluster IP]:[Node Port]/hello -d "Wes"`

`curl -iX GET http://[Cluster IP]:[Node Port]/hello/{nameId}`

### Build Application
`./gradlew clean assemble`

### Build application Docker image
`docker build -t hello-app:1.0 .`

### Database Migration (Update connection information in flyway section of `build.gradle`)
`./gradlew flywayMigrate`
