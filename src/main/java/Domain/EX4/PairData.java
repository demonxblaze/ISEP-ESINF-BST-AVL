package Domain.EX4;

import java.util.Objects;

public class PairData<K extends Comparable,V> implements Comparable<PairData<K,V>> {
    private K key;
    private V value;

    public PairData(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return this.key;
    }

    public V getValue(){
        return this.value;
    }

    public void setKey(K key){
        this.key = key;
    }

    public void setValue(V value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PairData<?, ?> pairData = (PairData<?, ?>) o;
        return Objects.equals(key, pairData.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public int compareTo(PairData o) {
        return 0;
    }

    @Override
    public String toString() {
        return "PairData{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
