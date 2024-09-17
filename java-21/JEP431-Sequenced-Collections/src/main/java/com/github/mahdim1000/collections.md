| Collection Type | Implementation  | Allows Duplicates | Maintains Order | Sorting | Use Case                               |
|-----------------|-----------------|-------------------|-----------------|---------|----------------------------------------|
| `List`          | `ArrayList`     | Yes               | Yes             | No      | Random access, frequent reads          |
|                 | `LinkedList`    | Yes               | Yes             | No      | Frequent insertions/deletions          |
| `Set`           | `HashSet`       | No                | No              | No      | Unique elements, fast access           |
|                 | `LinkedHashSet` | No                | Yes             | No      | Unique elements, maintain insertion order |
|                 | `TreeSet`       | No                | Yes (Sorted)    | Yes     | Unique elements, sorted                |
| `Queue`         | `LinkedList`    | Yes               | Yes             | No      | FIFO operations                        |
|                 | `PriorityQueue` | Yes               | No              | Yes     | Priority-based processing              |
| `Deque`         | `ArrayDeque`    | Yes               | No              | No      | LIFO or FIFO, access at both ends      |
| `Map`           | `HashMap`       | No (Keys)         | No              | No      | Key-value pairs, fast access           |
|                 | `LinkedHashMap` | No (Keys)         | Yes             | No      | Key-value pairs, maintain insertion order |
|                 | `TreeMap`       | No (Keys)         | Yes (Sorted)    | Yes     | Key-value pairs, sorted by keys        |
