## Exercise 1 - Transforming a Binary Search Tree by Adding the Sum of Smaller Nodes

Given a binary search tree whose nodes contain distinct integers, transform the tree so that the value of each node is increased by the sum of all node values that are smaller than its original value. Finally, print the transformed tree using the `printTreeWithIndent()` method.

**Input:**

The first line contains the number of nodes `N`. The second line contains the values to be inserted into the tree.

**Output:**

Print the transformed tree using the `printTreeWithIndent()` method.




<img width="608" height="279" alt="image" src="https://github.com/user-attachments/assets/e55228e7-4cc0-4c4b-9d95-196a2b77b0bb" />




**Explanation**

There are no nodes in the tree smaller than `1`, so its value remains unchanged.

The only node smaller than `2` is `1`, so the result is `2 + 1 = 3`.

The nodes smaller than `3` are `1` and `2`, so the result is `3 + 1 + 2 = 6`.

The nodes smaller than `6` are `1`, `2`, and `3`, so the result is `6 + 1 + 2 + 3 = 12`.

All the other nodes in the tree are smaller than `7`, so the result is `7 + 1 + 2 + 3 + 6 = 19`.



**Example:**

**Input:**
```text
5
2 1 6 3 7
```

**Output:**
```text
   1
3
      6
   12
      19
```


## Задача 1 - Трансформација на бинарно пребарувачко дрво со додавање на сумата на помалите јазли

За дадено бинарно пребарувачко дрво чии јазли содржат цели броеви без повторување, да се трансформира дрвото така што на вредноста на секој јазол ќе ѝ се додаде сумата на вредностите на сите јазли што се помали од неговата оригинална вредност. На крај, да се испечати трансформираното дрво со користење на методот `printTreeWithIndent()`.

**Влез:**

Првиот ред го содржи бројот на јазли `N`. Во вториот ред се дадени вредностите што треба да се вметнат во дрвото.

**Излез:**

Трансформираното дрво да се испечати со користење на методот `printTreeWithIndent()`.




<img width="1289" height="283" alt="image" src="https://github.com/user-attachments/assets/6af076ad-b4e0-495f-b2bd-41c1d606be8f" />





**Пример:**

**Влез:**
```text
5
2 1 6 3 7
```

**Излез:**
```text
   1
3
      6
   12
      19
```




## Test Cases


### Test Case 1

**Input:**
```text
5
2 1 6 3 7
```
**Expected output:**

```text
   1
3
      6
   12
      19
```




### Test Case 2

**Input:**
```text
3
1 2 3
```
**Expected output:**

```text
1
   3
      6
```




### Test Case 3

**Input:**
```text
3
-5 -10 0
```
**Expected output:**

```text
   -10
-15
   -15
```



### Test Case 4

**Input:**
```text
5
5 2 8 7 10
```
**Expected output:**

```text
   2
7
      14
   22
      32
```




### Test Case 5

**Input:**
```text
8
11 2 29 1 7 15 40 35
```
**Expected output:**

```text
      1
   3
      10
21
      36
   65
         100
      140
```



### Test Case 6

**Input:**
```text
11
50 25 75 10 35 60 90 5 15 85 100
```
**Expected output:**

```text
         5
      15
         30
   55
      90
140
      200
   275
         360
      450
         550
```
