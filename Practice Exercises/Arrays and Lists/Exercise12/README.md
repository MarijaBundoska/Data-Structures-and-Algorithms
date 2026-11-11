## Exercise 12 - Moving the First K Elements to the End of a Doubly Linked List

Given a **doubly linked list** of integers. Additionally, another natural number `k` is given. The first `k` elements of the list need to be moved to the end, in the same order.

**Input:**

The first line of the input contains the number of elements in the list - **N**, followed by the elements themselves in the next line, separated by spaces. Finally, the natural number `k` is given in the last line. (`k <= N`)

**Output:**

The list should be printed before and after the modification.

---

## Задача 12 - Преместување на првите K елементи на крајот од двострано поврзана листа

Дадена е **двострано поврзана листа** од цели броеви. Дополнително, даден е и уште еден природен број `k`. Потребно е првите `k` елементи од листата да се преместат на крај, во истиот редослед.

**Влез:**

Во првиот ред од влезот е даден бројот на елементи во листата - **N**, па во следниот ред самите елементи одделени со празно место. На крај, во последниот ред даден е и природниот број `k`. (`k <= N`)

**Излез:**

На излез треба да се испечати листата пред и после промената.


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
3<->4<->5<->1<->2
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
1<->2<->0
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
2
```
**Expected output:**

```text
0<->2<->4<->6<->8
4<->6<->8<->0<->2
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
100<->10<->20<->30<->40<->50<->60<->70<->80<->90
```





### Test Case 7

**Input:**
```text
2
3 7
0
```
**Expected output:**

```text
3<->7
3<->7
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
