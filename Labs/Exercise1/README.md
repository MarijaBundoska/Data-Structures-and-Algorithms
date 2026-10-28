## Exercise 1 - Comparing Two Singly Linked Lists and Identifying Outliers

You are given two singly linked lists whose nodes contain integers. Additionally, you are given a non-negative real number `x`.

For each node in the first list, compare its value `a` with the value `b` of the node at the same position in the second list. If `a` is outside the interval `[b - x, b + x]`, that is, if `|a - b| > x`, replace the value in the first list with the text `Outlier a` and remove the corresponding node from the second list. The original value of `a` must be preserved in the label.

Comparisons must be performed according to the **original positions** of the nodes. Removing a node from the second list must not change the pairs compared afterward. If the difference is exactly `x`, both nodes remain unchanged.

If the first list contains more nodes than the second list, replace the value of every unchecked node in the first list with `Unchecked a`, where `a` is its original value. If the second list is longer, its remaining nodes stay unchanged.

After the modifications, print both lists, first the first list and then the second list.

**Example of original positions:**

For the first list `10->20`, the second list `1->20`, and `x = 2`, the resulting first list is `Outlier 10->20`, and the resulting second list is `20`.

**Example explanation:**

First, compare the nodes with values `10` and `1`. Since their difference is greater than `2`, replace `10` in the first list with `Outlier 10` and remove the node containing `1` from the second list.

Next, compare the nodes containing `20` in both lists, because they occupied the same original position. Their difference is `0`, so both nodes remain unchanged.

**Input:**

The first line contains the number of elements in the first list, `N` (`N >= 0`). The next `N` lines contain its elements. The next line contains the number of elements in the second list, `M` (`M >= 0`), followed by `M` lines containing its elements. The last line contains the real number `x`.

**Output:**

Print the first list after the modifications on the first line and the second list after the modifications on the second line. Separate the elements with `->`. For an empty list, print `Prazna lista!!!`.


## Задача 1 - Споредување на две еднострано поврзани листи и пронаоѓање отстапувања

Дадени се две еднострано поврзани листи чии јазли содржат цели броеви. Дополнително, даден е и ненегативен реален број `x`.

За секој јазол од првата листа да се спореди неговата вредност `a` со вредноста `b` на јазолот на истата позиција во втората листа. Ако `a` е надвор од интервалот `[b - x, b + x]`, односно ако `|a - b| > x`, вредноста во првата листа да се замени со текстот `Outlier a`, а соодветниот јазол да се избрише од втората листа. Во ознаката се задржува првичната вредност на `a`.

Споредбите се вршат според **првичните позиции** на јазлите. Бришењето јазол од втората листа не ги менува паровите што ќе се споредуваат понатаму. Ако разликата е точно `x`, двата јазла остануваат непроменети.

Ако првата листа има повеќе јазли од втората, вредноста на секој непроверен јазол од првата листа да се замени со `Unchecked a`, каде што `a` е неговата првична вредност. Ако втората листа е подолга, нејзините преостанати јазли остануваат непроменети.

По промените да се испечатат двете листи, прво првата, а потоа втората.

**Пример за првичните позиции:**

За првата листа `10->20`, втората листа `1->20` и `x = 2`, резултантната прва листа е `Outlier 10->20`, а резултантната втора листа е `20`.

**Објаснување на примерот:**

Прво се споредуваат јазлите со вредности `10` и `1`. Бидејќи нивната разлика е поголема од `2`, вредноста `10` во првата листа се заменува со `Outlier 10`, а јазолот со вредност `1` се брише од втората листа.

Потоа се споредуваат јазлите со вредност `20` од двете листи, бидејќи тие биле на истата првична позиција. Нивната разлика е `0`, па тие остануваат непроменети.

**Влез:**

Во првиот ред е даден бројот на елементи во првата листа — `N` (`N >= 0`). Во следните `N` редови се дадени нејзините елементи. Потоа е даден бројот на елементи во втората листа — `M` (`M >= 0`), а во следните `M` редови се дадени нејзините елементи. Во последниот ред е даден реалниот број `x`.

**Излез:**

Во првиот ред да се испечати првата листа по промените, а во вториот ред втората листа по промените. Елементите се одделуваат со `->`. За празна листа да се испечати `Prazna lista!!!`.



## Test Cases


### Test Case 1

**Input:**
```text
1
10
1
1
2
```
**Expected output:**

```text
Outlier 10
Prazna lista!!!
```



### Test Case 2

**Input:**
```text
0
0
0
```
**Expected output:**

```text
Prazna lista!!!
Prazna lista!!!
```




### Test Case 3

**Input:**
```text
2
3
-3
2
1
-1
2
```
**Expected output:**

```text
3->-3
1->-1
```



### Test Case 4

**Input:**
```text
3
1
2
3
3
1
7
3
0
```
**Expected output:**

```text
1->Outlier 2->3
1->3
```



### Test Case 5

**Input:**
```text
3
10
20
30
3
1
20
30
2
```
**Expected output:**

```text
Outlier 10->20->30
20->30
```




### Test Case 6

**Input:**
```text
5
5
12
7
20
1
3
6
8
9
2
```
**Expected output:**

```text
5->Outlier 12->7->Unchecked 20->Unchecked 1
6->9
```





### Test Case 7

**Input:**
```text
3
-5
0
8
4
-3
2
5
99
2.5
```
**Expected output:**

```text
-5->0->Outlier 8
-3->2->99
```




### Test Case 8

**Input:**
```text
4
7
-7
7
-7
4
0
0
0
0
0.5
```
**Expected output:**

```text
Outlier 7->Outlier -7->Outlier 7->Outlier -7
Prazna lista!!!
```




### Test Case 9

**Input:**
```text
4
2147483647
-2147483648
-2147483648
2147483647
4
-2147483648
2147483647
-2147483648
2147483647
4294967294.5
```
**Expected output:**

```text
Outlier 2147483647->Outlier -2147483648->-2147483648->2147483647
-2147483648->2147483647
```




### Test Case 10

**Input:**
```text
16
-8
-7
-6
-5
-4
-3
-2
-1
0
1
2
3
4
5
6
7
12
-12
-9
-6
-3
0
-7
-4
-1
2
5
-2
1
2.5
```
**Expected output:**

```text
Outlier -8->-7->-6->-5->Outlier -4->Outlier -3->-2->-1->0->Outlier 1->Outlier 2->3->Unchecked 4->Unchecked 5->Unchecked 6->Unchecked 7
-9->-6->-3->-4->-1->2->1
```
