## Exercise 7 - Rotate a Doubly Linked List to the Right

Given a doubly linked list of integers. Additionally, a natural number **k** is given. The elements in the list should be rotated **k** times to the right.

**Input:** The first line contains the number of elements in the list — **N**. The next line contains the elements separated by spaces. The last line contains the natural number **k**.

**Output:** Print the list before and after the modification.

---

## Задача 7 - Ротирање на двострано поврзана листа надесно

Дадена е двострано поврзана листа од цели броеви. Дополнително, даден е и уште еден природен број **k**. Елементите во листата треба да се ротираат **k** пати надесно.

**Влез:** Во првиот ред од влезот е даден бројот на елементи во листата — **N**, па во следниот ред самите елементи одделени со празно место. На крај, во последниот ред даден е и природниот број **k**.

**Излез:** На излез треба да се испечати листата пред и после промената.



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
4
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
6
```
**Expected output:**

```text
0<->2<->4<->6<->8
8<->0<->2<->4<->6
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
4
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
