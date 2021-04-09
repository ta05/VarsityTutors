public class Playlist {
    
    private Episode head;
    private int size;

    public Playlist() {
        head = null;
        size = 0;
    }

    public void displayPlaylistForward() {
        String display = "[BEGIN] ";
        if (head != null) {
            Episode current = head;
            do {
                display += current + " ";
                current = current.next;
            } while (current != head);
        }
        current += "[END]";
    }

    public void displayPlaylistBackward() {
        String display = "[BEGIN] ";
        if (head != null) {
            Episode current = head.prev;
            do {
                display += current + " ";
                current = current.prev;
            } while (current != head.prev);
        }
        current += "[END]";
    }

    public void addFirst(String title, double duration) {
        if (head == null) {
            head = new Episode(title, duration, null, null);
            size++;
            head.prev = head;
            head.next = head;
        } else {
            Episode newEpisode = new Episode(title, duration, head, head.prev);
            size++;
            head.prev.next = newEpisode;
            head.prev = newEpisode;
            head = newEpisode;
        }
    }

    public void addLast(String title, double duration) {
        if (head == null) {
            head = new Episode(title, duration, null, null);
            size++;
            head.prev = head;
            head.next = head;
        } else {
            Episode newEpisode = new Episode(title, duration, head, head.prev);
            size++;
            head.prev.next = newEpisode;
            head.prev = newEpisode;
        }
    }
    public Episode deleteFirst() {
        if (size == 0)
            return head;
        Episode deletedEpisode = head;
        if (size == 1) {
            head = null;
            size--;
            return deletedEpisode;
        }
        head = head.next;
        head.prev = head.prev.prev;
        head.prev.next = head;
        size--;
        return deletedEpisode;
    }
    
    public Episode deleteLast() {
        if (size == 0)
            return head;
        Episode deletedEpisode = head.prev;
        if (size == 1) {
            head = null;
            size--;
            return deletedEpisode;
        }
        head.prev = head.prev.prev;
        head.prev.next = head;
        size--;
        return deletedEpisode;
    }

    public Episode deleteEpisode(String title) {
        Episode current = head;
        for (int i = 0; i < size; i++) {
            if (current.getTitle().equals(title)) {
                if (i == 0)
                    return deleteFirst();
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Episode deleteEveryNthEpisode(int n) {
        int index = 1;
        Episode current = head;
        while (size > 1) {
            if (index % n == 0) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
            }
            current = current.next;
            index++;
        }
        return current;
    }
}
