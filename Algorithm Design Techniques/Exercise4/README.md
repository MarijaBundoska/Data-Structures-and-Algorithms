## Exercise 4 - Minimum Number of Meeting Rooms

We are given **N scheduled meetings**, each with a start time and an end time.

Write an algorithm that finds the minimum number of meeting rooms needed to schedule all the meetings.

**Input:**

The first number in the input represents the number of meetings **N**. The following **N** lines contain two numbers for each meeting: its start time and end time (in minutes).

**Output:**

Print the minimum number of meeting rooms needed to schedule all the meetings.

---

## Задача 4 - Минимален број на сали за состаноци

Дадени се **N состаноци**, секој со време на почеток и време на завршување.

Да се напише алгоритам кој ќе го најде минималниот број на сали потребни за да можат да се одржат сите состаноци.

**Влез:**

Првиот број од влезот го претставува бројот на состаноци **N**, а потоа во следните **N** редови се внесуваат по два броја за секој состанок: минутата на започнување и минутата на завршување на состанокот.

**Излез:**

Да се испечати минималниот број на сали потребни за да можат да се одржат сите состаноци.




## Test Cases 


### Test Case 1

**Input:**
```text
5
1 2
1 2
5 10
11 14
15 20
```
**Expected output:**

```text
2
```


### Test Case 2

**Input:**
```text
5
1 2
1 2
1 2
1 2
1 2
```
**Expected output:**

```text
5
```




### Test Case 3

**Input:**
```text
5
1 2
2 3
3 4
4 5
5 6
```
**Expected output:**

```text
2
```



### Test Case 4

**Input:**
```text
5
1 2
3 4
5 6
7 8
9 10

```
**Expected output:**

```text
1
```



### Test Case 5

**Input:**
```text
5
10 20
30 40
50 60
70 80
90 100
```
**Expected output:**

```text
1
```



### Test Case 6

**Input:**
```text
1
1 2
```
**Expected output:**

```text
1
```



### Test Case 7

**Input:**
```text
7
1 2
1 2
5 10
11 14
15 20
12 17
4 9
```
**Expected output:**

```text
2
```



### Test Case 8

**Input:**
```text
8
1 2
1 2
5 10
11 14
15 20
12 17
4 9
3 12
```
**Expected output:**

```text
3
```


### Test Case 9

**Input:**
```text
3
10 20
1 2
5 9
```
**Expected output:**

```text
1
```



### Test Case 10

**Input:**
```text
3
10 20
3 7
5 11
```
**Expected output:**

```text
2
```
