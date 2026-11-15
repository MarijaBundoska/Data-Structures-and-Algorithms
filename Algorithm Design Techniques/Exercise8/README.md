

## Exercise 8 - Distributing Work Tasks Among Employees

You are given an array of N work tasks, each with an estimated time for completion in hours, which need to be done in a company. The company has M employees, each working 8 hours per day. All work tasks are less than or equal to 8 hours and cannot be split.

Your task is to distribute the work tasks among the employees so that they are completed in the shortest possible time.

**Input:**

The first line contains two integers: **N**, the number of tasks, and **M**, the number of employees.

The second line contains N integers representing the estimated duration of each task in hours.

**Output:**

The first number printed is the number of working days needed to complete all tasks. The second number is the total number of free hours among all employees during those days.

**Example**

**Input**

```text
7 2
8 7 3 5 1 3 1
```

**Output**

```text
2 4
```

**Explanation:**

We have two employees.

On the first day, one employee completes the 8-hour task, while the other completes the 7-hour and 1-hour tasks.

On the second day, one employee completes the 5-hour and 3-hour tasks, while the other completes the 3-hour and 1-hour tasks. This employee has 4 free hours, so we print that number as well.

---

## Задача 8 - Распределување на работните задачи помеѓу вработените

Дадена е низа од **N** работни задачи, со проценето времетраење во часови, кои треба да се извршат во една компанија. Компанијата има на располагање **M** вработени кои работат по 8 часа на ден. Сите работни активности се помали или еднакви од 8 часа и не може да се извршат половично.

Ваша задача е да ја распределите работата помеѓу вработените така што работните задачи ќе се извршат за најкраток можен рок.

**Влез:**

На влез се дадени два броја: **N**, бројот на задачи, и **M**, бројот на вработени.

Во вториот ред на влезот дадени се N цели броеви кои го означуваат времетраењето на секоја задача.

**Излез:**

На излез прво се печати бројот на работни денови потребни за да се извршат задачите. Потоа се печати збирот од вкупниот број на слободни часови кај сите вработени според вашата распределба.

**Пример**

**Влез**

```text
7 2
8 7 3 5 1 3 1
```

**Излез**

```text
2 4
```

**Појаснување:**

Имаме двајца вработени. Првиот ден еден од вработените ќе ја изврши задачата од 8 часа, а вториот задачите од 7 и 1 час. Вториот ден еден од вработените ќе ги изврши задачите од 5 и 3 часа, а вториот задачите од 3 и 1 час. На овој вработен ќе му останат 4 слободни часа, па тоа го печатиме на излез.





## Test Cases


### Test Case 1

**Input:**
```text
7 2
8 7 3 5 1 3 1
```
**Expected output:**

```text
2 4
```



### Test Case 2

**Input:**
```text
4 1
4 4 4 4
```
**Expected output:**

```text
2 0
```





### Test Case 3

**Input:**
```text
3 3
8 8 8
```
**Expected output:**

```text
1 0
```




### Test Case 4

**Input:**
```text
6 2
4 4 4 4 4 4
```
**Expected output:**

```text
2 8
```





### Test Case 5

**Input:**
```text
8 4
2 2 2 2 2 2 2 2
```
**Expected output:**

```text
1 16
```





### Test Case 6

**Input:**
```text
5 3
6 6 6 6 6
```
**Expected output:**

```text
2 18
```





### Test Case 7

**Input:**
```text
7 2
7 7 7 7 7 7 7
```
**Expected output:**

```text
4 15
```




### Test Case 8

**Input:**
```text
9 3
3 3 3 3 3 3 3 3 3
```
**Expected output:**

```text
2 21
```




### Test Case 9

**Input:**
```text
10 5
5 5 5 5 5 5 5 5 5 5
```
**Expected output:**

```text
2 30
```




### Test Case 10
**Input:**
```text
12 4
1 2 3 4 5 6 7 8 1 2 3 4
```
**Expected output:**

```text
2 18
```
