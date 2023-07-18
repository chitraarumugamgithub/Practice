public class Duplicateword {
    public static void main(String[] args) {
        String string = "Big black big bug bit a big black dog on his big black nose";
        int count;

        string=string.toLowerCase();
        String strArr[]=string.split(" ");

        for(int i=0;i< strArr.length;i++) {
            count = 1;
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].equals(strArr[j])) {
                    count++;
                    strArr[j] = "0";
                }
            }


                if (count > 1 && strArr[i] != "0")
                System.out.println(strArr[i]+count);


        }
    }
}
