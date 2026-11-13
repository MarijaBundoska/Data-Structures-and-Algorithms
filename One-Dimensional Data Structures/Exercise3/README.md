## Exercise 3 - Library Queues with Different Service Speeds

A library is visited by students in order to borrow one or more types of books. A given book can belong to one of three categories: **Science, Science Fiction, or History**.

When the library opens, students of all three types are served **in parallel**. However, all three counters operate at different speeds, so the serving of students follows this algorithm: **two students** who want to borrow a Science book are served, **then sequentially one student** who wants to borrow a Science Fiction book, **then sequentially two students** who want to borrow a History book.

If a student is waiting in line for books of different types, he waits in line first for a Science book, then for a Science Fiction book, and finally for a History book (depending on whether he is requesting these books for borrowing).

**Input:** The first line contains the number of students who have come to the library to borrow books. Then, 4 lines are entered for each student, where the first line is the student's name, and the remaining 3 lines indicate whether the student will borrow a book of a given type (Science, Science Fiction, and History, respectively), where 1 means that he intends to borrow a book of that type, and 0 means that he will not borrow a book of that type.

**Example:**

```text
Ivan Ivanovski
1
1
0
```

This means that the student Ivan Ivanovski intends to borrow books of type Science and Science Fiction, but does not intend to borrow a book of type History.

**Output:** Print the students in the order in which they finish borrowing all the books.


## Задача 3 - Редици во библиотека со различна брзина на услужување

Библиотека е посетена од студентите со цел да изнајмат еден или повеќе типови на книги. Дадена книга може да припаѓа на една од трите категории: **Наука, Научна фантастика или Историја**.

Кога библиотеката ќе започне со работа, се услужуваат студенти од сите три типа **паралелно**, но сите три шалтера не работат со иста брзина, па услужувањето се одвива според следниот алгоритам: **двајца студенти** кои бараат книга од тип Наука, **потоа последователно еден студент** кој бара книга од тип Научна фантастика, **па последователно двајца студенти** кои бараат книга од тип Историја.

Доколку студент чека ред за книги од различен тип, тој чека ред првин во редицата за книга од тип Наука, потоа во редицата за книга од тип Научна фантастика и на крај во редицата за книга од тип Историја (во зависност од тоа дали ги бара овие книги за позајмување).

**Влез:** Во првата линија е даден број на студенти кои дошле во библиотеката да позајмат книга. Потоа се внесуваат 4 линии за секој студент, каде првата линија е името на студентот, а во останатите 3 линии се внесува дали студентот ќе позајми книга од даден тип (Наука, Научна фантастика и Историја соодветно), каде 1 значи дека има за цел да позајми книга од тој тип, а 0 значи дека нема за цел да позајми книга од тој тип.

**Пример:**

```text
Иван Ивановски
1
1
0
```

Ова значи дека студентот Иван Ивановски има за цел да позајми книги од тип Наука и тип Научна фантастика, но нема за цел да позајми книга од тип Историја.

**Излез:** Да се испечати редоследот на студентите според редоследот по кој завршуваат со позајмување на сите книги.




## Test Cases 


### Test Case 1

**Input:**
```text
2
Иван Ивановски
1
1
0
Марија Маркова
1
0
1
```
**Expected output:**

```text
Иван Ивановски
Марија Маркова
```



### Test Case 2

**Input:**
```text
3
Иван Ивановски
1
0
1
Марија Маркова
0
1
1
Петар Петров
1
1
0
```
**Expected output:**

```text
Иван Ивановски
Марија Маркова
Петар Петров
```



### Test Case 3

**Input:**
```text
3
Ана Анастасова
1
1
1
Борис Борисов
1
0
0
Владимир Владимиров
1
1
0
```
**Expected output:**

```text
Борис Борисов
Ана Анастасова
Владимир Владимиров
```



### Test Case 4

**Input:**
```text
4
Ана Анастасова
1
0
1
Борис Борисов
1
1
0
Владимир Владимиров
0
0
1
Јана Јаневска
1
1
1
```
**Expected output:**

```text
Борис Борисов
Владимир Владимиров
Ана Анастасова
Јана Јаневска
```

### Test Case 5

**Input:**
```text
2
Петар Петров
1
1
1
Симона Симоновска
0
0
1
```
**Expected output:**

```text
Симона Симоновска
Петар Петров
```



### Test Case 6

**Input:**
```text
3
Илија Илиев
1
1
0
Мила Миленковска
0
1
1
Петар Петров
1
0
1
```
**Expected output:**

```text
Петар Петров
Мила Миленковска
Илија Илиев
```



### Test Case 7

**Input:**
```text
3
Томислав Томовски
0
1
1
Кристина Крстевска
1
0
1
Мартин Марков
1
1
1
```
**Expected output:**

```text
Кристина Крстевска
Томислав Томовски
Мартин Марков
```



### Test Case 8

**Input:**
```text
3
Томислав Томовски
1
0
1
Кристина Крстевска
1
0
1
Мартин Марков
1
1
1
```
**Expected output:**

```text
Томислав Томовски
Кристина Крстевска
Мартин Марков
```



 ### Test Case 9

**Input:**
```text
4
Александар Александров
1
1
1
Елена Еленова
0
1
0
Бојан Бојановски
1
1
0
Тамара Тамарова
0
0
1
```
**Expected output:**

```text
Елена Еленова
Тамара Тамарова
Александар Александров
Бојан Бојановски
```


### Test Case 10

**Input:**
```text
4
Александар Александров
1
1
1
Елена Еленова
0
1
1
Бојан Бојановски
1
0
1
Тамара Тамарова
0
1
1
```
**Expected output:**

```text
Бојан Бојановски
Елена Еленова
Тамара Тамарова
Александар Александров
```
