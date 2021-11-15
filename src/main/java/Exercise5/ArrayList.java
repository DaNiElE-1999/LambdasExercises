package Exercise5;
import java.util.*;

public class ArrayList <E> {
    private ArrayList<String> arrayList;

    public ArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList() {
        this.arrayList = new ArrayList<String>();
    }

    public void add(String s) {
        arrayList.add(s);
    }

    public void remove(String s) {
        arrayList.remove(s);
    }

    public void remove(int index) {
        arrayList.remove(index);
    }

    public String get(int index) {
        return arrayList.get(index);
    }

    public int size() {
        return arrayList.size();
    }

    public void clear() {
        arrayList.clear();
    }

    public boolean contains(String s) {
        return arrayList.contains(s);
    }

    public int indexOf(String s) {
        return arrayList.indexOf(s);
    }

    public void add(int index, String s) {
        arrayList.add(index, s);
    }

    public void set(int index, String s) {
        arrayList.set(index, s);
    }

    public String toString() {
        return arrayList.toString();
    }


    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }
}
