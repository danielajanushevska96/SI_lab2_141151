# Втора лабораториска вежба по Софтверско инженерство

## Даниела Јанушевска, број на индекс: 141151

### Група на код: 

Група 2.

###  Control Flow Graph

Фотографија од control flow graph-ot 

### Цикломатска комплексност

Цикломатската комплексност на овој код е 2, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=1, па цикломатската комплексност изнесува 2.

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
