# ACT Assessment – Grid Countries

## Problem
Given a 2D grid of 0s and 1s, count the number of connected countries (1s connected orthogonally).

Example:

Input:
[
 [1, 1, 0],
 [0, 1, 0],
 [1, 0, 1]
]

Output: 3

## My Approach
I used an **iterative DFS** (Depth First Search) approach instead of recursive DFS because:

- Iterative DFS avoids **stack overflow** in large grids.
- It's easier to track visited cells using a boolean array.
- Only **orthogonal neighbors** (up, down, left, right) are counted as part of a country.

Steps:

1. Loop through each cell in the grid.
2. If the cell is `1` and not visited, start a DFS from it.
3. Mark all reachable `1`s as visited.
4. Increment country count for each DFS initiation.

## Time Complexity
O(N × M), where N is rows and M is columns (each cell visited once).

## Space Complexity
O(N × M) for visited tracking and stack.
