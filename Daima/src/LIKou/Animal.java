package LIKou;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Animal {
    public class CatDogAsylum {
        public ArrayList<Integer> asylum(int[][] ope) {
            Queue<Integer> dog = new LinkedList<>();
            Queue<Integer> cat = new LinkedList<>();
            Queue<Integer> all = new LinkedList<>();
            ArrayList<Integer> animal = new ArrayList<Integer>();
            for (int i = 0; i < ope.length; i++) {
                if (ope[i][0] == 1) {
                    all.add(ope[i][1]);
                    if (ope[i][1] > 0) {
                        dog.add(ope[i][1]);
                    } else if (ope[i][1] < 0) {
                        cat.add(ope[i][1]);
                    }
                } else if (ope[i][0] == 2) {
                    if (ope[i][1] == 0) {
                        if (!all.isEmpty()) {
                            int tmp = all.poll();
                            animal.add(tmp);
                            if (tmp > 0) {
                                dog.poll();
                            } else {
                                cat.poll();
                            }
                        }
                    } else if (ope[i][1] > 0) {
                        if (!dog.isEmpty()) {
                            int tmp = dog.poll();
                            animal.add(tmp);
                            all.remove(tmp);
                        }
                    } else {
                        if (!cat.isEmpty()) {
                            int tmp = cat.poll();
                            animal.add(tmp);
                            all.remove(tmp);
                        }
                    }

                }
            }
            return animal;
        }
    }
}

