<h1>Bonus Assignment: Implement a string algorithm</h1>
<hr>
<h3>Adilbekov Daniyal SE-2435</h3>
<hr>
<h2>Report for Knuth-Morris-Pratt (KMP) algorithm</h2>
<h2>Implemention

- LPS array precomputes the length of the longest prefix. LPS precomputed for the pattern LPS allows to avoid unnecessary checks(pattern[0...i]).


<h2>Complexity

- Time complexity: O(N+M)

- Space complexity: O(M)(LPS array)

- N is length of the pattern, M is length of the text

<h2>Metrics</h2>
<img width="1074" height="102" alt="image" src="https://github.com/user-attachments/assets/4387155a-1b0d-4c66-80de-20d843f5f86a" />


<p>The KMP algorithm efficiently found all pattern occurrences across various text lengths, demonstrating fast execution times once the environment was warmed up</p>

<h2>Conclusion</h2><br>The Knuth-Morris-Pratt (KMP) algorithm is a highly efficient string matching solution. By leveraging the precomputed LPS array, it intelligently handles mismatches, significantly reducing the number of comparisons and achieving an optimal linear time complexity of $O(N+M)$.
