package com.company;

public interface Iter {
    boolean hasNext();
    int next();
}

class Collection {
    private static Number[] arr;

    Collection(Number[] arr) {
            this.arr = arr;
    }

    public class FirstIterator implements Iter {
        private int i = 0;

        @Override
        public boolean hasNext() {
            return i < arr.length;
        }
        @Override
        public int next() {
            return (int) arr[i++];
        }
    }

    public FirstIterator createFirstIterator() {
        return new FirstIterator();
    }

    public class SecondIterator implements Iter {
        private int i = arr.length - 1;

        @Override
        public boolean hasNext() {
            return i >= 0;
        }
        @Override
        public int next() {
            i = i - 2;
            return (int) arr[i + 2];
        }
    }

    public SecondIterator createSecondIterator() {
        return new SecondIterator();
    }
}



