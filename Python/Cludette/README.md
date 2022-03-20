# Halloween Candy Bars

It's Halloween Night again! Michael, as old as he is, is still in love with
Halloween. This time around, he's gone trick-or-treating at Dan's house.

Dan's always been generous with candies. He's prepared a big bowl filled with n
candy bars. The i-th candy bar has k[i] ingredients, which are written on its
wrapper.

Michael is greedy and wants to take as many candy bars as possible.
However, he's allergic to m ingredients c[0], c[1], ..., c[m-1]. If a candy bar has
any of these m ingredients in it, Michael can't eat it so he won't take it.

Given a description of the candy bars and the ingredients that Michael is allergic
to, output the number of candy bars he will take.


## Input:

- The input consists of n+2 lines.
- The first line of input contains a single integer n.
- The next n lines contain the ingredients of the candy bars. Each line describes a single candy bar as a list of space-separated ingredients that comprise the candy bar.
- Finally, the last line contains a space-separated list of the ingredients Michael is allergic to (i.e. the information from the list c of length m).


## Output:

Print a single integer, the number of candy bars Michael takes.


## Constraints:

- 1 <= n, m, k[i] <= 100
- Every ingredient is a non-empty string of lowercase English letters of length at most 7.
- No candy bar has the same ingredient listed twice.
- No ingredient appears twice in the list of ingredients Michael is allergic to.


## Time Limit:

Your program has to finish running within 4 seconds on any valid input.


## Sample Input 1

```
3
sugar cocoa salt
salt celery poison bleach
almonds
celery carrots
```

## Sample Output 1

```
2
```

## Sample 1 Explanation

- There are three candy bars. They have 3, 4, and 1 ingredients each respectively.
- Michael is allergic to celery and carrots. This means that he won't take the
second candy bar as it contains celery.
- The other 2 candy bars are fine for him, so he'll take them.

## Sample Input 2

```
5
a b c
b d f
g d e f
c
a b c
b c
```

## Sample Output 2

```
1
```