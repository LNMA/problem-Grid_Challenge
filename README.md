# problem-Grid_Challenge

1-Review: 

Given a square grid of characters in the range ascii[a-z], rearrange elements of each row alphabetically, ascending. Determine if the columns are also in ascending alphabetical order, top to bottom. Return YES if they are or NO if they are not.

For example, given:

    a b c
    a d e
    e f g

The rows are already in alphabetical order. The columns a a e, b d f and c e g are also in alphabetical order, so the answer would be YES. Only elements within the same row can be rearranged. They cannot be moved to a different row.

2-Input Format

The first line contains number of raws.
The second line contains number of colums.
Each of the next lines contian array element(characters).

3-Output Format

For each test case, on a separate line print true if it is possible to rearrange the grid alphabetically ascending in both its rows and columns, or flase otherwise.
And print all array sorted.

4-Sample

Sample Input

    5
    5
    ebacd
    fghij
    olmkn
    trpqs
    xywuv

Sample Output

    true
    a b c d e 
    f g h i j 
    k l m n o 
    p q r s t 
    u v w x y 
