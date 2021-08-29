## Challenge Summary

Solve the insertion sort puzzle and create a blog post about it.

## Challenge Description

Step through the procedure using the given sample array to trace the method. Document your reasoning
by writing a blog post that includes a visual representation of the result after each iteration.
Once you've finished your article, use the pseudocode given to create a functioning, tested version
of Insertion Sort.

## Approach & Efficiency

I started by reading the instructions and looking at the pseudocode. Then I prepared the files I'd
require for this assignment. I then wrote the blog using the blog example as a guide. I sketched up
the blog's whiteboard and jotted down a quick rundown of the code. This challenge's Big O is space
O(1), and the challenge's time O(n2).

Solution

```
Sample Array: [8,4,23,42,16,15]

Pass 1: [4,8,23,42,16,15]

Pass 2: [4,8,23,16,42,15]

Pass 3: [4,8,16,23,42,15]

Pass 4: [4,8,16,23,15,42]

Pass 5: [4,8,16,15,23,42]

Pass 6: [4,8,15,16,23,42]
```