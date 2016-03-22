# Clarence-Problem
This is my solution to the Clarence Problem from the subreddit /r/DailyProgrammer. (https://www.reddit.com/r/dailyprogrammer/comments/4bc3el/20160321_challenge_259_easy_clarence_the_slow/)

My process in solving this problem is as follows:

I began to work out this problem in my head, trying to solve it on my own; I avoided the answers given in the comments section and tried to make up my own solution. I started out thinking a graph implementation would suffice. It would be a lot of work for such a simple problem, but it would be fast, and it would work. I quickly realized that this method required me to give the distances directly in the main method, which is ineffecient. I accepted this fact and continued working. Then I realized you don't need to keep track of vertices, so I started to implement my solution using Java's HashMap class. A HashMap of every edge and their respective distance would be given in the main method. Again, I felt this was ineffecient but I couldn't think of a better way. Eventually, when I was almost finished I cracked and looked at other people's solutions. Instantly, It became clear to me the optimal solution is to calculate distances using pythagorean theorem. I should have known this seeing as the problem description explicitly states, "The Pythagoras theorem is sufficient to calculate the distance between any two keys." It didn't occur to me that this sentence was the key to the easy, optimal solution.

So, despite my faulty reasoning in the beginning, I saw the error of my ways and implemented a more elegant solution.

It should be noted that I based my final solution heavily on the top comment at the time. So credit goes to /u/Gobbedyret. I essentialy used his solution, but wrote it in Java.

The thread of his solution: 
(https://www.reddit.com/r/dailyprogrammer/comments/4bc3el/20160321_challenge_259_easy_clarence_the_slow/d17tejt)

My solution was written using IntelliJ IDEA Community Edition 2016.1, with JDK1.8.0_73
