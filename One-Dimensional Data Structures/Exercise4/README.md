## Exercise 4 - Student Administration Queues with Different Service Speeds

Student Administration is visited by students in order to submit/receive documents. A student can submit documents, request to receive their index card, or request to receive their high school documents.

When the Student Administration starts working, students of all three types are served **in parallel**. However, all three counters operate at different speeds, so the serving of students follows this algorithm: **one student** submitting documents, **then sequentially one student** who wants to receive their index card, **then sequentially one student** who wants to receive their high school documents.

If a student is waiting in line for more than one service at the Student Administration, they wait in line first for submitting documents, then in line for receiving their index card, and finally in line for receiving their high school documents.

**Input:** The first line contains the number of students who have come to be served by the Student Administration. Then, 4 lines are entered for each student, where the first line is the student's name, and the remaining 3 lines indicate whether there is a need for a given service (submitting documents, receiving an index card, and receiving high school documents, respectively), where 1 means that there is a need for a service of that type, and 0 means that there is no need for a service of that type.

**Example:**

```text
Ivan Ivanovski
1
1
0
```

This means that the student Ivan Ivanovski intends to submit documents and receive their index card.

**Output:** Print the students in the order in which they complete all services at the Student Administration.

---

## Задача 4 - Редици во студентска служба со различна брзина на услужување

Студентска служба е посетена од студентите со цел да приложат/земат документи. Студентот може да приложи документи, да побара да си го земе индексот или пак да побара да си ги земе документите од средно.

Кога студентската служба ќе започне со работа, се услужуваат студенти од сите три типа **паралелно**, но сите три шалтера не работат со иста брзина, па услужувањето се одвива според следниот алгоритам: **еден студент** што приложува документи, **потоа последователно еден студент** што сака да си го земе индексот, **па последователно еден студент** што сака да си ги земе документите од средно.

Доколку студент чека ред за повеќе услуги кај студентската служба, тој чека ред првин во редицата за приложување документи, потоа во редицата за земање на индекс и на крај во редицата за земање на документи од средно.

**Влез:** Во првата линија е даден број на студенти кои дошле за да бидат услужени од студентската служба. Потоа се внесуваат 4 линии за секој студент, каде првата линија е името на студентот, а во останатите 3 линии се внесува дали има потреба од дадена услуга (приложување документи, земање на индекс, земање на документи од средно соодветно), каде 1 значи дека има потреба од услуга од тој тип, а 0 значи дека нема потреба од услуга од тој тип.

**Пример:**

```text
Иван Ивановски
1
1
0
```

Ова значи дека студентот Иван Ивановски има за цел да приложи документи и да си го земе индексот.

**Излез:** Да се испечати редоследот на студентите според редоследот по кој ги завршуваат сите услуги во студентската служба.




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
Петар Петров
Марија Маркова
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
Ана Анастасова
Борис Борисов
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
Владимир Владимиров
Борис Борисов
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
Мила Миленковска
Илија Илиев
Петар Петров
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
0
1
```
**Expected output:**

```text
Тамара Тамарова
Елена Еленова
Бојан Бојановски
Александар Александров
```



