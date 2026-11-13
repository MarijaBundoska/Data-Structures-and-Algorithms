## Exercise 2 - Minimum Number of Railway Platforms

We are given **N trains**, each with an arrival and departure time. Write an algorithm that finds the minimum number of platforms needed to accommodate all trains.

**Input:** The first number in the input is the number of trains N, followed by N lines containing the arrival and departure times of each train.

**Output:** Print the minimum number of platforms needed to accommodate all trains.

---

## Задача 2 - Минимален број на железнички платформи

Дадени се **N возови** со време на пристигнување и поаѓање. Да се најде минималниот број на платформи потребен за да се сместат тие возови.

**Влез:** Првиот број од влезот е бројот на возови N, а потоа во следните N линии се внесуваат минутата на пристигнување и минутата на поаѓање на секој воз.

**Излез:** Да се испечати најмалиот потребен број на платформи за да се сместат сите возови.



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
