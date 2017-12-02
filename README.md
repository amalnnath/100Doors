# 100 Doors

## Problem

There are 100 doors in a row, all doors are initially closed. A person walks through all doors multiple times and toggle (if open then close, if close then open) them in following way:

In first walk, the person toggles every door

In second walk, the person toggles every second door, i.e., 2nd, 4th, 6th, 8th, �

In third walk, the person toggles every third door, i.e. 3rd, 6th, 9th, �

...
...

In 100th walk, the person toggles 100th door.

Which doors are open in the end?

## Solution

A door is toggled in ith walk if i divides door number. For example the door number 45 is toggled in 1st, 3rd, 5th, 9th and 15th walk.
The door is switched back to initial stage for every pair of divisors. For example 45 is toggled 6 times for 3 pairs (5, 9), (15, 3) and (1, 45).
It looks like all doors would become closes at the end. But there are door numbers which would become open, for example 16, the pair (4, 4) means only one walk. Similarly all other perfect squares like 4, 9, �.

So the answer is 1, 4, 9, 16, 25, 36, 49, 64, 81 and 100.

## Implementation

To solve the problem, instead of using any fancy equations, I simply implemented 3 classes (Could have done in 2). I created a Door class which keeps track of each door and their status. I created a Walk class which creates 100 doors and a Main class to run everything. The code should be self explanitory.
