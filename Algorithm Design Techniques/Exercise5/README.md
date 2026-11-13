

## Exercise 5 - Minimum Number of Street Lights

We are given a street of length **M** and **N** possible positions where street lights can be installed. The possible positions are given in an array.

Each street light illuminates its own position, as well as two positions to the left and two positions to the right.

Write an algorithm that finds the minimum number of street lights needed to illuminate the entire street. It is not necessary to install a light at every possible position.

**Input:**

The first line contains two integers: **N**, the number of possible positions for street lights, and **M**, the length of the street. The next line contains the possible positions where street lights can be installed.

**Output:**

Print the minimum number of street lights needed to illuminate the entire street.

---

## Задача 5 - Минимален број на улични светилки

Дадена е улица со должина **M** и **N** можни позиции на кои можат да се постават улични светилки. Можните позиции се дадени во една низа.

Секоја светилка ја осветлува својата позиција, како и уште две позиции лево и две позиции десно од неа.

Да се напише алгоритам кој ќе го најде минималниот број на светилки потребни за да се осветли целата улица. Не е потребно да се постави светилка на секоја можна позиција.

**Влез:**

Во првиот ред се дадени два цели броја: **N**, бројот на можни позиции за поставување светилки, и **M**, должината на улицата. Во следниот ред се дадени можните позиции на кои може да се постават светилки.

**Излез:**

Да се испечати минималниот број на светилки потребни за да се осветли целата улица.







## Test Cases 


### Test Case 1

**Input:**
```text
5 5
1 2 3 4 5
```
**Expected output:**

```text
1
```



### Test Case 2

**Input:**
```text
3 5
1 3 5
```
**Expected output:**

```text
1
```




### Test Case 3

**Input:**
```text
3 10
3 8 9
```
**Expected output:**

```text
2
```



### Test Case 4

**Input:**
```text
3 15
3 8 13
```
**Expected output:**

```text
3
```



### Test Case 5

**Input:**
```text
8 15
3 8 13 10 1 3 5 9
```
**Expected output:**

```text
3
```



### Test Case 6

**Input:**
```text
10 15
3 8 13 10 1 7 5 9 12 11
```
**Expected output:**

```text
3
```



### Test Case 7

**Input:**
```text
1 5
3
```
**Expected output:**

```text
1
```



### Test Case 8

**Input:**
```text
3 7
3 5 7
```
**Expected output:**

```text
2
```


### Test Case 9

**Input:**
```text
5 7
1 2 3 5 7
```
**Expected output:**

```text
2
```


### Test Case 10

**Input:**
```text
4 9
1 2 5 8
```
**Expected output:**

```text
3
```
