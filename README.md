Place to gather all the basic programs written in order to master the knowledge of datastructures and programs.

All the problems could be classified on the basis of datastructure.

### 1. String Manipulation Problems

  - The total number of substring possible for a string of length n is  **n * ( n + 1 ) / 2**
---
    For example: string str = "Hello World"; // length == 11

    Lets begin by taking 
    1 character substring at time: H, e, l, l, o, , W, o, r, l, d. 
    Then by taking 2 characters at time: He, el, ll, lo, o , W, Wo, or, rl, ld. 
    Then by taking 3 chars: Hel, .. etc.

    So the total substring count is 11 + 10 + 9 + .. + 1 and, 
    in general, for i from 1 to n, we have n - i + 1 substrings. By summition:

    Sigma (n + 1 - i) from i = 1 to n, yields n * (n + 1) - n * (n + 1) / 2 which is n * (n + 1) / 2
---
