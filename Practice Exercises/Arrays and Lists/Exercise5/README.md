## Exercise 5 - Move Strings of Length L to the End of a Singly Linked List

Given a singly linked list whose nodes contain one `String` each. Additionally, a natural number **L** is given. In the given list, all nodes containing a `String` with a length equal to **L** should be moved to the end of the list, while preserving the original order of the elements.

**Input:** The first line contains the number of elements in the list — **N**. The next **N** lines contain the elements (Strings) of the list. The last line contains the number **L**.

**Output:** Print the list before and after the modification.

---

## Задача 5 - Преместување на String-ови со должина L на крајот од еднострана поврзана листа

Дадена е еднострана поврзана листа чии што јазли содржат по еден `String`. Дополнително, даден е и уште еден природен број **L**. Во дадената листа потребно е сите јазли коишто содржат `String` со должина **L** да се поместат на крај на листата, задржувајќи го и оригиналниот распоред на елементите.

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
Apple->Pear->Watermelon->Banana
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
Cat->Tiger->Leopard->Cheetah->Lion
```



### Test Case 6

**Input:**
```text
Cat->Tiger->Leopard->Lion->Cheetah
Cat->Tiger->Leopard->Cheetah->Lion
```
**Expected output:**

```text
Ant->Giraffe->Mouse->Elephant->Dog->Whale
Ant->Mouse->Elephant->Dog->Whale->Giraffe
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
Basketball->Run->Jumping->Dance->Play->Cycling->Swimming
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
Happy->Sad->Ecstatic->Tired->Bored->Peaceful->Annoyed->Energetic->Exhausted->Motivated
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
Mountain->River->Lake->Ocean->Glacier->Volcano->Swamp->Hill->Desert->Forest->Valley->Canyon
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
Code->Debug->Deploy->Review->Write->Optimize->Design->Document->Maintain->Refactor->Test->Implement->Develop->Compile->Execute
```
