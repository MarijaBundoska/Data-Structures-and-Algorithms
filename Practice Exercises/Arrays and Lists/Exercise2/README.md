
## Exercise 2 - Removing Nodes with Strings Shorter Than L

Given a singly linked list whose nodes each contain a `String`, and an additional natural number **L**, remove every node whose string has a length smaller than **L**.

**Input:** The first line contains the number of elements in the list **N**. The next **N** lines contain the elements of the list (strings). The last line contains the number **L**.

**Output:** Print the list before and after the transformation.


## Задача 2 - Бришење на јазли со стрингови пократки од L

Дадена е еднострана поврзана листа чиишто јазли содржат по еден `String`. Дополнително, даден е и уште еден природен број **L**. Од дадената листа потребно е да се избрише секој јазел којшто содржи `String` со должина помала од **L**.

**Влез:** Во првиот ред од влезот е даден бројот на елементи во листата - **N**, па во следните **N** редови се дадени самите елементи (`String`-ови) од листата. На крај, во последниот ред е даден бројот **L**.

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
Cloud
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
Elephant
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
Banana->Watermelon
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
Tiger->Leopard->Lion->Cheetah
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
Giraffe->Elephant
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
Basketball->Swimming
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
Energetic->Exhausted->Motivated
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
Mountain->Desert->Forest->Valley->Glacier->Volcano->Canyon
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
Develop->Compile->Execute->Optimize->Document->Maintain->Refactor->Implement
```
