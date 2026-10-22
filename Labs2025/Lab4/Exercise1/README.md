## Exercise - Validating Nested Function Tags

We are given code in a modified programming language where functions are represented by an opening and a closing tag (`functionName` and `endfunctionName`). Your task is to determine whether the given code is valid.

**Example of valid code:**
```text
func1
func2
endfunc2
func3
endfunc3
endfunc1
```

**Example of invalid code (the closing tag for `func3` is missing):**
```text
func1
func2
endfunc2
func3
endfunc1
```

**Input:**

The input consists of code written in a modified programming language, where each tag is written on a separate line. Tags are entered until `"x"` is entered.

**Output:**

Print `"Valid"` if the code is valid, or `"Invalid"` if the code is not valid.

---

## Задача - Проверка на валидност на вгнездени функционални тагови

Даден е код на модифициран програмски јазик каде функциите се претставени со отворен и затворен таг (`imeFunkcija` и `endimeFunkcija`). Ваша задача е да дефинирате дали дадениот програмски код е валиден.

**Пример за валиден код:**
```text
func1
func2
endfunc2
func3
endfunc3
endfunc1
```

**Пример за невалиден код (испуштен е затворениот таг за `func3`):**
```text
func1
func2
endfunc2
func3
endfunc1
```

**Влез:**

Се внесува код на модифициран програмски јазик, каде секој таг е напишан во нов ред. Таговите се внесуваат сè додека не се внесе `"x"`.

**Излез:**

Да се испечати `"Valid"` доколку кодот е валиден, или `"Invalid"` доколку кодот не е валиден.






## Test Cases


### Test Case 1

**Input:**
```text
func1
func2
endfunc2
func3
endfunc3
endfunc1
x
```
**Expected output:**

```text
Valid
```




### Test Case 2

**Input:**
```text
func1
func2
endfunc2
func3
endfunc1
x
```
**Expected output:**

```text
Invalid
```





### Test Case 3

**Input:**
```text
func1
func2
endfunc2
func3
endfunc3
x
```
**Expected output:**

```text
Invalid
```





### Test Case 4

**Input:**
```text
func1
endfunc1
func2
endfunc2
func3
endfunc3
x
```
**Expected output:**

```text
Valid
```





### Test Case 5

**Input:**
```text
func1
endfunc1
func2
endfunc2
func3
endfunc3
endfunc1
x
```
**Expected output:**

```text
Invalid
```






### Test Case 6

**Input:**
```text
func3
func1
endfunc1
func1
endfunc1
func3
func2
func1
endfunc1
endfunc2
endfunc3
endfunc3
x
```
**Expected output:**

```text
Valid
```






### Test Case 7

**Input:**
```text
func3
func1
endfunc1
func1
func1
endfunc1
endfunc1
func3
func2
func2
endfunc2
func1
endfunc1
endfunc2
endfunc3
endfunc3
x
```
**Expected output:**

```text
Valid
```





### Test Case 8

**Input:**
```text
func3
func1
endfunc1
endfunc3
endfunc1
func1
endfunc1
func3
func2
func1
endfunc1
endfunc2
endfunc3
endfunc3
x
```
**Expected output:**

```text
Invalid
```






### Test Case 9

**Input:**
```text
func3
func1
endfunc1
func1
func2
func3
endfunc3
endfunc2
endfunc1
func3
func2
func1
endfunc1
endfunc2
endfunc3
endfunc3
x
```
**Expected output:**

```text
Valid
```






### Test Case 10

**Input:**
```text
func3
func1
endfunc1
func1
func2
func3
endfunc4
endfunc2
endfunc1
func3
func2
func1
endfunc1
endfunc2
endfunc3
endfunc3
x
```
**Expected output:**

```text
Invalid
```



