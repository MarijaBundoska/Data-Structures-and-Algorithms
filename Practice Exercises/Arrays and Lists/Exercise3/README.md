## Exercise 3 - Insert "Target" After Strings of Length L

Given a singly linked list whose nodes contain one `String` each. Additionally, a natural number **L** is given. In the given list, after every node containing a `String` of length **L**, a new node with the value `"Target"` should be inserted.

**Input:** The first line contains the number of elements in the list — **N**. The next **N** lines contain the elements (Strings) of the list. The last line contains the number **L**.

**Output:** Print the list before and after the modification.

---

## Задача 3 - Вметнување „Target“ по String-ови со должина L

Дадена е еднострана поврзана листа чии што јазли содржат по еден `String`. Дополнително, даден е и уште еден природен број **L**. Во дадената листа после секој јазол којшто содржи `String` со должина **L** да се вметне нов јазол со вредност `"Target"`.

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
Sky->Blue->Cloud->Target
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
Apple->Banana->Target->Pear->Watermelon
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
Cat->Tiger->Leopard->Lion->Target->Cheetah
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
Ant->Giraffe->Target->Mouse->Elephant->Dog->Whale
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
Basketball->Run->Jumping->Swimming->Target->Dance->Play->Cycling
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
Happy->Sad->Ecstatic->Tired->Energetic->Target->Bored->Exhausted->Target->Motivated->Target->Peaceful->Annoyed
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
Mountain->River->Lake->Ocean->Desert->Target->Forest->Target->Valley->Target->Glacier->Volcano->Swamp->Hill->Canyon->Target
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
Code->Develop->Target->Debug->Deploy->Review->Write->Compile->Target->Execute->Target->Optimize->Design->Document->Maintain->Refactor->Test->Implement
```
