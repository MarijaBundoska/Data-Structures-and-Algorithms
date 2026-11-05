## Exercise 4 - Insert "Outlier" Before Strings Longer Than L

Given a singly linked list whose nodes contain one `String` each. Additionally, a natural number **L** is given. In the given list, before every node containing a `String` with a length greater than **L**, a new node with the value `"Outlier"` should be inserted.

**Input:** The first line contains the number of elements in the list — **N**. The next **N** lines contain the elements (Strings) of the list. The last line contains the number **L**.

**Output:** Print the list before and after the modification.

---

## Задача 4 - Вметнување „Outlier“ пред String-ови со должина поголема од L

Дадена е еднострана поврзана листа чии што јазли содржат по еден `String`. Дополнително, даден е и уште еден природен број **L**. Во дадената листа пред секој јазол којшто содржи `String` со должина поголема од **L** да се вметне нов јазол со вредност `"Outlier"`.

**Влез:** Во првиот ред од влезот е даден бројот на елементи во листата — **N**, па во следните **N** редови се дадени самите елементи (`String`-ови) од листата. На крај, во последниот ред е даден бројот **L**.

**Излез:** На излез треба да се испечати листата пред и после промената.




## Test Cases


### Test Case 1

**Input:**
```text
3
Sky
Blue
Cloud
5
```
**Expected output:**

```text
Sky->Blue->Cloud
Sky->Blue->Cloud
```




### Test Case 2

**Input:**
```text
1
Hello
4
```
**Expected output:**

```text
Hello
Outlier->Hello
```



### Test Case 3

**Input:**
```text
3
Big
Elephant
Small
6
```
**Expected output:**

```text
Big->Elephant->Small
Big->Outlier->Elephant->Small
```




### Test Case 4


**Input:**
```text
4
Apple
Banana
Pear
Watermelon
6
```
**Expected output:**

```text
Apple->Banana->Pear->Watermelon
Apple->Banana->Pear->Outlier->Watermelon
```



### Test Case 5

**Input:**
```text	
5
Cat
Tiger
Leopard
Lion
Cheetah
4
```
**Expected output:**

```text
Cat->Tiger->Leopard->Lion->Cheetah
Cat->Outlier->Tiger->Outlier->Leopard->Lion->Outlier->Cheetah
```



### Test Case 6

**Input:**
```text
```
**Expected output:**

```text
```



### Test Case 7

**Input:**
```text
```
**Expected output:**

```text
```



### Test Case 8

**Input:**
```text
```
**Expected output:**

```text
```




### Test Case 9

**Input:**
```text
```
**Expected output:**

```text
```



### Test Case 10

**Input:**
```text
```
**Expected output:**

```text
```
