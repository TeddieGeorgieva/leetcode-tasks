public class DefangingIPAddress {

    public static String defangIPaddr(String address) {

        String[] input = address.split("");
        String[] arr = new String[input.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input[i];
        }
        String[] res = new String[input.length + 6];

        res[0] = arr[0];
        int count = 1;
       

        for (int i = 1; i <= res.length - 1; i++) {
           
                if (arr[count].equals(".")) {
                    String temp = input[count];
                    res[i] = "[";
                    res[i + 1] = temp;
                    res[i + 2] = "]";
                    i += 2;
                    count++;

                } else {
                    res[i] = arr[count];
                    count++;
                }
                
        }
        StringBuilder builder = new StringBuilder();
        for(String s : res) {
            builder.append(s);
        }
        String str = builder.toString();
        return str;


    }
    public static void main(String[] args) {
        String input = "255.100.50.0";
        System.out.println(defangIPaddr(input));
    }

}