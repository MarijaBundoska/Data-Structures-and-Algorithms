
## Exercise 1 - Removing Elements Below the Average

Given an array of **N integers**, remove all elements whose values are less than the average of all elements in the array.

For example, for the array `1, 2, 3, 4, 5`, the average is:

\[
\frac{1+2+3+4+5}{5}=\frac{15}{5}=3
\]

Therefore, the elements `1` and `2` should be removed, and the resulting array will be `3, 4, 5`.

**Input:** The first number in the input is the number of elements in the array **N**. The elements of the array are given in the next line, separated by spaces.

**Output:** Print the array before and after the transformation.


## Задача 1 - Бришење на елементите помали од просекот

За дадена низа од **N цели броеви**, да се избришат елементите со вредност помала од просекот на сите елементи во низата.

На пример, за низата `1, 2, 3, 4, 5`, просекот е:

\[
\frac{1+2+3+4+5}{5}=\frac{15}{5}=3
\]

Што значи дека треба да се избришат елементите `1` и `2`, па низата по оваа трансформација ќе биде `3, 4, 5`.

**Влез:** Првиот број од влезот е бројот на елементи во низата **N**, а во следниот ред се дадени самите елементи, одделени со празно место.

**Излез:** Да се испечати низата пред и по направената трансформација.








## Test Cases


### Test Case 1

**Input:**
```text
5
1 2 3 4 5
```
**Expected output:**

```text
{1,2,3,4,5}
{3,4,5}
```





### Test Case 2

**Input:**
```text
2
3 1
```
**Expected output:**

```text
{3,1}
{3}
```




### Test Case 3

**Input:**
```text
1
1
```
**Expected output:**

```text
{1}
{1}
```




### Test Case 4

**Input:**
```text
14
99 60 11 99 88 3 47 24 97 54 56 89 82 31
```
**Expected output:**

```text
{99,60,11,99,88,3,47,24,97,54,56,89,82,31}
{99,60,99,88,97,89,82}
```





### Test Case 5

**Input:**
```text
15
79 87 78 37 65 59 48 99 49 19 47 37 25 21 8
```
**Expected output:**

```text
{79,87,78,37,65,59,48,99,49,19,47,37,25,21,8}
{79,87,78,65,59,99}
```




### Test Case 6

**Input:**
```text
14
74 93 98 6 11 46 16 93 49 54 57 32 72 91
```
**Expected output:**

```text
{74,93,98,6,11,46,16,93,49,54,57,32,72,91}
{74,93,98,93,57,72,91}
```








### Test Case 7

**Input:**
```text
16
27 93 86 76 14 10 57 72 82 88 49 61 83 12 75 94
```
**Expected output:**

```text
{27,93,86,76,14,10,57,72,82,88,49,61,83,12,75,94}
{93,86,76,72,82,88,83,75,94}
```





### Test Case 8

**Input:**
```text
19
38 61 97 78 94 58 100 82 68 78 2 87 87 27 18 31 95 36 85
```
**Expected output:**

```text
{38,61,97,78,94,58,100,82,68,78,2,87,87,27,18,31,95,36,85}
{97,78,94,100,82,68,78,87,87,95,85}
```




### Test Case 9

**Input:**
```text
19
9 72 18 97 43 68 63 82 89 7 18 2 66 31 46 56 57 96 88
```
**Expected output:**

```text
{9,72,18,97,43,68,63,82,89,7,18,2,66,31,46,56,57,96,88}
{72,97,68,63,82,89,66,56,57,96,88}
```






### Test Case 10

**Input:**
```text
4
2 3 7 8
```
**Expected output:**

```text
{2,3,7,8}
{7,8}
```
