
## Exercise 9 - Move the First Occurrence of M K Positions to the Left

Given a doubly linked list of integers. Additionally, an integer **M** and a natural number **k** are given. The first occurrence of **M** in the list should be found and that number should be moved **k** positions to the left.

**Input:** The first line contains the number of elements in the list — **N**. The next line contains the elements separated by spaces. The last two lines contain the integer **M** and the natural number **k**, respectively.

**Output:** Print the list before and after the modification.

---

## Задача 9 - Поместување на првото појавување на M за K места налево

Дадена е двострано поврзана листа од цели броеви. Дополнително, дадени се и уште еден цел број **M** и еден природен број **k**. Треба да се најде првото појавување на **M** во листата и тој број да се помести **k** места налево.

**Влез:** Во првиот ред од влезот е даден бројот на елементи во листата — **N**, па во следниот ред самите елементи одделени со празно место. На крај, во последните два реда дадени се целиот број **M** и природниот број **k**.

**Излез:** На излез треба да се испечати листата пред и после промената.


## Test Cases


### Test Case 1

**Input:**
```text
5
1 2 3 4 5
3
2
```
**Expected output:**

```text
1<->2<->3<->4<->5
3<->1<->2<->4<->5
```



### Test Case 2

**Input:**
```text
7
10 20 30 40 50 60 70
40
3
```
**Expected output:**

```text
10<->20<->30<->40<->50<->60<->70
40<->10<->20<->30<->50<->60<->70
```




### Test Case 3

**Input:**
```text
6
5 10 15 20 25 30
20
4
```
**Expected output:**

```text
5<->10<->15<->20<->25<->30
5<->10<->15<->25<->30<->20
```



### Test Case 4

**Input:**
```text
8
1 3 5 7 9 11 13 15
9
5
```
**Expected output:**

```text
1<->3<->5<->7<->9<->11<->13<->15
1<->3<->5<->7<->11<->13<->15<->9
```


### Test Case 5

**Input:**
```text
10
100 200 300 400 500 600 700 800 900 1000
600
2
```
**Expected output:**

```text
100<->200<->300<->400<->500<->600<->700<->800<->900<->1000
100<->200<->300<->600<->400<->500<->700<->800<->900<->1000
```



### Test Case 6

**Input:**
```text
9
5 3 8 6 2 4 1 9 7
4
7
```
**Expected output:**

```text
5<->3<->8<->6<->2<->4<->1<->9<->7
5<->3<->8<->6<->2<->1<->9<->4<->7
```



### Test Case 7

**Input:**
```text
4
9 12 15 18
15
2
```
**Expected output:**

```text
9<->12<->15<->18
15<->9<->12<->18
```


### Test Case 8

**Input:**
```text
6
22 33 44 55 66 77
55
3
```
**Expected output:**

```text
22<->33<->44<->55<->66<->77
55<->22<->33<->44<->66<->77
```


### Test Case 9

**Input:**
```text
5
1 1 1 1 1
1
3
```
**Expected output:**

```text
1<->1<->1<->1<->1
1<->1<->1<->1<->1
```


### Test Case 10

**Input:**
```text
10
1 2 3 4 5 6 7 8 9 10
11
7
```
**Expected output:**

```text
1<->2<->3<->4<->5<->6<->7<->8<->9<->10
Elementot ne postoi vo listata
1<->2<->3<->4<->5<->6<->7<->8<->9<->10
```
