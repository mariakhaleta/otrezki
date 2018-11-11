import java.io.File;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        File file = new File("/Users/MariaKhaleta/Desktop/samsung/otrezki1/src/test.txt");

//        List<String> strings = new ArrayList<String>();
//        Scanner sc = null;
//
//        try {
//
//            sc = new Scanner(file);
//
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                strings.add(line);
//                System.out.println(line); //печать строки в стандартный вывод
//            }
//
//            int size = strings.size();
//
//            String[] myArray = {}; // конвертируем ArrayList в массив
//            String[] otrezkiN = new String[myArray.length];
//            int n;
//            myArray = strings.toArray(new String[strings.size()]);
//
//            for(int i = 0; i<myArray.length; i++) {
//                if (i % 2 == 0) {
//                    //System.out.printf(myArray[i]);
//                    myArray[i] = otrezkiN[i];
//                    System.out.println(otrezkiN[i]);
//                }
//            }
//            for(int i = 0; i<otrezkiN.length; i++) {
//
//                System.out.println(otrezkiN);
//            }
//
//            for(int i = 0; i<myArray.length; i++){
//                if (i%2 == 1)
//                    System.out.printf(myArray[i]);
//            }

//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        finally {
//            sc.close();
//        }

        // String []stringsArray = (String []) strings.toArray();

        int countotrezok = 17;
        String otrezki = "43 57 34 39 15 1 53 42 58 32 42 21 9 54 2 42 17";
        String[] otrezkiarray = otrezki.split(" ");

        Integer[] intarray = new Integer[otrezkiarray.length];
        int i=0;
        for(String str:otrezkiarray) {
            intarray[i] = Integer.parseInt(str.trim());
            i++;
        }



        if (countotrezok == 0) {
            System.out.println("0");
        }

        if (countotrezok == 1) {
            System.out.println("0");
        }

        if (countotrezok == 2) {
            funcfor2number(countotrezok, intarray);
        }

        if (countotrezok > 2){
            System.out.println(funcmorenumber(countotrezok, intarray));
        }

    }

    static int funcfor2number(int countotrezok, Integer[] otrezoki) {

        int unswer;
        if(otrezoki[0] == otrezoki[1]){
            unswer = otrezoki[0];
        }
        else unswer = 0;
        return unswer;
    }

    static int funcmorenumber(int countotrezok, Integer[] otrezoki) {

        int result = 0;
        int sum=0;
        int maxrez = 0;

            for(int i=1; i<otrezoki.length; i++) {
                if (otrezoki[0] != otrezoki[i]) {
                    for (i = 0; i < otrezoki.length; i++) {
                        sum = sum + otrezoki[i];
                    }
                    maxrez = sum / 2;
                    System.out.println(maxrez);
                    //System.out.println(maxrez);

                    //checking for big number
                    for (i = 0; i < otrezoki.length; i++) {
                        if (otrezoki[i] > maxrez) {
                            result = 0;
                        }
                    }

                    //
                    int tmp = 0;
                    int sum1 = 0;
                    for (i = 0; i < otrezoki.length; i++)
                        if (maxrez == otrezoki[i]) {

                            for (i = 0; i < otrezoki.length; i++)
                            tmp = otrezoki[i];
                            otrezoki[i] = otrezoki[i+1];
                            otrezoki[i] = tmp;

                            for (i = 0; i < otrezoki.length-1; i++){
                                sum1 = sum1 + otrezoki[i];
                            }
                            System.out.println(sum1);
                            //otrezoki[i] + otrezoki[i + 1] = maxrez;
                        }
                }

                //checking if all element are the same
                else {
                    for (i = 0; i < otrezoki.length; i++) {
                        sum = sum + otrezoki[i];
                    }
                    result = sum/2;
                }

            }
            return result;
        }

        static int max_equal_sum(Integer[] otrezki){

//            MyHashMap D = new MyHashMap(0,0);
//
//            for (int i:otrezki) {
//
//                MyHashMap D2 = new MyHashMap();
//                D2 = D.copy(D, D2);
//
//                int d, s, s2;
//                d = D.getValue();
//                s = D.getKey();
//
//                for (int m=0; m<d; i++ ){
//                    for (int j=0; j<s; i++ ){
//                        s2 = i+s;
//                        //D2.setKey(abs(d-i))= D2.setValue();
//                        D=D2;
//                       // return D/2;
//                    }
//                }
//            }

            FastHashMap D = new FastHashMap();
            return 0;
        }

}




