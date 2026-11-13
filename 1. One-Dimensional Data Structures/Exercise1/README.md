## Exercise 1 - Process Scheduling Using a Queue

Given **N** processes, where each process is represented by a name and the time required for its execution.

The processes are handled according to the **queue principle (FIFO)**, in the order in which they are entered.

In each iteration, the processor executes one process for at most **T** time units. If the process is not completed, its remaining execution time is decreased by **T**, and the process is added to the end of the queue. If the process is completed, its name is printed.

Your task is to determine the order in which the processes are completed.

**Input:**

The first line contains the number of processes **N** and the number of time units **T** that are processed in one iteration.

The following **N** lines contain the name of each process and the time required for its execution.

**Example:**

**Input**
```text
3 2
Process-A 3
Process-B 1
Process-C 4
```

**Output**
```text
1. Process-B
2. Process-A
3. Process-C
```


## Задача 1 - Распоредување на процеси со користење редица

Дадени се **N** процеси, каде секој процес е претставен со име и време потребно за негово извршување.

Процесите се обработуваат според принципот на **редица (FIFO)**, по редоследот на нивното внесување.

Процесорот во секој круг обработува еден процес најмногу **T** временски единици. Доколку процесот не е завршен, преостанатото време се намалува за **T**, а процесот се додава на крајот од редицата. Доколку процесот е завршен, неговото име се печати.

Ваша задача е да го определите редоследот по кој завршуваат процесите.

**Влез:**

Прво се внесува бројот на процеси **N** и временските единици **T** кои се обработуваат во една итерација.

Потоа, во следните **N** редови се внесуваат името на секој процес и времето потребно за негово извршување.

**Пример:**

**Влез**
```text
3 2
Process-A 3
Process-B 1
Process-C 4
```

**Излез**
```text
1. Process-B
2. Process-A
3. Process-C
```



## Test Cases 


### Test Case 1

**Input:**
```text
3 2
Process-A 3
Process-B 1
Process-C 4
```
**Expected output:**

```text
1. Process-B
2. Process-A
3. Process-C
```


### Test Case 2

**Input:**
```text
4 5
Process-A 1
Process-B 3
Process-C 5
Process-D 2
```
**Expected output:**

```text
1. Process-A
2. Process-B
3. Process-C
4. Process-D
```




### Test Case 3

**Input:**
```text
4 2
Process-A 4
Process-B 4
Process-C 4
Process-D 4
```
**Expected output:**

```text
1. Process-A
2. Process-B
3. Process-C
4. Process-D
```




### Test Case 4

**Input:**
```text
4 3
Process-A 6
Process-B 7
Process-C 2
Process-D 3
```
**Expected output:**

```text
1. Process-C
2. Process-D
3. Process-A
4. Process-B
```




### Test Case 5

**Input:**
```text
2 3
Process-A 10
Process-B 4
```
**Expected output:**

```text
1. Process-B
2. Process-A
```





### Test Case 6

**Input:**
```text
1 2
Process-A 7
```
**Expected output:**

```text
1. Process-A
```



### Test Case 7

**Input:**
```text
3 3
Process-A 5
Process-B 4
Process-C 2
```
**Expected output:**

```text
1. Process-C
2. Process-A
3. Process-B
```



### Test Case 8

**Input:**
```text
5 10
Process-A 8
Process-B 1
Process-C 6
Process-D 3
Process-E 9
```
**Expected output:**

```text
1. Process-A
2. Process-B
3. Process-C
4. Process-D
5. Process-E
```


### Test Case 9

**Input:**
```text
3 4
Process-A 4
Process-B 4
Process-C 4
```
**Expected output:**

```text
1. Process-A
2. Process-B
3. Process-C
```



### Test Case 10

**Input:**
```text
4 1
Process-A 3
Process-B 1
Process-C 2
Process-D 4
```
**Expected output:**

```text
1. Process-B
2. Process-C
3. Process-A
4. Process-D
```


