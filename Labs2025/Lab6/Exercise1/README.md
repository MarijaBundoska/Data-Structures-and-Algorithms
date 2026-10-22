## Exercise 1 - Counting Leaf Nodes in a Subtree of a General Tree

Write a function that returns the number of leaf nodes in the subtree of a given node in a general tree.

**Input:**

The first line contains an integer `N`. Then, the name of the root is given. The next `N-1` lines contain the name of the parent node (an existing node) and the name of a node that should be its child.

After that, an integer `M` is given, representing the number of subtrees for which the number of leaf nodes must be calculated. The next `M` lines contain the names of the nodes whose subtrees should be examined.

**Output:**

Print the number of leaf nodes in each of the requested subtrees.

**Example:**

**Input:**
```text
7
root
root node1
root node2
root node3
node1 node11
node1 node12
node3 node31
3
root
node1
node2
```

**Output:**
```text
4
2
1
```

**Explanation:**

- The subtree rooted at `root` has 4 leaf nodes: `node11`, `node12`, `node2`, and `node31`.
- The subtree rooted at `node1` has 2 leaf nodes: `node11` and `node12`.
- The subtree rooted at `node2` has 1 leaf node, because `node2` itself is a leaf.


## Задача 1 - Броење листови во поддрво на општо дрво

Да се напише функција што ќе го даде бројот на листови во поддрвото на даден јазол во општо дрво.

**Влез:**

Првиот ред содржи цел број `N`. Потоа е дадено името на коренот, а во следните `N-1` редови се дадени името на родителот (постоечки јазол) и името на јазол што треба да биде негово дете.

Потоа, даден е цел број `M` — бројот на поддрва за кои треба да се најде бројот на листови. Во следните `M` редови се дадени имињата на јазлите чии поддрва треба да се разгледаат.

**Излез:**

Да се испечати бројот на листови во секое од бараните поддрва.

**Пример:**

**Влез:**
```text
7
root
root node1
root node2
root node3
node1 node11
node1 node12
node3 node31
3
root
node1
node2
```

**Излез:**
```text
4
2
1
```

**Објаснување:**

- Поддрвото на јазолот `root` има 4 листови: `node11`, `node12`, `node2` и `node31`.
- Поддрвото на јазолот `node1` има 2 листови: `node11` и `node12`.
- Поддрвото на јазолот `node2` има 1 лист, бидејќи самиот јазол е лист.





## Test Cases


### Test Case 1

**Input:**
```text
7
root
root node1
root node2
root node3
node1 node11
node1 node12
node3 node31
3
root
node1
node2
```
**Expected output:**

```text
4
2
1
```





### Test Case 2

**Input:**
```text
5
root
root A
root B
A A1
A A2
2
A
B
```
**Expected output:**

```text
2
1
```





### Test Case 3

**Input:**
```text
6
root
root X
X Y
Y Z
root L1
Z L2
2
X
Y
```
**Expected output:**

```text
1
1
```






### Test Case 4

**Input:**
```text
8
root
root C1
root C2
root C3
C1 L1
C2 L2
C3 L3
root C4
1
root
```
**Expected output:**

```text
4
```






### Test Case 5

**Input:**
```text
11
node1
node1 node2
node2 node3
node1 node4
node2 node5
node3 node6
node3 node7
node1 node8
node4 node9
node2 node10
node4 node11
4
node1
node2
node3
node9
```
**Expected output:**

```text
7
4
2
1
```






### Test Case 6

**Input:**
```text
12
node1
node1 node2
node2 node3
node1 node4
node2 node5
node1 node6
node4 node7
node5 node8
node8 node9
node5 node10
node4 node11
node2 node12
5
node1
node2
node3
node4
node5
```
**Expected output:**

```text
7
4
1
2
2
```
