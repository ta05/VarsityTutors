# Playlist

## Description

We are interested in developing a Playlist application that supports adding,
deleting, and navigating through different Podcast episodes. To make navigating our Playlist flexible, we
looked for a data structure that supports dynamic adding and removing of episodes, while also supporting
easy and smooth traversing back and forth between episodes.


For these reasons, we will be using a **Circular Doubly Linked List** to implement our Playlist. It is
circular because the last element in the list points to the first element, thus completing a cycle (circle) of
links. And it is doubly because each node has two links, one that refers to the next node and another that
referes to the previous node. For our Playlist, this design choice means it will be easy to move forward or
backward from any given episode. Starter code is provided; it includes:

1. Class Episode represents an individual Podcast episode. You can think of it as the equivalent of a
‘Node’ class in our lecture examples, but with more fields. Each episode has a title, length (duration), a
link to the next episode, and a link to the previous episode. You must not modify or add anything to this
class.
2. Class Playlist represents a circular doubly linked list of Episode objects. The playlist is designed to
always maintain a reference to the head (i.e. the first episode in the list), and a size integer (i.e. the total
number of episodes so far). You will implement all the operations supported by this Playlist by filling the
code for its member methods. Remember to always make sure that the Playlist’s head and size variables
are updated properly after/during each supported operation.
3. Finally, class ITunes represents the application that will test the different features supported in your
Playlist. You can modify the code in this class as you wish. Note that the Playlist may contain no episodes (e.g. when it is first created), a single episode, or
multiple episodes. The figure below shows how the nodes should be linked under these different scenarios.
Pay attention to how next and prev are wired. Also, note that de-referencing links in your code more than once is possible; so episodeObject.prev.next is valid (assuming episodeObject is an object of type
Episode).

## Task

You need to fill in the implementation for the following methods in class Playlist. Do not worry about duplicates for this assignment (i.e. you can assume that no episode will be duplicated and that no two episode titles will be identical).


- `public void displayPlaylistForward()`: This method prints the episodes in the current Playlist in order. It stats with printing the first episode, then moves forwards until it reaches the end of the playlist
- `public void displayPlaylistBackward()`: Unlike displayPlaylistForward() which is available to you in the starter code, this method prints the episodes in the current Playlist in a reverse order. It starts with printing the last episode, then moves
backwards until it reaches the beginning of the playlist. See starter code comments for details on
the exact format of the expected output.
- `public void addFirst(String title, double duration)`: Create a new Episode using the given title and duration parameters, then add this Episode properly at the beginning of the current Playlist.
- `public void addLast(String title, double duration)`:
Create a new Episode using the given title and duration parameters, then add this Episode properly at the end of the current Playlist.
- `public void add(String title, double duration, int index)`: Create a new Episode using the given title and duration parameters, then add this Episode properly
at the given index. Assume that index zero corresponds to the first node, and so on.
- `public Episode deleteFirst()`: This method should properly delete and return the first Episode in the playlist.
- `public Episode deleteLast()`: This method should properly delete and return the last Episode in the playlist.
-  `public Episode deleteEpisode(String title)`: This method should properly delete and return the Episode with the given title.
- `public Episode deleteEveryNthEpisode(int n)`: One day, a bored manager at Apple decided that iTunes should support a new feature where the user only provides an unlucky number n, and the application would go on deleting every n-th episode in the user’s Playlist (assuming a circular structure), until only one Episode survives. It is possible that this manager was reading about the Josephus problem the night before, which can be summarized as: given a group of n people arranged in a circle under the edict that every n-th person will be
‘removed’ going around the circle until only one remains. For example, if 6, 5, 4, 3, 2, 1, 0 are
arranged in circle, with m = 3, then the order of removal is 4, 1, 5, 0, 2, 6, with 3 remaining as the
survivor. Your job is to implement that feature for our Playlist, given the method parameter m. This method should return the last surviving Episode in the Playlist.

