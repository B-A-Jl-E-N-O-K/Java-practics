package pract3;

import java.util.*;
import java.util.concurrent.Semaphore;
public class SemaphSet<E> implements Set<E> {

    private Set<E> set;

    private static final Semaphore semaphore = new Semaphore(1);

    public SemaphSet()
    {
        set = new HashSet<>();
    }

    @Override
    public boolean isEmpty()
    {
        boolean res = false;
        try {
            semaphore.acquire();
            res = set.isEmpty();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return res;
    }

    @Override
    public int size()
    {
        int res = -1;
        try {
            semaphore.acquire();
            res = set.size();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return res;
    }

    @Override
    public boolean contains(Object o)
    {
        boolean res = false;
        try {
            semaphore.acquire();
            res = set.contains(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return res;
    }

    @Override
    public Iterator<E> iterator()
    {
        Iterator<E> res = null;

        try {
            semaphore.acquire();
            res = set.iterator();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        res = set.iterator();
        return res;
    }

    @Override
    public Object[] toArray()
    {
        Object[] res = null;

        try {
            semaphore.acquire();
            res = set.toArray();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public <T> T[] toArray(T[] a)
    {
        T[] res;

        try {
            semaphore.acquire();
            res = set.toArray(a);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        res = set.toArray(a);
        return res;
    }

    @Override
    public boolean add(E inp)
    {
        boolean res = false;

        try {
            semaphore.acquire();
            res = set.add(inp);
            semaphore.release();
        } catch (InterruptedException e) {
            System.err.println(e.toString());
        }

        return res;
    }

    @Override
    public boolean remove(Object o)
    {
        boolean res = false;

        try {
            semaphore.acquire();
            res = set.remove(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return res;
    }

    @Override
    public boolean containsAll(Collection<?> c)
    {
        boolean res = false;

        try {
            semaphore.acquire();
            res = set.containsAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return res;
    }

    @Override
    public boolean addAll(Collection<? extends E> c)
    {
        boolean res = false;

        try {
            semaphore.acquire();
            res = set.addAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return res;
    }

    @Override
    public boolean retainAll(Collection<?> c)
    {
        boolean res = false;

        try {
            semaphore.acquire();
            res = set.retainAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return res;
    }

    @Override
    public boolean removeAll(Collection<?> c)
    {
        boolean res = false;

        try {
            semaphore.acquire();
            res = set.removeAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return res;
    }

    @Override
    public void clear()
    {

        try {
            semaphore.acquire();
            set.clear();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        set.clear();
    }

    @Override
    public boolean equals(Object o)
    {
        boolean res = false;

        try {
            semaphore.acquire();
            res = set.equals(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return res;
    }
    @Override
    public int hashCode()
    {
        int res = -1;

        try {
            semaphore.acquire();
            res = set.hashCode();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return res;
    }

}
