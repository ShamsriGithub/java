class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        float j = 0;
        float k = 0;
        float l = 0;
        int size = arr.size();
        for (int i = 0; i < size; i++) {
            if (arr.get(i) > 0) {
                j++;
            } else if (arr.get(i) < 0) {
                k++;
            } else {
                l++;
            }
        }
        
        System.out.println(j/size);
        System.out.println(k/size);
        System.out.println(l/size);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        ArrayList<Integer> arr 
            = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
