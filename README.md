

```sh
## creer un projet maven (qui sera utilisé comme repertoire partagé)
mvn archetype:generate -DgroupId=com.simdev.sharedlib -DartifactId=shared-dto -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

## deployer
mvn clean deploy

## recharger les dependance
./mvnw dependency:resolve

## run 
 ./mvnw spring-boot:run

```