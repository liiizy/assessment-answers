import java.util.*;

class Example {
    public List<Integer> removeBigNumbers(List<Integer> data) {
        if (data == null) {
            return new ArrayList<>();
        }

        Iterator<Integer> iterator = data.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i == null || i > 10) {
                iterator.remove();
            }
        }
        return data;
    }
    public static void main(String[] args) {
        Example ex = new Example();
        List<Integer> test = new ArrayList<>();
        test.add(100);
        test.add(10);
        test.add(-2);
        test.add(11);
        test.add(5);
        test.add(null);
        List<Integer> nullList = null;
        System.out.println("Test data output: " + ex.removeBigNumbers(test));
        System.out.println("Null list output: " + ex.removeBigNumbers(nullList));
	}
}


