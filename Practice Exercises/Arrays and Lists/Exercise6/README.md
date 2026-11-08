## Exercise 6 - Move the Last String of Length L to the Beginning of a Singly Linked List

Given a singly linked list whose nodes contain one `String` each. Additionally, a natural number **L** is given. From the given list, find the last node containing a `String` with a length equal to **L** and move it to the beginning of the list.

**Input:** The first line contains the number of elements in the list — **N**. The next **N** lines contain the elements (Strings) of the list. The last line contains the number **L**.

**Output:** Print the list before and after the modification.

---

## Задача 6 - Преместување на последниот String со должина L на почетокот на еднострана поврзана листа

Дадена е еднострана поврзана листа чии што јазли содржат по еден `String`. Дополнително, даден е и уште еден природен број **L**. Од дадената листа потребно е да се најде последниот јазел којшто содржи `String` со должина **L** и да се премести на почеток на листата.

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
Cloud->Sky->Blue
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
Hello
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
Big->Elephant->Small
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
Banana->Apple->Pear->Watermelon
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
Lion->Cat->Tiger->Leopard->Cheetah
```



### Test Case 6

**Input:**
```text
6
Ant
Giraffe
Mouse
Elephant
Dog
Whale
7
```
**Expected output:**

```text
Ant->Giraffe->Mouse->Elephant->Dog->Whale
Giraffe->Ant->Mouse->Elephant->Dog->Whale
```



### Test Case 7

**Input:**
```text
7
Basketball
Run
Jumping
Swimming
Dance
Play
Cycling
8
```
**Expected output:**

```text
Basketball->Run->Jumping->Swimming->Dance->Play->Cycling
Swimming->Basketball->Run->Jumping->Dance->Play->Cycling
```



### Test Case 8

**Input:**
```text
10
Happy
Sad
Ecstatic
Tired
Energetic
Bored
Exhausted
Motivated
Peaceful
Annoyed
9
```
**Expected output:**

```text
Happy->Sad->Ecstatic->Tired->Energetic->Bored->Exhausted->Motivated->Peaceful->Annoyed
Motivated->Happy->Sad->Ecstatic->Tired->Energetic->Bored->Exhausted->Peaceful->Annoyed
```




### Test Case 9

**Input:**
```text
12
Mountain
River
Lake
Ocean
Desert
Forest
Valley
Glacier
Volcano
Swamp
Hill
Canyon
6
```
**Expected output:**

```text
Mountain->River->Lake->Ocean->Desert->Forest->Valley->Glacier->Volcano->Swamp->Hill->Canyon
Canyon->Mountain->River->Lake->Ocean->Desert->Forest->Valley->Glacier->Volcano->Swamp->Hill
```


### Test Case 10

**Input:**
```text
15
Code
Develop
Debug
Deploy
Review
Write
Compile
Execute
Optimize
Design
Document
Maintain
Refactor
Test
Implement
7
```
**Expected output:**

```text
Code->Develop->Debug->Deploy->Review->Write->Compile->Execute->Optimize->Design->Document->Maintain->Refactor->Test->Implement
Execute->Code->Develop->Debug->Deploy->Review->Write->Compile->Optimize->Design->Document->Maintain->Refactor->Test->Implement
```
