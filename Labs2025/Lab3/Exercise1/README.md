## Exercise 1 - Binary Search Using Divide and Conquer

We are given a sorted array of `N` numbers and a number `M` that we are searching for. Using the "divide and conquer" method, implement a binary search algorithm to find the given number in the array and print its position. If the number is not found in the array, print `"Ne postoi"`.

**Input:**

The first line contains the size of the array `N` and the number `M` we are searching for. The next line contains the elements of the array.

**Output:**

Print the position of the number we are searching for, or `"Ne postoi"` if the number does not exist in the array.


## Задача 1 - Бинарно пребарување со методата „Раздели па владеј“

Дадена е сортирана низа од `N` броеви и број `M` кој го бараме во таа низа. Со помош на методата „раздели па владеј“ да се имплементира бинарно пребарување, да се најде бараниот број во таа низа и да се испечати неговата позиција. Доколку бројот не е во низата, да се испечати `"Ne postoi"`.

**Влез:**

Првиот ред од влезот ги содржи големината на низата `N` и бараниот број `M`, а во следниот ред се дадени елементите на низата.

**Излез:**

Позицијата на која се наоѓа бараниот број или `"Ne postoi"` доколку бројот не се наоѓа во низата.








## Test Cases


### Test Case 1

**Input:**
```text
5 3
1 2 3 4 5
```
**Expected output:**

```text
2
```






### Test Case 2

**Input:**
```text
3 5
1 3 7
```
**Expected output:**

```text
Ne postoi
```






### Test Case 3

**Input:**
```text
7 7
1 2 3 4 5 6 7
```
**Expected output:**

```text
6
```






### Test Case 4

**Input:**
```text
7 7
10 20 30 40 50 60 70
```
**Expected output:**

```text
Ne postoi
```






### Test Case 5

**Input:**
```text
7 30
10 20 30 40 50 60 70
```
**Expected output:**

```text
2
```





### Test Case 6

**Input:**
```text
7 70
10 20 30 40 50 60 70
```
**Expected output:**

```text
6
```





### Test Case 7

**Input:**
```text
10 10
1 2 3 4 5 6 7 8 9 10
```
**Expected output:**

```text
9
```





### Test Case 8

**Input:**
```text
10 10
10 20 30 40 50 60 70 80 90 100
```
**Expected output:**

```text
0
```





### Test Case 9

**Input:**
```text
10 0
10 20 30 40 50 60 70 80 90 100
```
**Expected output:**

```text
Ne postoi
```





### Test Case 10

**Input:**
```text
10 1000
10 20 30 40 50 60 70 80 90 100
```
**Expected output:**

```text
Ne postoi
```
