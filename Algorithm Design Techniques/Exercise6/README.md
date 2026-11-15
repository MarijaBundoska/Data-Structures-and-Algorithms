## Exercise 6  - Finding Misplaced Numbers in an Almost Sorted Array

Given an array of numbers that is "almost" sorted in ascending order, meaning that in an otherwise sorted array there are a few misplaced numbers that are out of order. The misplaced numbers are always small numbers that are located to the right of their correct positions.

Your task is to find the misplaced numbers, as well as the number of positions each misplaced number needs to be moved to the left in order for the array to become sorted.

**NOTE:** The optimal solution has a time complexity smaller than quadratic.

**Input:**

The first line contains an integer **N**, the size of the array.

The next N lines contain the numbers in the array.

**Output:**

The first line prints **M**, the number of misplaced numbers.

The next M lines print each misplaced number, as well as the number of positions it needs to be moved to the left.

**Note:** The misplaced numbers are sorted in ascending order relative to each other, meaning that when a misplaced number is moved to the left, it will not pass another misplaced number.

**Example:**

**Input**

```text
8
1
3
4
5
2
6
8
7
```

**Output**

```text
2
2 3
7 1
```

**Explanation:**

There are 8 numbers in the input. Among them, the numbers 2 and 7 are not in their correct positions. If we move the number 2 three positions to the left and the number 7 one position to the left, the array will be sorted.

---

## Задача 6 - Пронаоѓање на залутани броеви во речиси сортирана низа

Дадена е низа од „речиси“ сортирани броеви во растечки редослед, во смисол дека во сортирана низа има неколку залутани броеви кои се надвор од редоследот. Залутаните броеви се секогаш мали броеви кои се наоѓаат подесно од нивното вистинско место.

Ваша задача е да ги најдете залутаните броеви, како и бројот на места што залутаниот број треба да се помести во лево за низата да биде сортирана.

**НАПОМЕНА:** Оптималното решение има сложеност помала од квадратна.

**Влез:**

Во првиот ред е даден број **N**, големината на низата.

Во наредните N редови се дадени броевите од низата.

**Излез:**

Во првиот ред се печати **M**, бројот на залутани броеви.

Во наредните M редови, се печати секој залутан број, како и бројот на места за кои треба да биде поместен во лево.

**Забелешка:** Залутаните броеви се растечки подредени еден во однос на друг, во смисол дека залутан број при поместување на лево нема да премине преку друг залутан број.

**Пример**

**Влез**

```text
8
1
3
4
5
2
6
8
7
```

**Излез**

```text
2
2 3
7 1
```

**Образложение:**

Дадени се 8 броеви на влез. Од нив, бројот 2 и бројот 7 се надвор од своите места. Ако бројот 2 го поместиме за 3 места на лево, а бројот 7 го поместиме за 1 место на лево, низата ќе биде во сортиран редослед.



## Test Cases


### Test Case 1

**Input:**
```text
8
1
3
4
5
2
6
8
7
```
**Expected output:**

```text
2
2 3
7 1
```





### Test Case 2

**Input:**
```text
8
2
6
8
10
4
12
16
14
```
**Expected output:**

```text
2
4 3
14 1
```





### Test Case 3

**Input:**
```text
5
1
2
3
4
5
```
**Expected output:**

```text
0
```



### Test Case 4

**Input:**
```text
10
1
2
3
4
5
6
7
8
9
10
```
**Expected output:**

```text
0
```




### Test Case 5

**Input:**
```text
1
1
```
**Expected output:**

```text
0
```



### Test Case 6

**Input:**
```text
8
1
0
2
4
7
9
13
15
```
**Expected output:**

```text
1
0 1
```



### Test Case 7

**Input:**
```text
5
5
10
15
20
0
```
**Expected output:**

```text
1
0 4
```



### Test Case 8

**Input:**
```text
0
```
**Expected output:**

```text
0
```




### Test Case 9

**Input:**
```text
5
5
10
15
20
-5
```
**Expected output:**

```text
1
-5 4
```



### Test Case 10
**Input:**
```text
5
-5
0
-10
10
5
```
**Expected output:**

```text
2
-10 2
5 1
```
