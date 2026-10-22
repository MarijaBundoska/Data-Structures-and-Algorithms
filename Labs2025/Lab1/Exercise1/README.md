## Exercise 1 - Moving the Last K Elements to the Beginning of a Doubly-Linked List

Given a doubly-linked list of integers. Additionally, an integer `k` is given. The last `k` elements of the list should be moved to the beginning of the list, in the same order.

**Input:**

The first line contains the number of elements in the list — `N`. The elements of the list are given in the next line, separated by spaces. The last line contains the natural number `k`, where `k <= N`.

**Output:**

Print the list before and after the transformation.


## Задача 1- Преместување на последните K елементи на почетокот на двострано поврзана листа

Дадена е двострано поврзана листа од цели броеви. Дополнително, даден е и уште еден природен број `k`. Последните `k` елементи од листата треба да се поместат на почетокот на листата, во истиот редослед.

**Влез:**

Во првиот ред од влезот е даден бројот на елементи во листата — `N`, а во следниот ред се дадени самите елементи, одделени со празно место. На крај, во последниот ред е даден природниот број `k`, каде што `k <= N`.

**Излез:**

На излез треба да се испечати листата пред и по промената.







## Test Cases


### Test Case 1

**Input:**
```text
5
1 2 3 4 5
2
```
**Expected output:**

```text
1<->2<->3<->4<->5
4<->5<->1<->2<->3
```




### Test Case 2

**Input:**
```text
3
0 1 2
1
```
**Expected output:**

```text
0<->1<->2
2<->0<->1
```




### Test Case 3

**Input:**
```text
4
1 3 5 7
4
```
**Expected output:**

```text
1<->3<->5<->7
1<->3<->5<->7
```




### Test Case 4

**Input:**
```text
6
10 20 30 40 50 60
3
```
**Expected output:**

```text
10<->20<->30<->40<->50<->60
40<->50<->60<->10<->20<->30
```



### Test Case 5

**Input:**
```text
5
0 2 4 6 8
0
```
**Expected output:**

```text
0<->2<->4<->6<->8
0<->2<->4<->6<->8
```



### Test Case 6

**Input:**
```text
10
10 20 30 40 50 60 70 80 90 100
9
```
**Expected output:**

```text
10<->20<->30<->40<->50<->60<->70<->80<->90<->100
20<->30<->40<->50<->60<->70<->80<->90<->100<->10
```




### Test Case 7

**Input:**
```text
2
3 7
1
```
**Expected output:**

```text
3<->7
7<->3
```



### Test Case 8

**Input:**
```text
6
1 2 3 1 2 3
3
```
**Expected output:**

```text
1<->2<->3<->1<->2<->3
1<->2<->3<->1<->2<->3
```



### Test Case 9

**Input:**
```text
8
3 6 9 12 15 18 21 24
4
```
**Expected output:**

```text
3<->6<->9<->12<->15<->18<->21<->24
15<->18<->21<->24<->3<->6<->9<->12
```




### Test Case 10

**Input:**
```text
4
0 0 0 0
3
```
**Expected output:**

```text
0<->0<->0<->0
0<->0<->0<->0
```
