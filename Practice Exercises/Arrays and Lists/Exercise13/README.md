## Exercise 13 - Counting Elements with a Greater Average on the Left

Given a **doubly linked list** of **N integers**, find the number of elements for which the average of all elements before them in the list is greater than the average of all elements after them.

**Input:**

The first number in the input represents the number of elements in the list, **N**. The elements themselves are given in the next line, separated by spaces.

**Output:**

Print the number of elements that satisfy the given condition.

---

## Задача 13 - Броење елементи со поголем просек од левата страна

За дадена **двострано поврзана листа** од **N цели броеви**, треба да се најде бројот на елементи такви што просекот на елементите пред нив во листата е поголем од просекот на елементите после нив.

**Влез:**

Првиот број од влезот е бројот на елементи во листата **N**, а потоа во следниот ред се дадени самите елементи одделени со празно место.

**Излез:**

Да се испечати бројот на елементи што го задоволуваат условот.


## Test Cases


### Test Case 1

**Input:**
```text
5
1 2 3 4 5
```
**Expected output:**

```text
0
```




### Test Case 2

**Input:**
```text
6
10 20 30 40 50 60
```
**Expected output:**

```text
0
```



### Test Case 3

**Input:**
```text
4
5 4 3 2
```
**Expected output:**

```text
2
```





### Test Case 4

**Input:**
```text
7
7 1 3 9 4 5 2
```
**Expected output:**

```text
3
```



### Test Case 5

**Input:**
```text
8
100 200 150 300 250 400 350 500
```
**Expected output:**

```text
0
```



### Test Case 6

**Input:**
```text
3
10 20 15
```
**Expected output:**

```text
0
```



### Test Case 7

**Input:**
```text
10
5 9 3 7 1 6 4 8 2 10
```
**Expected output:**

```text
2
```


### Test Case 8

**Input:**
```text
5
-5 0 5 10 15
```
**Expected output:**

```text
0
```



### Test Case 9

**Input:**
```text
6
1000 2000 3000 4000 5000 6000
```
**Expected output:**

```text
0
```



### Test Case 10

**Input:**
```text
4
5 5 5 5
```
**Expected output:**

```text
0
```

