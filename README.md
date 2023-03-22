# calculator-cucumber

Foi utilizado um simples método de soma para exemplificar os testes utilizando o cucumber 

Requirements:
- Maven
- JDK 

Build application:
```
mvn clean install
```

Test
Build application:
```
mvn test
```


Create an empty Cucumber project:
```
mvn archetype:generate                      \
   "-DarchetypeGroupId=io.cucumber"           \
   "-DarchetypeArtifactId=cucumber-archetype" \
   "-DarchetypeVersion=7.11.1"               \
   "-DgroupId=hellocucumber"                  \
   "-DartifactId=hellocucumber"               \
   "-Dpackage=hellocucumber"                  \
   "-Dversion=1.0.0-SNAPSHOT"                 \
   "-DinteractiveMode=false"
```