// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    private List<Integer> ls = new ArrayList<>();
    private int i = 0;

	public PeekingIterator(Iterator<Integer> iter) {
	    while (iter.hasNext()) {
            ls.add(iter.next());
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return ls.get(i);
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    return ls.get(i++);
	}
	
	@Override
	public boolean hasNext() {
	    return i < ls.size();
	}
}