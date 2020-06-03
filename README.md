# 8Game-Puzzle-Solver

A java implementation of 5 different algorithms to solve the 8-puzzle game. 

## How to compile

To compile just run the makefile with the command:

```text
make
```

on the terminal

## How to run

Choose your algorithm by picking the corresponding file:

-   **J8P**  --> Depth First Search (DFS)
-   **J8L**  --> Breadth First Search (BFS)
-   **J8Pi** --> Iterative DFS
-   **J8G**  --> Greedy
-   **J8As** --> A*

**Example**:

For DFS run

```text
java J8P
```

For BFS run

```text
java J8L
```

etc...

## INPUT

**Example**:

```text
3 4 2 5 1 7 6 -1 8
1 2 3 8 -1 4 7 6 5
```

That input is equivalent to the two following game tables:

```text
3  4  2                1  2  3
5  1  7                8 -1  4
6 -1  8                7  6  5
```

`-1` represents the blank position.

## Output

If there's no solution for the provided table configurations the program
will quit immediately  with the following message

```text
Não tem solução
```

Otherwise just wait a little bit ( _shouldn't take too long :-D_ )

When the program finishes, it will print the necessary moves to get from the
initial table to the final table.

It will also print the amount of memory and time it took to compute the solution.
