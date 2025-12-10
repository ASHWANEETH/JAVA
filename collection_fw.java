void main() {
    //------------------------------------------------------------------------
    // JAVA COLLECTION FRAMEWORK (Complete Cheatsheet with Examples)
    //------------------------------------------------------------------------

            //------------------------------------------------------------------------
            // LIST (Ordered, allows duplicates)
            //------------------------------------------------------------------------
            List<String> list = new ArrayList<>();
            list.add("A");            // add element
            list.add("B");
            list.add("A");            // duplicates allowed
            list.add(1, "C");         // insert at index
            list.remove("A");         // removes first A
            list.remove(1);            // remove at index
            list.set(0, "X");         // update value
            list.get(0);               // access element
            list.size();               // size of list
            list.contains("B");       // check existence
            list.isEmpty();            // empty check
            Collections.sort(list);    // sort
            Collections.reverse(list); // reverse
            System.out.println(list);  // OUTPUT


            //------------------------------------------------------------------------
            // LINKEDLIST (List + Queue features)
            //------------------------------------------------------------------------
            LinkedList<Integer> ll = new LinkedList<>();
            ll.add(10);
            ll.addFirst(5);            // add at start
            ll.addLast(20);            // add at end
            ll.removeFirst();          // remove first
            ll.removeLast();           // remove last
            ll.peek();                 // view head
            ll.poll();                 // remove + return head
            System.out.println(ll);    // OUTPUT


            //------------------------------------------------------------------------
            // STACK (LIFO)
            //------------------------------------------------------------------------
            Stack<Integer> st = new Stack<>();
            st.push(1);                // push
            st.push(2);
            st.peek();                 // top element
            st.pop();                  // remove top
            st.isEmpty();              // check empty
            System.out.println(st);    // OUTPUT


            //------------------------------------------------------------------------
            // QUEUE (FIFO)
            //------------------------------------------------------------------------
            Queue<String> q = new LinkedList<>();
            q.add("A");
            q.add("B");
            q.offer("C");             // add without error
            q.peek();                  // front element
            q.poll();                  // remove front
            q.isEmpty();
            System.out.println(q);     // OUTPUT


            //------------------------------------------------------------------------
            // PRIORITY QUEUE (Min-Heap default)
            //------------------------------------------------------------------------
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.add(30);
            pq.add(10);
            pq.add(20);
            pq.peek();                 // smallest element
            pq.poll();                 // removes smallest
            System.out.println(pq);    // OUTPUT

            // Max-heap
            PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
            maxPQ.add(10);
            maxPQ.add(5);
            maxPQ.add(20);
            System.out.println(maxPQ); // OUTPUT


            //------------------------------------------------------------------------
            // HASHSET (Unique, unordered)
            //------------------------------------------------------------------------
            Set<String> hs = new HashSet<>();
            hs.add("A");
            hs.add("B");
            hs.add("A");             // duplicate ignored
            hs.remove("B");
            hs.contains("A");
            hs.size();
            System.out.println(hs);   // OUTPUT


            //------------------------------------------------------------------------
            // LINKEDHASHSET (Unique + maintains insertion order)
            //------------------------------------------------------------------------
            Set<Integer> lhs = new LinkedHashSet<>();
            lhs.add(10);
            lhs.add(5);
            lhs.add(10);
            System.out.println(lhs);  // OUTPUT


            //------------------------------------------------------------------------
            // TREESET (Sorted + Unique)
            //------------------------------------------------------------------------
            Set<Integer> ts = new TreeSet<>();
            ts.add(20);
            ts.add(5);
            ts.add(15);
            ts.add(5);
            System.out.println(ts);   // OUTPUT (sorted)


            //------------------------------------------------------------------------
            // HASHMAP (Key-Value, unordered)
            //------------------------------------------------------------------------
            Map<String, Integer> map = new HashMap<>();
            map.put("A", 10);          // insert
            map.put("B", 20);
            map.put("A", 30);          // update A
            map.get("A");              // value for key
            map.containsKey("B");
            map.containsValue(20);
            map.remove("B");           // remove key
            map.size();
            map.isEmpty();

            for (String key : map.keySet()) { }
            for (Integer val : map.values()) { }
            for (Map.Entry<String, Integer> e : map.entrySet()) { }

            System.out.println(map);   // OUTPUT


            //------------------------------------------------------------------------
            // LINKEDHASHMAP (Maintains insertion order)
            //------------------------------------------------------------------------
            Map<Integer, String> lhm = new LinkedHashMap<>();
            lhm.put(1, "One");
            lhm.put(2, "Two");
            lhm.put(3, "Three");
            System.out.println(lhm);


            //------------------------------------------------------------------------
            // TREEMAP (Sorted by keys)
            //------------------------------------------------------------------------
            Map<Integer, String> tm = new TreeMap<>();
            tm.put(3, "C");
            tm.put(1, "A");
            tm.put(2, "B");
            System.out.println(tm); // sorted output


            //------------------------------------------------------------------------
            // ITERATORS (Traversal)
            //------------------------------------------------------------------------
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }

            // ListIterator (Forward + Backward)
            ListIterator<String> lit = list.listIterator();
            while (lit.hasNext()) {
                System.out.println(lit.next());
            }

            while (lit.hasPrevious()) {
                System.out.println(lit.previous());
            }


            //------------------------------------------------------------------------
            // COLLECTIONS CLASS (Utility Methods)
            //------------------------------------------------------------------------
            List<Integer> nums = new ArrayList<>(Arrays.asList(5, 2, 9, 1));
            Collections.sort(nums);          // ascending
            Collections.reverse(nums);       // descending
            Collections.shuffle(nums);       // random order
            Collections.max(nums);           // largest
            Collections.min(nums);           // smallest
            Collections.frequency(nums, 2);  // count occurrences
            System.out.println(nums);
        }
