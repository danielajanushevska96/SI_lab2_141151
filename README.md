# Втора лабораториска вежба по Софтверско инженерство

## Даниела Јанушевска, број на индекс: 141151

### Група на код: 

Група 2.

###  Control Flow Graph

![cfg](https://karafil.com/wp-content/uploads/2020/06/CFG.jpg)

### Цикломатска комплексност

Nodes = 18
Edges = 22

Cyclomatic complexity  = E-N+2 = 22-18+2 = 

### Тест случаи според критериумот Every branch

* itShouldPassWithValidUserObject
* itShouldReturnFalseForBadEmail
* itShouldThrowExceptionIfUserIsNull
* itShouldThrowExceptionIfUsernameIsNull
* itShouldReturnFalseIfEmailIsNull
* itShouldReturnFalseIfEmailIsVeryShort

### Тест случаи според критериумот Every path

* itShouldPassWithValidUserObject
* itShouldReturnFalseForBadEmail
* itShouldThrowExceptionIfUserIsNull
* itShouldThrowExceptionIfUsernameIsNull
* itShouldReturnFalseIfEmailIsNull
* itShouldReturnFalseIfUsernameAlreadyExists
* itShouldReturnFalseIfEmailIsVeryShort

### Објаснување на напишаните unit tests

За unit tests се користи JUnit od Java Gradle Repository.

На почеток на поставувањето на тестовите за лабораториската со помош на Before анотација од JUnit се инстанцира класата, потребните Mock корисници и кориснички имиња.

За да се покриваат сите можни патеки и branch-ови се користат искреираните Mock податоци.
