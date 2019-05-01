# Project Title: Number Translator 

Java/Spring app, that read a string input and translate (if its possible) the integer numbers as words in english.

If one input is invalid the application will show the message  'Cant evaluate %s as integer, sorry'

## Getting Started

The application uses gradle, and java 1.8.  Also it is a java console application, feel free if you wanna comment or discuss 
any item here included.

The main functionality uses ICU4J library in order to analize and translate the numbers in words.

### Prerequisites

You need have properly configurated

```
java runtime 1.8
Gradle library
Internet connection (in order to download libraries)
```

### Installing

In order to execute the application you should
* Clone the project as you prefer (console or IDE)
* Open a terminal in the root folder of the project
* run the command ```./gradle build run```
* The program will request to you insert a string stream to be evaluated, e.g 105 and hit enter
* You can evaluate several strings as you want
* if you wanna to close the application you can type quit or Ctrl+C   
* Enjoy


## Running the tests

If you wanna run the test cases you can use a gradle task as follows
* Open a terminal in the root folder of the project
* run the command ```./gradle test```


There are several test asociated with the project, e.g we are evaluating negative numbers, zero, simple numbers and Integer-Max and Integer Min numbers
You can check and modify if you wanna in the TranslatorTest.java file 


## Built With

* [ICU4J](http://site.icu-project.org/home/why-use-icu4j) - The library used
* [Grade](https://gradle.org/) - Builds/Task/Dependency Management
* [Junit](https://junit.org) - Libraries related with testing
* [String](https://spring.io/) - Dependency injection and basis configuration


## Versioning

For the versions available, see the repo in GIT [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Jorge Vargas** - *Java Dev/Cyclist/Dreamer* 

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
