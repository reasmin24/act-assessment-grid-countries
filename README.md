# ACT Assessment – Grid Countries

## Problem
Given a 2D grid of 0s and 1s, count the number of connected countries.  
A country is a group of `1`s connected **orthogonally** (up, down, left, right).

**Example:**

Input:
[
[1, 1, 0],
[0, 1, 0],
[1, 0, 1]
]

Output: `3`

## My Approach
I used an **iterative DFS (Depth First Search)** approach instead of recursion because:

- Iterative DFS avoids **stack overflow** for large grids.
- Using a boolean `visited` array makes it easy to track visited cells.
- Only **orthogonal neighbors** are considered part of the same country.

**Steps:**
1. Loop through each cell in the grid.
2. If a cell contains `1` and is **not visited**, start a DFS from it.
3. Mark all reachable `1`s as visited.
4. Increment the country count for each DFS initiation.

This ensures that all connected 1s are counted as a single country.

## Time Complexity
O(N × M), where N = number of rows, M = number of columns (each cell is visited once).

## Space Complexity
O(N × M), for the `visited` array and stack used in DFS.

## Why I wrote the code this way
- Iterative DFS is safer for large input sizes than recursive DFS.  
- Explicit visited tracking avoids counting the same country multiple times.  
- Orthogonal connectivity matches the problem definition exactly.  

This approach ensures **correct, efficient, and readable code**.
